package com.hebeu.keyan.vo;

import com.hebeu.keyan.po.BudgetMoney;
import com.hebeu.keyan.po.EProject;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * 作者：陈德华
 * 时间：2017/8/3 17:19
 * 描述：项目的值对象,用于接收前台数据
 */
public class ProjectVO extends EProject{

    //接收前台数据时用的属性
    private MultipartFile file;        //上传的文件
    private PersonListVO personListVO; //用于保存前台的人员列表数据，通过PersonLISVO对象获取后再设置
    private List<PersonListVO> personListVOList;  //用于存放将人员列表字符串转成人员列表的集合
    private String submitType;    //操作类型  save为保存操作 ，submit为提交操作
    private BudgetMoney budgetMoney ;  //预算金额

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public PersonListVO getPersonListVO() {
        return personListVO;
    }

    public void setPersonListVO(PersonListVO personListVO) {
        this.personListVO = personListVO;
    }

    public List<PersonListVO> getPersonListVOList() {
        return personListVOList;
    }

    public void setPersonListVOList(List<PersonListVO> personListVOList) {
        this.personListVOList = personListVOList;
    }

    public String getSubmitType() {
        return submitType;
    }

    public void setSubmitType(String submitType) {
        this.submitType = submitType;
    }

    public BudgetMoney getBudgetMoney() {
        return budgetMoney;
    }

    public void setBudgetMoney(BudgetMoney budgetMoney) {
        this.budgetMoney = budgetMoney;
    }

    @Override
    public String toString() {
        return super.toString() + "ProjectVO{" +
                "file=" + file +
                ", personListVO=" + personListVO +
                ", personListVOList=" + personListVOList +
                ", submitType='" + submitType + '\'' +
                ", budgetMoney=" + budgetMoney +
                '}';
    }
}
