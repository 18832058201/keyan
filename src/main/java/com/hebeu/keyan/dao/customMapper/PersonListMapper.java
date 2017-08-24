package com.hebeu.keyan.dao.customMapper;

import com.hebeu.keyan.po.ECollege;
import com.hebeu.keyan.po.EDepartment;
import com.hebeu.keyan.po.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 作者：陈德华
 * 时间：2017/8/2 20:23
 * 描述：学院mapper拓展接口
 */
@Repository
public interface PersonListMapper {

    /**
     * 查询学院，按学院名来排序
     * @param order 升序或降序或默认排序 ASC为升序，DESC为降序，DEFAULT为默认排序
     * @return 返回排序后的学院集合
     */
    public List<ECollege> selectECollegeOrderbyName(@Param("order") String order);


    /**
     * 查询教研室，按教研室名称来排序
     * @param collegeId 学院id
     * @param order 升序或降序或默认排序 ASC为升序，DESC为降序，DEFAULT为默认排序
     * @return 返回排序后的教研室集合
     */
    public List<EDepartment> selectEDepartmentOrderByName(@Param("collegeId") Integer collegeId, @Param("order") String order);


    /**
     * 查询人员，按人员名称来排序
     * @param collegeId 学院id
     * @param departmentId 教研室id
     * @param order 升序或降序或默认排序 ASC为升序，DESC为降序，DEFAULT为默认排序
     * @return 返回排序后的人员集合
     */
    public List<UserInfo> selectUserInfoOrderByName(@Param("collegeId") Integer collegeId,@Param("departmentId") Integer departmentId,@Param("order") String order);
}
