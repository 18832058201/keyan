package com.hebeu.keyan.service.impl;

import com.hebeu.keyan.dao.ManageMoneyApplyMapper;
import com.hebeu.keyan.dao.ManageMoneyTotalMapper;
import com.hebeu.keyan.dao.customMapper.CommonMapper;
import com.hebeu.keyan.dao.customMapper.ManageMoneyMapper;
import com.hebeu.keyan.po.*;
import com.hebeu.keyan.po.customPO.ActiveUser;
import com.hebeu.keyan.po.customPO.ManageMoneyApplyCustom;
import com.hebeu.keyan.service.ManageMoneyService;
import com.hebeu.keyan.utils.ManageMoneyCode;
import com.hebeu.keyan.vo.AuditObjectVo;
import com.hebeu.keyan.vo.MoneySearchVO;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 作者：冯嘉龙
 * 时间：2017/8/11  16:03
 * 描述：科研管理费相关业务实现类
 */
@Service
public class ManageMoneyServiceImpl implements ManageMoneyService {
    private final ManageMoneyMapper manageMoneyMapper;
    private final CommonMapper commonMapper;
    private final ManageMoneyCode manageMoneyCode;
    private final ManageMoneyApplyMapper manageMoneyApplyMapper;
    private final ManageMoneyTotalMapper manageMoneyTotalMapper;

    @Autowired
    public ManageMoneyServiceImpl(ManageMoneyMapper manageMoneyMapper, CommonMapper commonMapper, ManageMoneyCode manageMoneyCode, ManageMoneyApplyMapper manageMoneyApplyMapper, ManageMoneyTotalMapper manageMoneyTotalMapper) {
        this.manageMoneyMapper = manageMoneyMapper;
        this.commonMapper = commonMapper;
        this.manageMoneyCode = manageMoneyCode;
        this.manageMoneyApplyMapper = manageMoneyApplyMapper;
        this.manageMoneyTotalMapper = manageMoneyTotalMapper;
    }

    /**
     * 根据“工号”查询《科研管理费申请》列表
     *
     * @param workNum 工号
     * @return 返回指定“工号”的《科研管理费申请》列表
     */
    @Override
    public List<ManageMoneyApplyCustom> findApplyByWorkNum(String workNum) {
        return manageMoneyMapper.selectApplyByWorkNum(workNum);
    }

    /**
     * 根据“申请编号”查询指定的《管理费申请》详情
     *
     * @param applyId 申请编号
     * @return 返回指定“申请编号”的《管理费申请》详情
     */
    @Override
    public ManageMoneyApplyCustom findApplyInfoByApplyId(String applyId) {
        return manageMoneyMapper.selectApplyInfoByApplyId(applyId);
    }

    /**
     * 根据指定applyId查询科研管理费申请（接口实现类(impl)中使用）
     *
     * @param applyId
     * @return 返回manageMoneyApply集合
     */
    public List<ManageMoneyApply> findApplyByApplyId(String applyId) {
        ManageMoneyApply manageMoneyApply = new ManageMoneyApply();
        ManageMoneyApplyExample manageMoneyApplyExample = new ManageMoneyApplyExample();
        ManageMoneyApplyExample.Criteria criteria = manageMoneyApplyExample.createCriteria();
        criteria.andApplyIdEqualTo(applyId);
        List<ManageMoneyApply> manageMoneyApplyList = manageMoneyApplyMapper.selectByExample(manageMoneyApplyExample);
        return manageMoneyApplyList;
    }

    /**
     * 根据collegeId、year查询科研管理费总表中对应的数据（接口实现类(impl)中使用）
     *
     * @param collegeId
     * @param year
     * @return 返回ManageMoneyTotal集合
     */
    public List<ManageMoneyTotal> findTotalByCollegeIdAndYear(Integer collegeId, Integer year) {
        ManageMoneyTotalExample manageMoneyTotalExample = new ManageMoneyTotalExample();
        ManageMoneyTotalExample.Criteria criteria = manageMoneyTotalExample.createCriteria();
        criteria.andYearEqualTo(year);
        criteria.andCollegeIdEqualTo(collegeId);
        List<ManageMoneyTotal> manageMoneyTotalList = manageMoneyTotalMapper.selectByExample(manageMoneyTotalExample);
        return manageMoneyTotalList;
    }

