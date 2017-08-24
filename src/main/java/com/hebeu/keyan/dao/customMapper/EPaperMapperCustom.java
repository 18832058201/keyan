package com.hebeu.keyan.dao.customMapper;

import com.hebeu.keyan.po.customPO.EIncludeCustom;
import com.hebeu.keyan.po.customPO.EPaperCustom;
import com.hebeu.keyan.vo.PersonListVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 作者：冯嘉龙
 * 时间：2017-08-22  8:59
 * 描述：论文  Mapper拓展接口，主要是实现自定义查询
 */
@Repository
public interface EPaperMapperCustom {
    /**
     * 根据 工号 查询 论文 列表
     *
     * @param workNum 工号
     * @return 返回指定 工号 的 论文 集合
     */
    public List<EPaperCustom> selectPaperResultByWorkNum(String workNum);

    /**
     * 根据 论文编号 查询 论文
     * @param paperId 论文编号
     * @return 返回指定 论文编号 的论文信息
     */
    public EPaperCustom selectPaperResultInfoByPaperId(String paperId);

    /**
     * 查询指定 论文 的人员列表
     * @param paperId 论文
     * @return 返回指定 论文 的 人员列表集合
     */
    public List<PersonListVO> selectPersonListByPaperId(String paperId);

    /**
     * 查询指定 论文 的人员列表
     * @param paperId 论文
     * @return 返回指定 论文 的 人员列表集合
     */
    public List<EIncludeCustom> selectIncludeListByPaperId(String paperId);
}
