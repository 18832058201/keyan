package com.hebeu.keyan.service;


import com.hebeu.keyan.po.customPO.EBookCustom;
import com.hebeu.keyan.vo.BookResultVO;
import com.hebeu.keyan.vo.PersonListVO;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 作者：冯嘉龙
 * 时间：2017/8/5  9:18
 * 描述：著作成果处理业务接口
 */
public interface BookResultService {
    /**
     * 通过 工号 查询 著作成果 集合
     *
     * @param workNum 指定查询的工号
     * @return 返回指定 工号 的 著作成果 集合
     */
    public List<EBookCustom> findBookResultListByWorkNum(String workNum);

    /**
     * 插入项目
     *
     * @param bookResultVO 项目值对象
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void insertBookResult(BookResultVO bookResultVO);

    /**
     * 通过著作成果id查询 著作成果 详细信息
     *
     * @param bookId 著作成果id
     * @return 返回著作成果对象
     */
    public EBookCustom findBookResultById(String bookId);

    /**
     * 通过著作成果id查询 著作成果 人员列表详细信息
     *
     * @param bookId 著作成果id
     * @return 返回著作成果 人员列表对象
     */
    public List<PersonListVO> findPersonListByBookId(String bookId);

    /**
     * 编辑项目
     *
     * @param bookResultVO 项目值对象
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void updateBookResult(BookResultVO bookResultVO);

    /**
     * 检查是否存在同名著作成果
     * @param bookResultVO 项目对象
     * @return 存在就返回true  ，不存在返回false
     */
    public boolean bookNameIsExisted(BookResultVO bookResultVO);

    /**
     * 删除指定id的著作成果
     * @param bookId
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void deleteBookResultByBookId(String bookId);
}