    /**
     * 审核不通过、删除时，将金额还原到总金额表（manage_money_total），接口实现类内部使用
     */
    public void restoreManageMoneyTotal(String applyId) {
        ManageMoneyApplyExample manageMoneyApplyExample = new ManageMoneyApplyExample();
        ManageMoneyApplyExample.Criteria criteria = manageMoneyApplyExample.createCriteria();
        criteria.andApplyIdEqualTo(applyId);
        List<ManageMoneyApply> manageMoneyApplyList = manageMoneyApplyMapper.selectByExample(manageMoneyApplyExample);
        if (manageMoneyApplyList.size() > 0) {
            ManageMoneyApply beforeApply = manageMoneyApplyList.get(0);
            double beforeApplyMoney = beforeApply.getApplyMoney();
            //按条件查询，判断是否为空，不为空就去集合的第一个值
            ManageMoneyTotalExample manageMoneyTotalExample = new ManageMoneyTotalExample();
            ManageMoneyTotalExample.Criteria criteria1 = manageMoneyTotalExample.createCriteria();
            criteria1.andYearEqualTo(beforeApply.getApplyYear());
            criteria1.andCollegeIdEqualTo(beforeApply.getCollegeId());
            List<ManageMoneyTotal> manageMoneyTotalList = manageMoneyTotalMapper.selectByExample(manageMoneyTotalExample);
            if (manageMoneyTotalList.size() > 0) {
                ManageMoneyTotal manageMoneyTotal = manageMoneyTotalList.get(0);
                double applyMoney = manageMoneyTotal.getApplyMoney();
                double availApply = manageMoneyTotal.getAvailApply();
                //把编辑之前的金额还原
                applyMoney -= beforeApplyMoney;
                availApply += beforeApplyMoney;
                manageMoneyTotal.setApplyMoney(applyMoney);
                manageMoneyTotal.setAvailApply(availApply);
                manageMoneyTotalMapper.updateByPrimaryKeySelective(manageMoneyTotal);
            }
        }
    }

    /**
     * 撤销审核时，将金额从总金额表（manage_money_total）中扣除，接口实现类内部使用
     */
    public void deductManageMoneyTotal(String applyId) {
        ManageMoneyApplyExample manageMoneyApplyExample = new ManageMoneyApplyExample();
        ManageMoneyApplyExample.Criteria criteria = manageMoneyApplyExample.createCriteria();
        criteria.andApplyIdEqualTo(applyId);
        List<ManageMoneyApply> manageMoneyApplyList = manageMoneyApplyMapper.selectByExample(manageMoneyApplyExample);
        if (manageMoneyApplyList.size() > 0) {
            ManageMoneyApply beforeApply = manageMoneyApplyList.get(0);
            double beforeApplyMoney = beforeApply.getApplyMoney();
            //按条件查询，判断是否为空，不为空就去集合的第一个值
            ManageMoneyTotalExample manageMoneyTotalExample = new ManageMoneyTotalExample();
            ManageMoneyTotalExample.Criteria criteria1 = manageMoneyTotalExample.createCriteria();
            criteria1.andYearEqualTo(beforeApply.getApplyYear());
            criteria1.andCollegeIdEqualTo(beforeApply.getCollegeId());
            List<ManageMoneyTotal> manageMoneyTotalList = manageMoneyTotalMapper.selectByExample(manageMoneyTotalExample);
            if (manageMoneyTotalList.size() > 0) {
                ManageMoneyTotal manageMoneyTotal = manageMoneyTotalList.get(0);
                double applyMoney = manageMoneyTotal.getApplyMoney();
                double availApply = manageMoneyTotal.getAvailApply();
                //把编辑之前的金额还原
                applyMoney += beforeApplyMoney;
                availApply -= beforeApplyMoney;
                manageMoneyTotal.setApplyMoney(applyMoney);
                manageMoneyTotal.setAvailApply(availApply);
                manageMoneyTotalMapper.updateByPrimaryKeySelective(manageMoneyTotal);
            }
        }
    }

