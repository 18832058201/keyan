package com.hebeu.keyan.service;

import com.hebeu.keyan.po.customPO.ERewardCustom;
import com.hebeu.keyan.vo.PersonListVO;
import com.hebeu.keyan.vo.RewardResultVO;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 作者：冯嘉龙
 * 时间：2017/8/9  18:15
 * 描述：获奖成果相关处理类接口
 */
public interface RewardResultService {
    /**
     * 通过工号查询获奖成果集合
     *
     * @param workNum 指定查询的工号
     * @return 返回指定工号的获奖成果集合
     */
    public List<ERewardCustom> findRewardResultListByWorkNum(String workNum);

    /**
     * 插入获奖成果
     *
     * @param rewardResultVO 项目值对象
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void insertRewardResult(RewardResultVO rewardResultVO);

    /**
     * 通过获奖成果id查询获奖成果详细信息
     *
     * @param rewardId 获奖成果id
     * @return 返回获奖成果对象
     */
    public ERewardCustom findRewardResultByRewardId(String rewardId);

    /**
     * 通过获奖成果id查询获奖成果人员列表详细信息
     *
     * @param rewardId 获奖成果id
     * @return 返回获奖成果 人员列表对象
     */
    public List<PersonListVO> findPersonListByRewardId(String rewardId);

    /**
     * 编辑获奖成果
     *
     * @param rewardResultVO 项目值对象
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void updateRewardResult(RewardResultVO rewardResultVO);

    /**
     * 检查是否存在同名获奖成果
     * @param rewardResultVO 项目对象
     * @return 存在就返回true  ，不存在返回false
     */
    public boolean rewardNameIsExisted(RewardResultVO rewardResultVO);

    /**
     * 删除指定id的获奖成果
     * @param rewardId
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void deleteRewardResultByRewardId(String rewardId);
}
