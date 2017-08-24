package com.hebeu.keyan.service;

import com.hebeu.keyan.po.customPO.EIncludeCustom;
import com.hebeu.keyan.po.customPO.EPaperCustom;
import com.hebeu.keyan.vo.IncludeListVO;
import com.hebeu.keyan.vo.PaperResultVO;
import com.hebeu.keyan.vo.PersonListVO;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 作者：冯嘉龙
 * 时间：2017-08-22  8:41
 * 描述：
 */
public interface PaperResultService {
    /**
     * 通过 工号 查询 论文 集合
     * @param workNum 指定查询的工号
     * @return 返回指定 工号 的 论文 集合
     */
    public List<EPaperCustom> findPaperResultListByWorkNum(String workNum);

    /**
     * 插入论文
     * @param paperResultVO 项目值对象
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void insertPaperResult(PaperResultVO paperResultVO);

    /**
     * 通过论文id查询 论文 详细信息
     * @param paperId 论文id
     * @return 返回论文对象
     */
    public EPaperCustom findPaperResultByPaperId(String paperId);

    /**
     * 通过论文id查询 论文 人员列表详细信息
     * @param paperId 论文id
     * @return 返回论文 人员列表对象
     */
    public List<PersonListVO> findPersonListByPaperId(String paperId);

    /**
     * 通过论文id查询 论文 收录列表
     * @param paperId 论文id
     * @return 返回论文 收录列表
     */
    public List<EIncludeCustom> findIncludeListByPaperId(String paperId);

    /**
     * 编辑论文
     * @param paperResultVO 项目值对象
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void updatePaperResult(PaperResultVO paperResultVO);

    /**
     * 检查是否存在同名论文
     * @param paperResultVO 项目对象
     * @return 存在就返回true  ，不存在返回false
     */
    public boolean paperNameIsExisted(PaperResultVO paperResultVO);

    /**
     * 删除指定id的论文
     * @param paperId
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void deletePaperResultByPaperId(String paperId);

    /**
     * 单独提交论文收录
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void updateInclude(PaperResultVO paperResultVO);
}