    /**
     * 确认发放时，将申请金额变更为已报销金额，接口实现类内部使用
     */
    public void updatePaymentMoney(ManageMoneyApply manageMoneyApply) {
        //查询出所需修改的总金额
        //按条件查询，判断是否为空，不为空就去集合的第一个值
        ManageMoneyTotalExample manageMoneyTotalExample = new ManageMoneyTotalExample();
        ManageMoneyTotalExample.Criteria criteria1 = manageMoneyTotalExample.createCriteria();
        criteria1.andYearEqualTo(manageMoneyApply.getApplyYear());
        criteria1.andCollegeIdEqualTo(manageMoneyApply.getCollegeId());
        List<ManageMoneyTotal> manageMoneyTotalList = manageMoneyTotalMapper.selectByExample(manageMoneyTotalExample);
        if (manageMoneyTotalList.size() > 0) {
            ManageMoneyTotal manageMoneyTotal = manageMoneyTotalList.get(0);
            manageMoneyTotal.setAvailMoney(manageMoneyTotal.getAvailMoney() - manageMoneyApply.getApplyMoney());//获取可用金额并修改
            manageMoneyTotal.setAvailMoney(manageMoneyTotal.getPaymentMoney() + manageMoneyApply.getApplyMoney());//获取已报销金额并修改
            manageMoneyTotal.setAvailMoney(manageMoneyTotal.getApplyMoney() - manageMoneyApply.getApplyMoney());//获取已报销金额并修改
            //提交修改后的manageMoneyTotal对象
            manageMoneyTotalMapper.updateByPrimaryKeySelective(manageMoneyTotal);
        }
    }

    /**
     * 查询manage_money_total中，所有的year
     *
     * @return 集合
     */
    @Override
    public List<ManageMoneyTotal> findAllYear() {
        return manageMoneyMapper.selectAllYear();
    }

    /**
     * 查询所有在职人员，格式为姓名（工号）
     *
     * @return 集合
     */
    @Override
    public List<EPerson> findAllPeople() {
        return commonMapper.selectAllPeople();
    }

    /**
     * 插入科研管理费申请
     *
     * @param manageMoneyApply 项目值对象
     */
    @Override
    public void insertApply(ManageMoneyApply manageMoneyApply) {
        if (this.applyMoneyIsOut(manageMoneyApply, "add")) {
            throw new RuntimeException("输入的申请金额超出最大可申请金额，请确认后重新输入");
        }
        try {
            /*start：设置 "科研管理费申请" 的属性值并保存到数据库*/
            if (manageMoneyApply.getApplyTypeId() != 1) {
                manageMoneyApply.setCollegeId(1);
            }
            manageMoneyApply.setApplyId(manageMoneyCode.getMoneyCode(manageMoneyApply.getApplyTypeId()));//生成唯一编号，格式为：CO/S0/S1/S2 + yyyyMMdd + 0000~9999
            manageMoneyApply.setAuditStatusId(1);//设置审核状态id为1
            manageMoneyApply.setApplyTime(new Date());//设置当前时间为申请时间
            manageMoneyApply.setLastTime(new Date());//设置当前时间为最后更新时间
            manageMoneyApplyMapper.insertSelective(manageMoneyApply);//插入数据
            /*end：设置 "科研管理费申请" 的属性值并保存到数据库*/

            /*start:修改manage_money_total表的数据*/
            //查询manage_money_total表中指定年份、学院的管理费信息
            List<ManageMoneyTotal> manageMoneyTotalList = findTotalByCollegeIdAndYear(manageMoneyApply.getCollegeId(), manageMoneyApply.getApplyYear());
            //按条件查询，判断是否为空，不为空就去集合的第一个值
            if (manageMoneyTotalList.size() > 0) {
                ManageMoneyTotal manageMoneyTotal = manageMoneyTotalList.get(0);
                double applyMoney = manageMoneyTotal.getApplyMoney();
                double availApply = manageMoneyTotal.getAvailApply();
                applyMoney += manageMoneyApply.getApplyMoney();
                availApply -= manageMoneyApply.getApplyMoney();
                manageMoneyTotal.setApplyMoney(applyMoney);
                manageMoneyTotal.setAvailApply(availApply);
                manageMoneyTotalMapper.updateByPrimaryKeySelective(manageMoneyTotal);
            }
            /*end:修改manage_money_total表的数据*/
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("插入数据失败");
        }
    }

