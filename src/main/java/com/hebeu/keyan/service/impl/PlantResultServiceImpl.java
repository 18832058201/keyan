package com.hebeu.keyan.service.impl;

import com.hebeu.keyan.dao.EPlantMapper;
import com.hebeu.keyan.dao.RPersonProjectResultMapper;
import com.hebeu.keyan.dao.customMapper.EPlantMapperCustom;
import com.hebeu.keyan.po.EPlant;
import com.hebeu.keyan.po.EPlantExample;
import com.hebeu.keyan.po.RPersonProjectResult;
import com.hebeu.keyan.po.RPersonProjectResultExample;
import com.hebeu.keyan.po.customPO.EPlantCustom;
import com.hebeu.keyan.service.PersonListService;
import com.hebeu.keyan.service.PlantResultService;
import com.hebeu.keyan.utils.FileHandle;
import com.hebeu.keyan.utils.SchoolNumberGenerate;
import com.hebeu.keyan.utils.UUIDUtils;
import com.hebeu.keyan.vo.PersonListVO;
import com.hebeu.keyan.vo.PlantResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/8/20.
 */
@Service
public class PlantResultServiceImpl implements PlantResultService{
    @Autowired
    private EPlantMapperCustom ePlantMapperCustom;
    @Autowired
    private PersonListService personListService;
    @Autowired
    private SchoolNumberGenerate schoolNumberGenerate;
    @Autowired
    private EPlantMapper plantMapper;
    @Autowired
    private RPersonProjectResultMapper rPersonProjectResultMapper;
    @Override
    public List<EPlantCustom> findPlantResultListByWorkNum(String workNum) {
        return ePlantMapperCustom.selectPlantByWorkNum(workNum);
    }

    @Override
    public void insertPlantResult(PlantResultVO plantResultVO) {
        if (this.plantNameIsExisted(plantResultVO)) {
            throw new RuntimeException("该动植物名称已存在");
        }
        try {

            List<PersonListVO> personListVOList = plantResultVO.getPersonListVOList();
            /*start：设置 著作成果 的属性值并保存到数据库*/

            if ("submit".equals(plantResultVO.getSubmitType())) {
                schoolNumberGenerate.setSchoolNumber(plantResultVO);                         //提交时生成 著作成果 编号
                plantResultVO.setAuditStatusId(2);                                           //保存时将状态设置为2 ，即待学院审核状态
            } else if ("save".equals(plantResultVO.getSubmitType())) {
                plantResultVO.setAuditStatusId(1);                                           //保存时将状态设置为1 ，即未提交状态
            }
            //下边设置保存提交都相同的属性
            plantResultVO.setPlantId(UUIDUtils.getUUID());                                 //生成 著作成果 主键
            //取集合中第一个为负责人并设置到 著作成果 信息
            //-3表示校外人员，-2表示学生，其他情况表示校内教师
            if ("-3".equals(personListVOList.get(0).getWorkNum())) {
                plantResultVO.setLeader("校外人员：" + personListVOList.get(0).getWorkName());
            } else if ("-2".equals(personListVOList.get(0).getWorkNum())) {
                plantResultVO.setLeader("学生：" + personListVOList.get(0).getWorkName());
            } else {
                plantResultVO.setLeader(personListVOList.get(0).getWorkName() + "(" + personListVOList.get(0).getWorkNum() + ")");
            }
            plantResultVO.setAttachment(FileHandle.fileUpload(FileHandle.BOOKRESULT, plantResultVO.getFile(), plantResultVO.getPlantId())); //保存文件并得到文件名
            plantResultVO.setPersonList(plantResultVO.getPersonListVO().getWorkName());          //设置人员列表字符串
            plantResultVO.setInsertTime(new Date());                                         //设置当前系统时间为插入时间
            plantResultVO.setLastTime(new Date());                                           //设置当前系统时间为最后更新时间
            System.out.println(plantResultVO.toString());
            //eBookMapper.insertSelective(plantResultVO);                                   //向数据库插入 著作成果 数据
            plantMapper.insertSelective(plantResultVO);
            /*end：设置 著作成果 的属性值并保存到数据库*/

            /*start：向人员项目关系表中插数据*/
            //创建关系表对象，需要初始化 （项目或成果id，类型，项目或成果名称，关键性时间）四个属性值
            RPersonProjectResult r = new
                    RPersonProjectResult(plantResultVO.getPlantId(), 16, plantResultVO.getPlantName(), plantResultVO.getEmpowerDate());
            personListService.insertRPersonProjectResult(personListVOList, r);        //传入人员列表和对应项目中的属性对象
            /*end：向人员项目关系表中插数据*/

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("插入数据失败");
        }
    }

    @Override
    public EPlantCustom findPlantResultById(String plantId) {

        return ePlantMapperCustom.selectPlantResultInfoById(plantId);
    }

    @Override
    public List<PersonListVO> findPersonListByPlantId(String plantId) {

        return ePlantMapperCustom.selectPersonListByPlantId(plantId);
    }

