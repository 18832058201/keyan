package com.hebeu.keyan.service.impl;

import com.hebeu.keyan.dao.ERewardMapper;
import com.hebeu.keyan.dao.RPersonProjectResultMapper;
import com.hebeu.keyan.dao.customMapper.ERewardMapperCustom;
import com.hebeu.keyan.po.EReward;
import com.hebeu.keyan.po.ERewardExample;
import com.hebeu.keyan.po.RPersonProjectResult;
import com.hebeu.keyan.po.RPersonProjectResultExample;
import com.hebeu.keyan.po.customPO.ERewardCustom;
import com.hebeu.keyan.service.PersonListService;
import com.hebeu.keyan.service.RewardResultService;
import com.hebeu.keyan.utils.FileHandle;
import com.hebeu.keyan.utils.SchoolNumberGenerate;
import com.hebeu.keyan.utils.UUIDUtils;
import com.hebeu.keyan.vo.PersonListVO;
import com.hebeu.keyan.vo.RewardResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * 作者：冯嘉龙
 * 时间：2017/8/9  18:16
 * 描述：
 */
@Service
public class RewardResultServiceImpl implements RewardResultService{
    private final ERewardMapper eRewardMapper;
    private final SchoolNumberGenerate schoolNumberGenerate;
    private final ERewardMapperCustom eRewardMapperCustom;
    private final RPersonProjectResultMapper rPersonProjectResultMapper;
    private final PersonListService personListService;

    @Autowired
    public RewardResultServiceImpl(ERewardMapper eRewardMapper,SchoolNumberGenerate schoolNumberGenerate,ERewardMapperCustom eRewardMapperCustom,RPersonProjectResultMapper rPersonProjectResultMapper,PersonListService personListService){
        this.eRewardMapper = eRewardMapper;
        this.schoolNumberGenerate = schoolNumberGenerate;
        this.eRewardMapperCustom = eRewardMapperCustom;
        this.personListService = personListService;
        this.rPersonProjectResultMapper = rPersonProjectResultMapper;
    }

    /**
     * 通过工号查询获奖成果集合
     *
     * @param workNum 指定查询的工号
     * @return 返回指定工号的获奖成果集合
     */
    public List<ERewardCustom> findRewardResultListByWorkNum(String workNum){
        return eRewardMapperCustom.selectRewardResultByWorkNum(workNum);
    }

