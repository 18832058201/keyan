package com.hebeu.keyan.service;

import com.hebeu.keyan.po.customPO.EStandardCustom;
import com.hebeu.keyan.vo.PersonListVO;
import com.hebeu.keyan.vo.StandardResultVO;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 作者：张彤
 * 时间：2017/8/11 17:35
 * 描述：标准管理业务处理接口
 */
public interface StandardResultService {

    /**
     * 通过工号查询标准管理集合
     * @param workNum  指定查询的工号
     * @return  返回指定工号的标准管理的集合
     */
   public List<EStandardCustom> findStandardListByWorkNum(String workNum);

    /**
     * 插入记录
     * @param standardResultVO 项目值对象
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void insertStandardResult(StandardResultVO standardResultVO);

    /**
     * 通过标准管理id查询详细信息
     * @param standardId  标准管理id
     * @return  返回标准管理对象
     */
    public EStandardCustom findStandardResultById(String standardId);

    /**
     * 通过标准管理id查询标准管理的人员列表的详细信息
     * @param standardId  标准管理id
     * @return  返回标准管理的人员列表对象
     */
    public List<PersonListVO> findPersonListByStandardId(String standardId);

    /**
     * 编辑项目
     * @param standardResultVO  项目值对象
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void updateStandardResult(StandardResultVO standardResultVO);

    /**
     * 检查是否存在同标准号的标准管理
     * @param standardResultVO  项目对象
     * @return 存在返回true，不存在返回false
     */
    public boolean standNumberIsExisted(StandardResultVO standardResultVO);

    /**
     * 删除指定id的标准管理
     * @param standardId 标准管理id
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void deleteStandardResultByStandardId(String standardId);
}