    /**
     * 通过ajax验证填写的申请金额是否大于可申请最大金额
     *
     * @param manageMoneyApply 申请对象
     * @return 返回true表示已存在，返回false表示不存在
     */
    @Override
    public boolean applyMoneyIsOut(ManageMoneyApply manageMoneyApply, String submitType) {
        //传入的申请金额为空时返回true
        if (manageMoneyApply.getApplyMoney() == null) {
            return true;
        }
        if (1 != manageMoneyApply.getApplyTypeId()) {
            manageMoneyApply.setCollegeId(1);
        }
        List<ManageMoneyTotal> manageMoneyTotalList = findTotalByCollegeIdAndYear(manageMoneyApply.getCollegeId(), manageMoneyApply.getApplyYear());
        //按条件查询，判断是否为空，不为空就去集合的第一个值
        if (manageMoneyTotalList.size() > 0) {
            ManageMoneyTotal manageMoneyTotal = manageMoneyTotalList.get(0);
            //数据库中的getAvailApply为空时返回false
            if (manageMoneyTotal.getAvailApply() == null) {
                return false;
            }
            //比较输入的申请金额和数据库中可申请金额
            if ("add".equals(submitType)) {
                if (manageMoneyApply.getApplyMoney() > manageMoneyTotal.getAvailApply()) {
                    return true;
                }
            } else if ("edit".equals(submitType)) {
                //查询编辑以前的管理费申请信息
                List<ManageMoneyApply> manageMoneyApplyList = findApplyByApplyId(manageMoneyApply.getApplyId());
                if (manageMoneyApplyList.size() > 0) {
                    ManageMoneyApply beforeApply = manageMoneyApplyList.get(0);
                    double beforeApplyMoney = beforeApply.getApplyMoney();
                    if (manageMoneyApply.getApplyMoney() > (manageMoneyTotal.getAvailApply() + beforeApplyMoney)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    /**
     * 编辑申请信息
     *
     * @param manageMoneyApply 申请值对象
     */
    @Override
    public void updateApply(ManageMoneyApply manageMoneyApply) {
        if (this.applyMoneyIsOut(manageMoneyApply, "edit")) {
            throw new RuntimeException("输入的申请金额超出最大可申请金额，请确认后重新输入");
        }
        try {
            /*start:修改manage_money_total表的数据*/
            //将之前的申请金额还原到总金额中
            restoreManageMoneyTotal(manageMoneyApply.getApplyId());
            //查询到编辑之后的信息对应的总表
            ManageMoneyTotalExample manageMoneyTotalExample = new ManageMoneyTotalExample();
            ManageMoneyTotalExample.Criteria criteria1 = manageMoneyTotalExample.createCriteria();
            criteria1.andYearEqualTo(manageMoneyApply.getApplyYear());
            criteria1.andCollegeIdEqualTo(manageMoneyApply.getCollegeId());
            List<ManageMoneyTotal> manageMoneyTotalList = manageMoneyTotalMapper.selectByExample(manageMoneyTotalExample);
            if (manageMoneyTotalList.size() > 0) {
                ManageMoneyTotal manageMoneyTotal = manageMoneyTotalList.get(0);
                double applyMoney = manageMoneyTotal.getApplyMoney();
                double availApply = manageMoneyTotal.getAvailApply();
                //扣除编辑之后的申请金额
                applyMoney += manageMoneyApply.getApplyMoney();
                availApply -= manageMoneyApply.getApplyMoney();
                manageMoneyTotal.setApplyMoney(applyMoney);
                manageMoneyTotal.setAvailApply(availApply);
                manageMoneyTotalMapper.updateByPrimaryKeySelective(manageMoneyTotal);
            }
            /*end:修改manage_money_total表的数据*/

            /*start：设置 "科研管理费申请" 的属性值并保存到数据库*/
            if (manageMoneyApply.getApplyTypeId() != 1) {
                manageMoneyApply.setCollegeId(1);
            }
            manageMoneyApply.setAuditStatusId(1);//设置审核状态id为1
            manageMoneyApply.setLastTime(new Date());//设置当前时间为最后更新时间
            manageMoneyApplyMapper.updateByPrimaryKeySelective(manageMoneyApply);//插入数据
            /*end：设置 "科研管理费申请" 的属性值并保存到数据库*/
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("编辑数据失败");
        }
    }

    /**
     * 删除指定id的科研管理费申请
     *
     * @param applyId
     */
    public void deleteApplyByApplyId(String applyId) {
        try {
            //先查询出要删除的科研管理费申请
            List<ManageMoneyApply> manageMoneyApplyList = findApplyByApplyId(applyId);
            if (manageMoneyApplyList.size() > 0) {
                ManageMoneyApply manageMoneyApply = manageMoneyApplyList.get(0);
                //判断当前状态audit_status，若为1,需要还原总金额，其他情况则不需要（因为申请不通过的时候会把金额还原到总金额中）
                if (manageMoneyApply.getAuditStatusId() == 1) {
                    //得到该申请的申请金额
                    double applyMoney = manageMoneyApply.getApplyMoney();
                    //查询总金额表对应数据
                    List<ManageMoneyTotal> manageMoneyTotalList = findTotalByCollegeIdAndYear(manageMoneyApply.getCollegeId(), manageMoneyApply.getApplyYear());
                    if (manageMoneyTotalList.size() > 0) {
                        ManageMoneyTotal manageMoneyTotal = manageMoneyTotalList.get(0);
                        //将申请金额还原到manage_money_total表中（apply_money申请金额减掉，avail_apply加上）
                        double applyMoneyTotal = manageMoneyTotal.getApplyMoney();
                        double availApplyTotal = manageMoneyTotal.getAvailApply();
                        applyMoneyTotal -= applyMoney;
                        availApplyTotal += applyMoney;
                        manageMoneyTotal.setApplyMoney(applyMoneyTotal);
                        manageMoneyTotal.setAvailApply(availApplyTotal);
                        manageMoneyTotalMapper.updateByPrimaryKeySelective(manageMoneyTotal);
                    }
                }
            }
            //从manage_money_apply表中，删除指定id的申请
            manageMoneyApplyMapper.deleteByPrimaryKey(applyId);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("删除该申请失败");
        }
    }

    /*-----------------------以下为审核部分所需方法------------------------*/

    /**
     * 按指定条件查询科研管理费申请
     *
     * @param moneySearchVO 经费查询条件对象
     * @return 返回指定查询的管理费申请集合
     */
    @Override
    public List<ManageMoneyApplyCustom> findApplyByMoneySearchVO(MoneySearchVO moneySearchVO) {
        return manageMoneyMapper.selectApplyByMoneySearchVO(moneySearchVO);
    }

    /**
     * 更新审核状态
     *
     * @param auditObjectVo 审核对象
     */
    @Override
    public void updateApplyStatus(AuditObjectVo auditObjectVo) {
        //定义主体，并得到登录人的身份信息
        Subject subject = SecurityUtils.getSubject();
        ActiveUser activeUser = (ActiveUser) subject.getPrincipal(); //得到登录人身份信息
        //判断审核意见是否为null，为null则设置为“”
        auditObjectVo.setAuditOpinion(auditObjectVo.getAuditOpinion() == null ? "" : auditObjectVo.getAuditOpinion());
        //利用auditObjectVo对象中的applyId查到申请集合
        ManageMoneyApplyExample manageMoneyApplyExample = new ManageMoneyApplyExample();
        ManageMoneyApplyExample.Criteria criteria = manageMoneyApplyExample.createCriteria();
        criteria.andApplyIdIn(auditObjectVo.getAuditObjectId());
        List<ManageMoneyApply> manageMoneyApplyList = manageMoneyApplyMapper.selectByExample(manageMoneyApplyExample);
        //遍历申请集合
        for (ManageMoneyApply manageMoneyApply : manageMoneyApplyList) {
            //判断登录人是几级审核人，然后设置相应的状态
            if (manageMoneyApply.getAuditStatusId() == 1) {
                manageMoneyApply.setAuditPoinion1(auditObjectVo.getAuditOpinion());
                if ("agree".equals(auditObjectVo.getOperation())) {
                    //判断是否存在二级审核人
                    if (manageMoneyApply.getAuditPersonId2() != null) {
                        manageMoneyApply.setAuditStatusId(2);//一审通过
                    } else {
                        //不存在二级审核人，判断是否存在三级审核人
                        if (manageMoneyApply.getAuditPersonId3() != null) {
                            manageMoneyApply.setAuditStatusId(4);//待三审-----由于不存在二级审核人，直接交由三级审核人审核
                        } else {
                            manageMoneyApply.setAuditStatusId(6);//由于二、三级审核人均不存在，直接设置为  待报销状态
                        }
                    }
                } else if ("refuse".equals(auditObjectVo.getOperation())) {
                    manageMoneyApply.setAuditStatusId(3);//一审不通过
                    //审核不通过，将金额还原到manage_money_total表中
                    restoreManageMoneyTotal(manageMoneyApply.getApplyId());
                }
            } else if (manageMoneyApply.getAuditStatusId() == 2) {
                manageMoneyApply.setAuditPoinion2(auditObjectVo.getAuditOpinion());
                if ("agree".equals(auditObjectVo.getOperation())) {
                    //判断是否存在三级审核人
                    if (manageMoneyApply.getAuditPersonId3() != null) {
                        manageMoneyApply.setAuditStatusId(4);//二审通过
                    } else {
                        manageMoneyApply.setAuditStatusId(6);//不存在三审，直接设置为 待报销（6）
                    }
                } else if ("refuse".equals(auditObjectVo.getOperation())) {
                    manageMoneyApply.setAuditStatusId(5);//二审不通过
                    //审核不通过，将金额还原到manage_money_total表中
                    restoreManageMoneyTotal(manageMoneyApply.getApplyId());
                } else if ("revoke".equals(auditObjectVo.getOperation())) {
                    manageMoneyApply.setAuditStatusId(1);//一审撤销审核
                    manageMoneyApply.setAuditPoinion1("");//撤销审核时，清除审核意见
                }
            } else if (manageMoneyApply.getAuditStatusId() == 3) {
                if ("revoke".equals(auditObjectVo.getOperation())) {
                    manageMoneyApply.setAuditStatusId(1);//一审撤销审核
                    manageMoneyApply.setAuditPoinion1("");//撤销审核时，清除审核意见
                    //撤销审核不通过的审核时，判断总金额是否足够，若足够则将金额从总金额中扣除，否则抛出异常
                    List<ManageMoneyTotal> totalList = findTotalByCollegeIdAndYear(manageMoneyApply.getCollegeId(), manageMoneyApply.getApplyYear());
                    if (totalList.size() > 0) {
                        ManageMoneyTotal total = totalList.get(0);
                        if (manageMoneyApply.getApplyMoney() > total.getAvailApply()) {
                            throw new RuntimeException("所选科研管理费申请的申请金额大于目前可申请金额，撤销失败！");
                        } else {
                            deductManageMoneyTotal(manageMoneyApply.getApplyId());
                        }
                    }
                }
            } else if (manageMoneyApply.getAuditStatusId() == 4) {
                manageMoneyApply.setAuditPoinion3(auditObjectVo.getAuditOpinion());
                if ("agree".equals(auditObjectVo.getOperation())) {
                    manageMoneyApply.setAuditStatusId(6);//三审通过
                } else if ("refuse".equals(auditObjectVo.getOperation())) {
                    manageMoneyApply.setAuditStatusId(7);//三审不通过
                    //审核不通过，将金额还原到manage_money_total表中
                    restoreManageMoneyTotal(manageMoneyApply.getApplyId());
                } else if ("revoke".equals(auditObjectVo.getOperation())) {
                    //判断是否存在二级审核人
                    if (manageMoneyApply.getAuditPersonId2() != null) {
                        //若存在，开始判断登录人是否为二级审核人，若为是则撤销成功，若不是则提示越级，撤销失败
                        if (activeUser.getWorkNameAndNum().equals(manageMoneyApply.getAuditPersonId2())) {
                            manageMoneyApply.setAuditStatusId(2);//二审撤销审核
                            manageMoneyApply.setAuditPoinion2("");//撤销审核时，清除审核意见
                        } else {
                            throw new RuntimeException("不可越级操作，撤销失败！");
                        }
                    }else {
                        //不存在二级审核人，则审核状态撤销为 待一审
                        manageMoneyApply.setAuditStatusId(1);
                        manageMoneyApply.setAuditPoinion1("");
                    }
                }
            } else if (manageMoneyApply.getAuditStatusId() == 5) {
                if ("revoke".equals(auditObjectVo.getOperation())) {
                    if (activeUser.getWorkNameAndNum().equals(manageMoneyApply.getAuditPersonId2())) {
                        manageMoneyApply.setAuditStatusId(2);//二审撤销审核
                        manageMoneyApply.setAuditPoinion2("");//撤销审核时，清除审核意见
                        //撤销审核不通过的审核时，判断总金额是否足够，若足够则将金额从总金额中扣除，否则抛出异常
                        List<ManageMoneyTotal> totalList = findTotalByCollegeIdAndYear(manageMoneyApply.getCollegeId(), manageMoneyApply.getApplyYear());
                        if (totalList.size() > 0) {
                            ManageMoneyTotal total = totalList.get(0);
                            if (manageMoneyApply.getApplyMoney() > total.getAvailApply()) {
                                throw new RuntimeException("所选科研管理费申请的申请金额大于目前可申请金额，撤销失败！");
                            } else {
                                deductManageMoneyTotal(manageMoneyApply.getApplyId());
                            }
                        }
                    } else {
                        throw new RuntimeException("不可越级操作，撤销失败！");
                    }
                }
            } else if (manageMoneyApply.getAuditStatusId() == 6) {
                if ("agree".equals(auditObjectVo.getOperation())) {
                    manageMoneyApply.setAuditStatusId(8);//已报销
                    updatePaymentMoney(manageMoneyApply);
                } else if ("revoke".equals(auditObjectVo.getOperation())) {
                    //判断三审是否存在
                    if (manageMoneyApply.getAuditPersonId3()!=null){
                        //存在三审，判断登录人是否为三审，若是则撤销成功，若否则撤销失败
                        if (activeUser.getWorkNameAndNum().equals(manageMoneyApply.getAuditPersonId3())) {
                            manageMoneyApply.setAuditStatusId(4);//三审撤销审核
                            manageMoneyApply.setAuditPoinion3("");//撤销审核时，清除审核意见
                        } else {
                            throw new RuntimeException("不可越级操作，撤销失败！");
                        }
                    }else if (manageMoneyApply.getAuditPersonId2()!=null){
                        //三审不存在，判断二审是否存在，判断登录人是否为二审
                        if (activeUser.getWorkNameAndNum().equals(manageMoneyApply.getAuditPersonId2())){
                            manageMoneyApply.setAuditStatusId(2);//撤销为待二审状态
                            manageMoneyApply.setAuditPoinion2("");//撤销审核时，清除审核意见
                        }else {
                            throw new RuntimeException("不可越级操作，撤销失败！");
                        }
                    }else {
                        //二、三审核人均不存在，即只指定了一级审核人
                        manageMoneyApply.setAuditStatusId(1);//修改为待一审
                        manageMoneyApply.setAuditPoinion1("");//撤销审核时，清除审核意见
                    }

                }
            } else if (manageMoneyApply.getAuditStatusId() == 7) {
                if ("revoke".equals(auditObjectVo.getOperation())) {
                    if (activeUser.getWorkNameAndNum().equals(manageMoneyApply.getAuditPersonId3())) {
                        manageMoneyApply.setAuditStatusId(4);//三审撤销审核
                        manageMoneyApply.setAuditPoinion3("");//撤销审核时，清除审核意见
                        //撤销审核不通过的审核时，判断总金额是否足够，若足够则将金额从总金额中扣除，否则抛出异常
                        List<ManageMoneyTotal> totalList = findTotalByCollegeIdAndYear(manageMoneyApply.getCollegeId(), manageMoneyApply.getApplyYear());
                        if (totalList.size() > 0) {
                            ManageMoneyTotal total = totalList.get(0);
                            if (manageMoneyApply.getApplyMoney() > total.getAvailApply()) {
                                throw new RuntimeException("所选科研管理费申请的申请金额大于目前可申请金额，撤销失败！");
                            } else {
                                deductManageMoneyTotal(manageMoneyApply.getApplyId());
                            }
                        }
                    } else {
                        throw new RuntimeException("不可越级操作，撤销失败！");
                    }
                }
            }
            //调用mapper自带update方法逐个修改
            manageMoneyApplyMapper.updateByPrimaryKeySelective(manageMoneyApply);
        }
    }
}
