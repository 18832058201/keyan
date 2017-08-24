package com.hebeu.keyan.dao.customMapper;

import com.hebeu.keyan.po.EPerson;
import com.hebeu.keyan.po.customPO.AllProjectCustom;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 作者：陈德华
 * 时间：2017/8/3 23:47
 * 描述：公共查询方法接口
 */
@Repository("CommonMapper")
public interface CommonMapper {

    /**
     * 查询指定表中的最大校内编号
     * @param tableName 指定的表名
     * @param schoolNumber 模糊匹配的校内编号
     * @return 返回查询出来的校内编号
     */
    public String findSchoolNumber(@Param("tableName") String tableName,@Param("schoolNumber")String schoolNumber);

    /**
     * 查询manage_money_apply表中最大的校内编号
     * @return 最大校内编号
     */
    public String findMaxApplyId();

    /**
     * 查询e_person_edit表中最大的校内编号
     * @return 最大校内编号
     */
    public String findMaxPersonEditId();
    /**
     * 查询e_include表中最大的校内编号
     * @return 最大校内编号
     */
    public String findMaxIncludeId();

    /**
     * 通过项目或成果id查询其类别
     * @param id 项目或成果的id
     * @return 返回类型
     */
    public Integer findTypeById(String id);

    /**
     * 查询个人参与的所有的项目（科研处审核通过的）
     * @param workNum 工号
     * @return 返回集合
     */
    public List<AllProjectCustom> findAllProjectByWorkNum(String workNum);

    /**
     * 查询所有在职人员的姓名、工号
     * @return 返回人员集合
     */
    public List<EPerson> selectAllPeople();

}