    @Override
    public void updatePlantResult(PlantResultVO plantResultVO) {
        if (this.plantNameIsExisted(plantResultVO)) {
            throw new RuntimeException("该动植物名称已存在");
        }
        try {
            //通过 著作成果 信息中的人员字符串得到人员列表集合
            List<PersonListVO> personListVOList = plantResultVO.getPersonListVOList();
            /*start：设置 著作成果 的属性值并保存到数据库*/
            //判断操作类型，为submit提交就 生成校内编号，并且将审核状态设置为1
            if ("submit".equals(plantResultVO.getSubmitType())) {
                schoolNumberGenerate.setSchoolNumber(plantResultVO);                         //提交时生成 著作成果 编号
                plantResultVO.setAuditStatusId(2);                                           //保存时将状态设置为2 ，即待学院审核状态
            } else if ("save".equals(plantResultVO.getSubmitType())) {
                plantResultVO.setAuditStatusId(1);                                           //保存时将状态设置为1 ，即未提交状态
            }
            //下边设置保存提交都相同的属性
            //取集合中第一个为负责人并设置到 著作成果 信息
            //-3表示校外人员，-2表示学生，其他情况表示校内教师
            if ("-3".equals(personListVOList.get(0).getWorkNum())) {
                plantResultVO.setLeader("校外人员：" + personListVOList.get(0).getWorkName());
            } else if ("-2".equals(personListVOList.get(0).getWorkNum())) {
                plantResultVO.setLeader("学生：" + personListVOList.get(0).getWorkName());
            } else {
                plantResultVO.setLeader(personListVOList.get(0).getWorkName() + "(" + personListVOList.get(0).getWorkNum() + ")");
            }
            plantResultVO.setAttachment(FileHandle.fileUpload(FileHandle.BOOKRESULT, plantResultVO.getFile(), plantResultVO.getPlantId())); //保存文件并得到文件名
            plantResultVO.setPersonList(plantResultVO.getPersonListVO().getWorkName());          //设置人员列表字符串
            plantResultVO.setLastTime(new Date());                                         //设置当前系统时间为最后更新时间
            System.out.println(plantResultVO.toString());
            plantMapper.updateByPrimaryKeySelective(plantResultVO);                        //更新 著作成果 数据
            /*end：设置 著作成果 的属性值并保存到数据库*/
            /*start：删除人员项目成果关系表中需此著作成果id的所有数据*/
            RPersonProjectResultExample rPersonProjectResultExample = new RPersonProjectResultExample();
            RPersonProjectResultExample.Criteria criteria = rPersonProjectResultExample.createCriteria();
            criteria.andIdEqualTo(plantResultVO.getPlantId());
            rPersonProjectResultMapper.deleteByExample(rPersonProjectResultExample);
            /*end：删除人员项目成果关系表中需此著作成果id的所有数据*/

            /*start：向人员项目关系表中插数据*/
            //创建关系表对象，需要初始化 （项目或成果id，类型，项目或成果名称，关键性时间）四个属性值
            RPersonProjectResult r = new
                    RPersonProjectResult(plantResultVO.getPlantId(), 16, plantResultVO.getPlantName(), plantResultVO.getEmpowerDate());
            personListService.insertRPersonProjectResult(personListVOList, r);        //传入人员列表和对应项目中的属性对象
            /*end：向人员项目关系表中插数据*/

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("插入数据失败");
        }
    }

    @Override
    public boolean plantNameIsExisted(PlantResultVO plantResultVO) {
        if(plantResultVO==null){
            return false;
        }
        EPlantExample ePlantExample = new EPlantExample();
        EPlantExample.Criteria criteria = ePlantExample.createCriteria();
        criteria.andPlantNameEqualTo(plantResultVO.getPlantName());
        if(plantResultVO.getPlantId()!=null){
            criteria.andPlantIdNotEqualTo(plantResultVO.getPlantId());
        }

        return plantMapper.selectByExample(ePlantExample).size()>0;
    }

    @Override
    public void deleteBookResultByPlantId(String plantId) {
        try {
            //先查询出要删除的著作成果
            EPlant ePlant = plantMapper.selectByPrimaryKey(plantId);
            //从e_book表删除著作成果
            plantMapper.deleteByPrimaryKey(plantId);
            //删除人员项目成果关系表的数据
            RPersonProjectResultExample rPersonProjectResultExample = new RPersonProjectResultExample();
            RPersonProjectResultExample.Criteria criteria = rPersonProjectResultExample.createCriteria();
            criteria.andIdEqualTo(plantId);
            rPersonProjectResultMapper.deleteByExample(rPersonProjectResultExample);
            //删除项目相关的附件，最后进行删除附件操作，如果前面删除项目失败就不会删除附件
            FileHandle.deleteFile(FileHandle.BOOKRESULT, ePlant.getAttachment());
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("删除动植物新品种失败");
        }
    }
}
