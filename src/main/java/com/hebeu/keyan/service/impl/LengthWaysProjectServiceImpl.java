package com.hebeu.keyan.service.impl;

import com.hebeu.keyan.dao.BudgetMoneyMapper;
import com.hebeu.keyan.dao.EProjectMapper;
import com.hebeu.keyan.dao.RPersonProjectResultMapper;
import com.hebeu.keyan.dao.customMapper.EProjectMapperCustom;
import com.hebeu.keyan.po.*;
import com.hebeu.keyan.po.customPO.EProjectCustom;
import com.hebeu.keyan.service.LengthWaysProjectService;
import com.hebeu.keyan.service.PersonListService;
import com.hebeu.keyan.utils.FileHandle;
import com.hebeu.keyan.utils.SchoolNumberGenerate;
import com.hebeu.keyan.utils.UUIDUtils;
import com.hebeu.keyan.vo.PersonListVO;
import com.hebeu.keyan.vo.ProjectVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * 作者：陈德华
 * 时间：2017/8/3 18:47
 * 描述：纵向项目处理业务实现类
 */
@Service
public class LengthWaysProjectServiceImpl implements LengthWaysProjectService {
    private final EProjectMapper eProjectMapper;
    private final SchoolNumberGenerate schoolNumberGenerate;
    private final RPersonProjectResultMapper rPersonProjectResultMapper;
    private final EProjectMapperCustom eProjectMapperCustom;
    private final PersonListService personListService;
    private final BudgetMoneyMapper budgetMoneyMapper;

    @Autowired
    public LengthWaysProjectServiceImpl(EProjectMapper eProjectMapper, SchoolNumberGenerate schoolNumberGenerate, RPersonProjectResultMapper rPersonProjectResultMapper, EProjectMapperCustom eProjectMapperCustom, PersonListService personListService, BudgetMoneyMapper budgetMoneyMapper) {
        this.eProjectMapper = eProjectMapper;
        this.schoolNumberGenerate = schoolNumberGenerate;
        this.rPersonProjectResultMapper = rPersonProjectResultMapper;
        this.eProjectMapperCustom = eProjectMapperCustom;
        this.personListService = personListService;
        this.budgetMoneyMapper = budgetMoneyMapper;
    }

