package com.hebeu.keyan.service;

import com.hebeu.keyan.po.ECollege;
import com.hebeu.keyan.po.EDepartment;
import com.hebeu.keyan.po.RPersonProjectResult;
import com.hebeu.keyan.po.UserInfo;
import com.hebeu.keyan.vo.PersonListVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 作者：陈德华
 * 时间：2017/8/2 20:06
 * 描述：人员列表处理业务接口
 */
@Service
public interface PersonListService {

    /**
     * 查询所有的学院
     * @return 查询所有的学院
     */
    public List<ECollege> findECollege();

    /**
     * 通过学院id查询教研室
     * @param collegeId 学院编号
     * @return 返回指定范围内的教研室集合
     */
    public List<EDepartment> findEDepartmentByCollegeId(Integer collegeId);


    /**
     * 通过学院编号或教研室编号查询人员
     * @param collegeId 学院编号
     * @param departmentId 教研室编号
     * @return 返回指定范围的人员集合
     */
    public List<UserInfo> findUserInfoByCollegeIdOrDepartmentId(Integer collegeId,Integer departmentId);

    /**
     * 通过接收的PersonListVO对象转为集合
     * @param personListVO PersonListVO对象
     * @return 返回list集合
     */
    public List<PersonListVO> getPersonList(PersonListVO personListVO);

    /**
     * 向人员项目成果关系表插入数据
     * @param personListVOList 人员列表集合
     * @param rPersonProjectResult 关系表对象
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void insertRPersonProjectResult(List<PersonListVO> personListVOList, RPersonProjectResult rPersonProjectResult);
}
