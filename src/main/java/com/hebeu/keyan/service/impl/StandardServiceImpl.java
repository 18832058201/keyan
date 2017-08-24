package com.hebeu.keyan.service.impl;

import com.hebeu.keyan.dao.EStandardMapper;
import com.hebeu.keyan.dao.RPersonProjectResultMapper;
import com.hebeu.keyan.dao.customMapper.EStandardMapperCustom;
import com.hebeu.keyan.po.EStandard;
import com.hebeu.keyan.po.EStandardExample;
import com.hebeu.keyan.po.RPersonProjectResult;
import com.hebeu.keyan.po.RPersonProjectResultExample;
import com.hebeu.keyan.po.customPO.EStandardCustom;
import com.hebeu.keyan.service.PersonListService;
import com.hebeu.keyan.service.StandardResultService;
import com.hebeu.keyan.utils.FileHandle;
import com.hebeu.keyan.utils.SchoolNumberGenerate;
import com.hebeu.keyan.utils.UUIDUtils;
import com.hebeu.keyan.vo.PersonListVO;
import com.hebeu.keyan.vo.StandardResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * 作者：张彤
 * 时间：2017/8/11 17:43
 * 描述：标准管理的业务处理实现类
 */
@Service
public class StandardServiceImpl implements StandardResultService{
    private final EStandardMapper eStandardMapper;
    private final EStandardMapperCustom eStandardMapperCustom;
    private final SchoolNumberGenerate schoolNumberGenerate;
    private final PersonListService personListService;
    private final RPersonProjectResultMapper rPersonProjectResultMapper;
    @Autowired
    public StandardServiceImpl(EStandardMapper eStandardMapper,EStandardMapperCustom eStandardMapperCustom,SchoolNumberGenerate schoolNumberGenerate,PersonListService personListService,RPersonProjectResultMapper rPersonProjectResultMapper){
        this.eStandardMapper = eStandardMapper;
        this.eStandardMapperCustom = eStandardMapperCustom;
        this.schoolNumberGenerate = schoolNumberGenerate;
        this.personListService = personListService;
        this.rPersonProjectResultMapper = rPersonProjectResultMapper;
    }



    /**
     * 通过工号查询标准管理集合
     * @param workNum
     * @return
     */
    @Override
    public List<EStandardCustom> findStandardListByWorkNum(String workNum) {
        return eStandardMapperCustom.selectStandardByWorkNum(workNum);
    }

    /**
     * 插入记录（包括保存和提交）
     * @param standardResultVO 项目值对象
     */
    @Override
    public void insertStandardResult(StandardResultVO standardResultVO) {
        if (this.standNumberIsExisted(standardResultVO)){
            throw new RuntimeException("该著作成果名称已存在");
        }
        try {
            //通过标准管理信息中的人员字符串得到人员列表
            List<PersonListVO> personListVOList = standardResultVO.getPersonListVOList();
            /*start：设置标准管理的属性值并保存到数据库*/
            //判断操作类型，为submit提交生成校内编号，并且将审核状态设置为1
            if (standardResultVO.getSubmitType().equals("submit")){
                schoolNumberGenerate.setSchoolNumber(standardResultVO);  //提交时生成标准管理编号
                standardResultVO.setAuditStatusId(2);  //保存时将状态设置为2，即待学院审核状态
            }else if(standardResultVO.getSubmitType().equals("save")){
                standardResultVO.setAuditStatusId(1);  //保存时将状态设置为1，即未提交状态
            }
            //下边设置提交和保存相同的属性
            standardResultVO.setStandardId(UUIDUtils.getUUID());  //生成标准管理主键
            //取集合中第一个为负责人并设置到标准管理
            //-3表示校外人员，-2表示学生，其他情况表示校内学生
            if (personListVOList.get(0).getWorkNum().equals("-3")){
                standardResultVO.setLeader("校外人员："+ personListVOList.get(0).getCollegeName());
            }else if(personListVOList.get(0).getWorkNum().equals("-2")){
                standardResultVO.setLeader("学生："+ personListVOList.get(0).getWorkName());
            }else {
                standardResultVO.setLeader(personListVOList.get(0).getWorkName() + "(" + personListVOList.get(0).getWorkNum() + ")");
            }
            standardResultVO.setAttachment(FileHandle.fileUpload(FileHandle.STANDARDRESULT, standardResultVO.getFile(), standardResultVO.getStandardId()));  //保存文件并得到文件名
            standardResultVO.setPersonList(standardResultVO.getPersonListVO().getWorkName());  //设置人员列表字符串
            standardResultVO.setInsertTime(new Date());  //设置当前系统时间为录入时间
            standardResultVO.setLastTime(new Date());  //设置当前系统时间为最后更新时间
            eStandardMapper.insertSelective(standardResultVO);  //向数据库插入标准管理记录
            /*end 设置标准管理的属性值并保存到数据库*/

            /*start 向人员项目关系表向中插入数据*/
            //创建关系表对象，需要初始化（项目或成果id，类型，项目或成果名称，关键性时间）四个属性值
            RPersonProjectResult r = new RPersonProjectResult(standardResultVO.getStandardId(), 17, standardResultVO.getStandNumber(),standardResultVO.getImplementDate());
            personListService.insertRPersonProjectResult(personListVOList,r);  //传入人员列表和对应项目中的属性对象
            /*end 向人员项目关系表向中插入数据*/
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("插入数据失败");
        }

    }

    /**
     * 通过标准管理id查询详细信息
     *
     * @param standardId 标准管理id
     * @return 返回标准管理对象
     */
    @Override
    public EStandardCustom findStandardResultById(String standardId) {
        return eStandardMapperCustom.selectStandardResultInfoById(standardId);
    }