    /** 赋值公共属性(编辑和新增时都需要设置的属性)
     * @param projectVO 项目对象
     * @param personListVO 人员对象
     */
    @Override
    public void assignedCommonData(ProjectVO projectVO,PersonListVO personListVO) {
        try {
            //判断操作类型，为submit提交 就生成校内编号，并且将审核状态设置为1
            if("submit".equals(projectVO.getSubmitType())){
                schoolNumberGenerate.setSchoolNumber(projectVO);                         //提交时生成项目编号
                projectVO.setAuditStatusId(2);                                           //保存时将状态设置为2 ，即待学院审核状态
            }else if("save".equals(projectVO.getSubmitType())){
                projectVO.setAuditStatusId(1);                                           //保存时将状态设置为1 ，即未提交状态
            }
            //下边设置保存提交都相同的属性
            projectVO.setAttachment(FileHandle.fileUpload(FileHandle.LENGTHWAYSPROJECT, projectVO.getFile(),projectVO.getProjectId())); //保存文件并得到文件名
            projectVO.setPersonList(projectVO.getPersonListVO().getWorkName());          //设置人员列表字符串
            projectVO.setLastTime(new Date());                                           //设置最后更新时间
            projectVO.setEndStatusId(1);                                                 //设置项目结题状态为在研

            //设置负责人
            if("-2".equals(personListVO.getWorkNum())){
                projectVO.setLeader("学生："+personListVO.getWorkName());
            }else if("-3".equals(personListVO.getWorkNum())){
                projectVO.setLeader("校外人员："+personListVO.getWorkName());
            }else {
                projectVO.setLeader(personListVO.getWorkName()+"("+personListVO.getWorkNum()+")");
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("赋值失败");
        }
    }

    /**
     * 检查是否存在同名项目
     *
     * @param projectVO 项目对象
     * @return 存在就返回true  ，不存在返回false
     */
    @Override
    public boolean isExistedProject(ProjectVO projectVO) {
        //传入的项目名为空时返回false表示不存在
        if(projectVO.getProjectName() == null){
            return false;
        }
        EProjectExample eProjectExample = new EProjectExample();
        EProjectExample.Criteria criteria = eProjectExample.createCriteria();
        criteria.andProjectNameEqualTo(projectVO.getProjectName());
        //排除自身进行查重
        if(projectVO.getProjectId()!= null){
            criteria.andProjectIdNotEqualTo(projectVO.getProjectId());
        }
        return eProjectMapper.selectByExample(eProjectExample).size() > 0;  //大于0返回true表示存在该项目
    }

    /**
     * 删除指定id的项目
     *
     * @param projectId 项目id
     */
    @Override
    public void deleteProject(String projectId) {
        try {
            //先查询出要删除的项目信息
            EProject eProject = eProjectMapper.selectByPrimaryKey(projectId);

            /*start:删除项目经费预算表中数据，因为项目id作为外键，所以需要先删除外键表*/
            BudgetMoneyExample budgetMoneyExample = new BudgetMoneyExample();
            BudgetMoneyExample.Criteria criteria1 = budgetMoneyExample.createCriteria();
            criteria1.andProjectIdEqualTo(projectId);
            budgetMoneyMapper.deleteByExample(budgetMoneyExample);       //根据项目id删除项目预算信息
            /*start:删除项目经费预算表中数据*/

            //从项目表删除项目

            eProjectMapper.deleteByPrimaryKey(projectId);
            //删除人员项目关系表的数据
            RPersonProjectResultExample rPersonProjectResultExample = new RPersonProjectResultExample();
            RPersonProjectResultExample.Criteria criteria = rPersonProjectResultExample.createCriteria();
            criteria.andIdEqualTo(projectId);
            rPersonProjectResultMapper.deleteByExample(rPersonProjectResultExample);

            //删除项目相关的附件，最后进行删除附件操作，如果前面删除项目失败就不会删除附件
            FileHandle.deleteFile(FileHandle.LENGTHWAYSPROJECT,eProject.getAttachment());



        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("删除项目失败");
        }
    }

    /**
     * 通过项目id查询经费预算信息
     *
     * @param projectId 项目id
     * @return 返回经费预算信息
     */
    @Override
    public BudgetMoney findBudgetMoneyByProjectId(String projectId) {
        BudgetMoneyExample budgetMoneyExample = new BudgetMoneyExample();
        BudgetMoneyExample.Criteria  criteria= budgetMoneyExample.createCriteria();
        criteria.andProjectIdEqualTo(projectId);
        List<BudgetMoney> budgetMoneyList = budgetMoneyMapper.selectByExample(budgetMoneyExample);
        return budgetMoneyList.size()== 0  ? null :budgetMoneyList.get(0);
    }

    /**
     * 比较项目信息中的批准经费和预算经费总额
     *
     * @param budgetMoney 预算经费
     * @param projectVO   项目信息
     * @return 预算经费超过批准经费返回true ，否则返回false
     */
    @Override
    public boolean isExcess(BudgetMoney budgetMoney, ProjectVO projectVO) {
        Double total = budgetMoney.getPublishTotal() + budgetMoney.getMaterialsTotal() + budgetMoney.getTestTotal()
                +budgetMoney.getFuelTotal() + budgetMoney.getTravelTotal() + budgetMoney.getMeetTotal()+budgetMoney.getInternationalTotal()
                +budgetMoney.getFacilityTotal() + budgetMoney.getLabourTotal()+budgetMoney.getExpertTotal() +budgetMoney.getDatumTotal()
                +budgetMoney.getDataTotal()+budgetMoney.getPrintTotal() + budgetMoney.getOtherTotal() + budgetMoney.getManageTotal()
                +budgetMoney.getPostTotal();
        return total>projectVO.getApproveMoney();
    }

    /**
     * 插入项目（包括保存和提交）
     *
     * @param projectVO 项目值对象
     */
    @Override
    public void insertProject(ProjectVO projectVO) {
        //查重，存在同名项目就抛出异常
        if(this.isExistedProject(projectVO)){
            throw new RuntimeException("已存在同名项目");
        }
        try {
            //通过项目信息中的人员字符串得到人员列表集合
            List<PersonListVO> personListVOList = projectVO.getPersonListVOList();

             /*start：设置项目的属性值并保存到数据库*/
            //注意：生成项目id要在设置公共数据之前，因为文件名是已项目名来命名的
            projectVO.setProjectId(UUIDUtils.getUUID());                                 //生成项目主键，此主键也作为保存文件的UUID名
            this.assignedCommonData(projectVO,personListVOList.get(0));                  //赋值公共属性
            projectVO.setInsertTime(new Date());                                         //设置当前系统时间为插入时间
            eProjectMapper.insertSelective(projectVO);                                   //向数据库插入项目数据
            /*end：设置项目的属性值并保存到数据库*/

            /*start：向人员项目关系表中插数据*/
            //创建关系表对象，需要初始化 （项目或成果id，类型，项目或成果名称，关键性时间）四个属性值
            RPersonProjectResult r = new
                    RPersonProjectResult(projectVO.getProjectId(),1,projectVO.getProjectName(),projectVO.getApproveDate());
            personListService.insertRPersonProjectResult(personListVOList,r);        //传入人员列表和对应项目中的属性对象
            /*end：向人员项目关系表中插数据*/

            /*start:向项目经费预算表中插入数据*/
            projectVO.getBudgetMoney().setProjectId(projectVO.getProjectId());  //设置经费对象中的项目id属性
            budgetMoneyMapper.insertSelective(projectVO.getBudgetMoney());      //向项目经费预算表中插入数据
            /*start:向项目经费预算表中插入数据*/

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("插入数据失败");
        }
    }



    /**
     * 更新项目
     *
     * @param projectVO 项目值对象
     */
    @Override
    public void updateProject(ProjectVO projectVO) {
        //查重，存在同名项目就抛出异常
        if(this.isExistedProject(projectVO)){
            throw new RuntimeException("已存在同名项目");
        }
        try {
            //通过项目信息中的人员字符串得到人员列表集合
            List<PersonListVO> personListVOList = projectVO.getPersonListVOList();
            /*start：设置项目的属性值并保存到数据库*/
            //设置公共属性数据
            this.assignedCommonData(projectVO,personListVOList.get(0));
            eProjectMapper.updateByPrimaryKeySelective(projectVO);               //更新数据库项目数据
            /*end：设置项目的属性值并保存到数据库*/

            /*start：向人员项目关系表中插数据*/
            //第一步：先删除原来的数据
            RPersonProjectResultExample rPersonProjectResultExample = new RPersonProjectResultExample();
            RPersonProjectResultExample.Criteria criteria = rPersonProjectResultExample.createCriteria();
            criteria.andIdEqualTo(projectVO.getProjectId());
            rPersonProjectResultMapper.deleteByExample(rPersonProjectResultExample);
            //第二步：插入新的数据
            //创建关系表对象，需要初始化 （项目或成果id，类型，项目或成果名称，关键性时间）四个属性值
            RPersonProjectResult r = new
                    RPersonProjectResult(projectVO.getProjectId(),1,projectVO.getProjectName(),projectVO.getApproveDate());
            personListService.insertRPersonProjectResult(personListVOList,r);        //传入人员列表和对应项目中的属性对象
            /*end：向人员项目关系表中插数据*/


            /*start:更新项目经费预算表中数据*/
            projectVO.getBudgetMoney().setProjectId(projectVO.getProjectId());  //设置经费对象中的项目id属性
            BudgetMoneyExample budgetMoneyExample = new BudgetMoneyExample();
            BudgetMoneyExample.Criteria criteria1 = budgetMoneyExample.createCriteria();
            criteria1.andProjectIdEqualTo(projectVO.getProjectId());            //设置按项目id更新的条件
            budgetMoneyMapper.updateByExampleSelective(projectVO.getBudgetMoney(),budgetMoneyExample);      //向项目经费预算表中插入数据
            /*start:更新项目经费预算表中数据*/


        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("更新数据失败");
        }


    }

    /**
     * 通过项目主键查询项目详细信息，包括人员列表信息
     *
     * @param projectId 项目id
     * @return 返回项目对象
     */
    @Override
    public EProjectCustom findProjectById(String projectId) {
        return eProjectMapperCustom.selectProjectInfoById(projectId);
    }

    /**
     * 通过工号查询项目集合
     *
     * @param workNum 指定查询的工号
     * @return 返回指定工号的项目集合
     */
    @Override
    public List<EProjectCustom> findProjectListByWorkNum(String workNum) {
        return eProjectMapperCustom.selectProjectByWorkNum(workNum);
    }

    /**
     * 通过指定项目编号查询对应的人员列表
     *
     * @param projectId 项目id
     * @return 返回人员列表集合
     */
    @Override
    public List<PersonListVO> findPersonListByProjectId(String projectId) {
        return eProjectMapperCustom.selectPersonListByProjectId(projectId);
    }


}
