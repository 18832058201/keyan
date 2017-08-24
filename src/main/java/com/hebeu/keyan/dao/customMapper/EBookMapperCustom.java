package com.hebeu.keyan.dao.customMapper;

import com.hebeu.keyan.po.customPO.EBookCustom;
import com.hebeu.keyan.vo.PersonListVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 作者：冯嘉龙
 * 时间：2017/8/5 10：25
 * 描述：著作成果 Mapper拓展接口，主要是实现自定义查询
 */
@Repository
public interface EBookMapperCustom {

    /**
     * 根据 工号 查询 著作成果 列表
     *
     * @param workNum 工号
     * @return 返回指定 工号 的 著作成果 集合
     */
    public List<EBookCustom> selectBookByWorkNum(String workNum);

    /**
     * 根据 著作成果编号 查询 著作成果 列表
     *
     * @param bookId 著作成果编号
     * @return 返回指定 著作成果编号 的 著作成果信息
     */
    public EBookCustom selectBookResultInfoById(String bookId);

    /**
     * 查询指定 著作编号 的人员列表
     * @param bookId 著作编号
     * @return 返回指定 著作编号 的 人员列表集合
     */
    public List<PersonListVO> selectPersonListByBookId(String bookId);
}