    /**
     * 通过标准管理id查询标准管理的人员列表的详细信息
     *
     * @param standardId 标准管理id
     * @return 返回标准管理的人员列表对象
     */
    @Override
    public List<PersonListVO> findPersonListByStandardId(String standardId) {
        return eStandardMapperCustom.selectPersonListByStandId(standardId);
    }

    /**
     * 编辑项目
     * @param standardResultVO 项目值对象
     */
    @Override
    public void updateStandardResult(StandardResultVO standardResultVO) {
        if (this.standNumberIsExisted(standardResultVO)){
            throw new RuntimeException("该著作成果名称已存在");
        }
        try {
            //通过标准管理信息中的人员字符串得到人员列表
            List<PersonListVO> personListVOList = standardResultVO.getPersonListVOList();
            /*start：设置标准管理的属性值并保存到数据库*/
            //判断操作类型，为submit提交生成校内编号，并且将审核状态设置为1
            if (standardResultVO.getSubmitType().equals("submit")){
                schoolNumberGenerate.setSchoolNumber(standardResultVO);  //提交时生成标准管理编号
                standardResultVO.setAuditStatusId(2);  //保存时将状态设置为2，即待学院审核状态
            }else if(standardResultVO.getSubmitType().equals("save")){
                standardResultVO.setAuditStatusId(1);  //保存时将状态设置为1，即未提交状态
            }
            //下边设置提交和保存相同的属性
            //取集合中第一个为负责人并设置到标准管理
            //-3表示校外人员，-2表示学生，其他情况表示校内学生
            if (personListVOList.get(0).getWorkNum().equals("-3")){
                standardResultVO.setLeader("校外人员："+ personListVOList.get(0).getCollegeName());
            }else if(personListVOList.get(0).getWorkNum().equals("-2")){
                standardResultVO.setLeader("学生："+ personListVOList.get(0).getWorkName());
            }else {
                standardResultVO.setLeader(personListVOList.get(0).getWorkName() + "(" + personListVOList.get(0).getWorkNum() + ")");
            }
            standardResultVO.setAttachment(FileHandle.fileUpload(FileHandle.STANDARDRESULT, standardResultVO.getFile(), standardResultVO.getStandardId()));  //保存文件并得到文件名
            standardResultVO.setPersonList(standardResultVO.getPersonListVO().getWorkName());  //设置人员列表字符串
            standardResultVO.setLastTime(new Date());  //设置当前系统时间为最后更新时间
            eStandardMapper.updateByPrimaryKeySelective(standardResultVO);  //向数据库插入标准管理记录
            /*end 设置标准管理的属性值并保存到数据库*/
            /*start：删除人员项目成果关系表中需此鉴定成果id的所有数据*/
            RPersonProjectResultExample rPersonProjectResultExample = new RPersonProjectResultExample();
            RPersonProjectResultExample.Criteria criteria = rPersonProjectResultExample.createCriteria();
            criteria.andIdEqualTo(standardResultVO.getStandardId());
            rPersonProjectResultMapper.deleteByExample(rPersonProjectResultExample);
            /*end：删除人员项目成果关系表中需此鉴定成果id的所有数据*/
            /*start 向人员项目关系表向中插入数据*/
            //创建关系表对象，需要初始化（项目或成果id，类型，项目或成果名称，关键性时间）四个属性值
            RPersonProjectResult r = new RPersonProjectResult(standardResultVO.getStandardId(), 17, standardResultVO.getStandNumber(),standardResultVO.getImplementDate());
            personListService.insertRPersonProjectResult(personListVOList,r);  //传入人员列表和对应项目中的属性对象
            /*end 向人员项目关系表向中插入数据*/
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("编辑数据失败");
        }
    }

    /**
     * 检查是否存在同标准号的标准管理
     *
     * @param standardResultVO 项目对象
     * @return 存在返回true，不存在返回false
     */
    @Override
    public boolean standNumberIsExisted(StandardResultVO standardResultVO) {
        //传入的标准管理名称为空时返回false表示不存在
        if (standardResultVO.getStandNumber() == null){
            return false;
        }
        EStandardExample eStandardExample = new EStandardExample();
        EStandardExample.Criteria criteria = eStandardExample.createCriteria();
        criteria.andStandNumberEqualTo(standardResultVO.getStandNumber());
        //排除自身进行查重
        if (standardResultVO.getStandardId() != null){
            criteria.andStandardIdNotEqualTo(standardResultVO.getStandardId());
        }
        return eStandardMapper.selectByExample(eStandardExample).size() > 0;
    }

    /**
     * 删除指定id的标准管理
     * @param standardId 标准管理id
     */
    @Override
    public void deleteStandardResultByStandardId(String standardId) {
        try {
            //先查询出要删除的著作成果
            EStandard eStandard = eStandardMapper.selectByPrimaryKey(standardId);
            //从e_standard表中删除标准管理
            eStandardMapper.deleteByPrimaryKey(standardId);
            //删除人员项目成果关系表的数据
            RPersonProjectResultExample rPersonProjectResultExample = new RPersonProjectResultExample();
            RPersonProjectResultExample.Criteria criteria = rPersonProjectResultExample.createCriteria();
            criteria.andIdEqualTo(standardId);
            rPersonProjectResultMapper.deleteByExample(rPersonProjectResultExample);
            //删除项目相关的附件，最后进行删除附件操作，如果前面删除项目失败就不会删除附件
            FileHandle.deleteFile(FileHandle.STANDARDRESULT, eStandard.getAttachment());
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("删除标准管理失败");
        }

    }
}