    /**
     * 插入获奖成果（包括保存和提交）
     *
     * @param rewardResultVO 项目值对象
     */
    @Override
    public void insertRewardResult(RewardResultVO rewardResultVO) {
        if (this.rewardNameIsExisted(rewardResultVO)) {
            throw new RuntimeException("输入的名称已存在，请重新输入");
        }
        try {
            //通过 获奖成果 信息中的人员字符串得到人员列表集合
            List<PersonListVO> personListVOList = rewardResultVO.getPersonListVOList();
            /*start：设置 获奖成果 的属性值并保存到数据库*/
            //判断操作类型，为submit提交就 生成校内编号，并且将审核状态设置为1
            if ("submit".equals(rewardResultVO.getSubmitType())) {
                schoolNumberGenerate.setSchoolNumber(rewardResultVO);                         //提交时生成 获奖成果 编号
                rewardResultVO.setAuditStatusId(2);                                           //保存时将状态设置为2 ，即待学院审核状态
            } else if ("save".equals(rewardResultVO.getSubmitType())) {
                rewardResultVO.setAuditStatusId(1);                                           //保存时将状态设置为1 ，即未提交状态
            }
            //下边设置保存提交都相同的属性
            rewardResultVO.setRewardId(UUIDUtils.getUUID());                               //生成 获奖成果 主键
            //取集合中第一个为负责人并设置到 获奖成果 信息
            //-3表示校外人员，-2表示学生，其他情况表示校内教师
            if ("-3".equals(personListVOList.get(0).getWorkNum())) {
                rewardResultVO.setLeader("校外人员：" + personListVOList.get(0).getWorkName());
            } else if ("-2".equals(personListVOList.get(0).getWorkNum())) {
                rewardResultVO.setLeader("学生：" + personListVOList.get(0).getWorkName());
            } else {
                rewardResultVO.setLeader(personListVOList.get(0).getWorkName() + "(" + personListVOList.get(0).getWorkNum() + ")");
            }
            rewardResultVO.setAttachment(FileHandle.fileUpload(FileHandle.REWARDRESULT, rewardResultVO.getFile(), rewardResultVO.getRewardId())); //保存文件并得到文件名
            rewardResultVO.setPersonList(rewardResultVO.getPersonListVO().getWorkName());          //设置人员列表字符串
            rewardResultVO.setInsertTime(new Date());                                         //设置当前系统时间为插入时间
            rewardResultVO.setLastTime(new Date());                                           //设置当前系统时间为最后更新时间
            System.out.println(rewardResultVO.toString());
            eRewardMapper.insertSelective(rewardResultVO);                                   //向数据库插入 获奖成果 数据
            /*end：设置 获奖成果 的属性值并保存到数据库*/

            /*start：向人员项目成果关系表中插数据*/
            //创建关系表对象，需要初始化 （项目或成果id，类型，项目或成果名称，关键性时间）四个属性值
            RPersonProjectResult r = new
                    RPersonProjectResult(rewardResultVO.getRewardId(), 12, rewardResultVO.getResultName(), rewardResultVO.getRewDate());
            personListService.insertRPersonProjectResult(personListVOList, r);        //传入人员列表和对应项目中的属性对象
            /*end：向人员项目成果关系表中插数据*/
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("插入数据失败");
        }
    }

    /**
     * 通过获奖成果id查询获奖成果详细信息
     *
     * @param rewardId 获奖成果id
     * @return 返回获奖成果对象
     */
    @Override
    public ERewardCustom findRewardResultByRewardId(String rewardId) {
        return eRewardMapperCustom.selectRewardResultInfoByRewardId(rewardId);
    }

    /**
     * 通过获奖成果id查询获奖成果人员列表详细信息
     *
     * @param rewardId 获奖成果id
     * @return 返回获奖成果 人员列表对象
     */
    @Override
    public List<PersonListVO> findPersonListByRewardId(String rewardId) {
        return eRewardMapperCustom.selectPersonListByRewardId(rewardId);
    }

