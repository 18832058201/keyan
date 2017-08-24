package com.hebeu.keyan.dao.customMapper;

import com.hebeu.keyan.po.customPO.EProjectCustom;
import com.hebeu.keyan.vo.PersonListVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 作者：陈德华
 * 时间：2017/8/4 16:50
 * 描述：项目Mapper拓展接口，主要是实现自定义查询
 */
@Repository
public interface EProjectMapperCustom {

    /**
     * 通过项目id查询项目详情
     * @param projectId 项目id
     * @return 返回项目详情
     */
    public EProjectCustom selectProjectInfoById(String projectId);


    /**
     * 根据工号查询项目列表
     * @param workNum 工号
     * @return 返回指定工号的项目集合
     */
    public List<EProjectCustom> selectProjectByWorkNum(String workNum);

    /**
     * 查询指定项目的人员列表
     * @param projectId 项目id
     * @return 返回指定项目的人员列表集合
     */
    public List<PersonListVO> selectPersonListByProjectId(String projectId);


}