    /**
     * 编辑获奖成果
     *
     * @param rewardResultVO 项目值对象
     */
    @Override
    public void updateRewardResult(RewardResultVO rewardResultVO){
        if (this.rewardNameIsExisted(rewardResultVO)) {
            throw new RuntimeException("输入的名称已存在，请重新输入");
        }
        try {
            //通过 成果对象 信息中的人员字符串得到人员列表集合
            List<PersonListVO> personListVOList = rewardResultVO.getPersonListVOList();
            /*start：设置 获奖成果 的属性值并保存到数据库*/
            //判断操作类型，为submit提交就 生成校内编号，并且将审核状态设置为1
            if ("submit".equals(rewardResultVO.getSubmitType())) {
                schoolNumberGenerate.setSchoolNumber(rewardResultVO);                         //提交时生成 获奖成果 编号
                rewardResultVO.setAuditStatusId(2);                                           //保存时将状态设置为2 ，即待学院审核状态
            } else if ("save".equals(rewardResultVO.getSubmitType())) {
                rewardResultVO.setAuditStatusId(1);                                           //保存时将状态设置为1 ，即未提交状态
            }
            //下边设置保存提交都相同的属性
            //取集合中第一个为负责人并设置到 获奖成果 信息
            //-3表示校外人员，-2表示学生，其他情况表示校内教师
            if ("-3".equals(personListVOList.get(0).getWorkNum())) {
                rewardResultVO.setLeader("校外人员：" + personListVOList.get(0).getWorkName());
            } else if ("-2".equals(personListVOList.get(0).getWorkNum())) {
                rewardResultVO.setLeader("学生：" + personListVOList.get(0).getWorkName());
            } else {
                rewardResultVO.setLeader(personListVOList.get(0).getWorkName() + "(" + personListVOList.get(0).getWorkNum() + ")");
            }
            rewardResultVO.setAttachment(FileHandle.fileUpload(FileHandle.REWARDRESULT, rewardResultVO.getFile(), rewardResultVO.getRewardId())); //保存文件并得到文件名
            rewardResultVO.setPersonList(rewardResultVO.getPersonListVO().getWorkName());          //设置人员列表字符串
            rewardResultVO.setLastTime(new Date());                                         //设置当前系统时间为最后更新时间
            System.out.println(rewardResultVO.toString());
            eRewardMapper.updateByPrimaryKeySelective(rewardResultVO);                        //更新 获奖成果 数据
            /*end：设置 获奖成果 的属性值并保存到数据库*/
            /*start：删除人员项目成果关系表中需此获奖成果id的所有数据*/
            RPersonProjectResultExample rPersonProjectResultExample = new RPersonProjectResultExample();
            RPersonProjectResultExample.Criteria criteria = rPersonProjectResultExample.createCriteria();
            criteria.andIdEqualTo(rewardResultVO.getRewardId());
            rPersonProjectResultMapper.deleteByExample(rPersonProjectResultExample);
            /*end：删除人员项目成果关系表中需此获奖成果id的所有数据*/

            /*start：向人员项目关系表中插数据*/
            //创建关系表对象，需要初始化 （项目或成果id，类型，项目或成果名称，关键性时间）四个属性值
            RPersonProjectResult r = new
                    RPersonProjectResult(rewardResultVO.getRewardId(), 12, rewardResultVO.getResultName(), rewardResultVO.getRewDate());
            personListService.insertRPersonProjectResult(personListVOList, r);        //传入人员列表和对应项目中的属性对象
            /*end：向人员项目关系表中插数据*/

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("插入数据失败");
        }
    }

    /**
     * 检查是否存在同名获奖成果输入的名称
     *
     * @param rewardResultVO 项目对象
     * @return 存在就返回true  ，不存在返回false
     */
    @Override
    public boolean rewardNameIsExisted(RewardResultVO rewardResultVO) {
        //传入的获奖成果输入的项目名为空时返回false表示不存在
        if (rewardResultVO.getResultName() == null) {
            return false;
        }
        ERewardExample eRewardExample = new ERewardExample();
        ERewardExample.Criteria criteria = eRewardExample.createCriteria();
        criteria.andResultNameEqualTo(rewardResultVO.getResultName());
        //排除自身进行查重
        if (rewardResultVO.getRewardId() != null) {
            criteria.andRewardIdNotEqualTo(rewardResultVO.getRewardId());
        }
        return eRewardMapper.selectByExample(eRewardExample).size() > 0;  //大于0返回true表示存在该名称
    }

    /**
     * 删除指定id的获奖成果
     *
     * @param rewardId 获奖成果编号
     */
    public void deleteRewardResultByRewardId(String rewardId) {
        try {
            //先查询出要删除的获奖成果
            EReward eReward = eRewardMapper.selectByPrimaryKey(rewardId);
            //从e_reward表删除获奖成果
            eRewardMapper.deleteByPrimaryKey(rewardId);
            //删除人员项目成果关系表的数据
            RPersonProjectResultExample rPersonProjectResultExample = new RPersonProjectResultExample();
            RPersonProjectResultExample.Criteria criteria = rPersonProjectResultExample.createCriteria();
            criteria.andIdEqualTo(rewardId);
            rPersonProjectResultMapper.deleteByExample(rPersonProjectResultExample);
            //删除相关的附件，最后进行删除附件操作，如果前面删除失败就不会删除附件
            FileHandle.deleteFile(FileHandle.REWARDRESULT, eReward.getAttachment());
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("删除该成果失败");
        }
    }
}
