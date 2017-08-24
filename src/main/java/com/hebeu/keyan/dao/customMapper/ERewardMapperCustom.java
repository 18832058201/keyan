package com.hebeu.keyan.dao.customMapper;

import com.hebeu.keyan.po.customPO.ERewardCustom;
import com.hebeu.keyan.vo.PersonListVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 作者：冯嘉龙
 * 时间：2017/8/9  17:56
 * 描述：描述：获奖成果 Mapper拓展接口，主要是实现自定义查询
 */
@Repository
public interface ERewardMapperCustom {
    /**
     * 根据工号查询reward列表
     *
     * @param workNum 工号
     * @return 返回指定工号的reward集合
     */
    public List<ERewardCustom> selectRewardResultByWorkNum(String workNum);

    /**
     * 根据 获奖成果编号 查询 获奖成果
     *
     * @param rewardId 获奖成果编号
     * @return 返回指定 获奖成果编号 的获奖成果信息
     */
    public ERewardCustom selectRewardResultInfoByRewardId(String rewardId);

    /**
     * 查询指定 获奖成果 的人员列表
     * @param rewardId 获奖成果
     * @return 返回指定 获奖成果 的 人员列表集合
     */
    public List<PersonListVO> selectPersonListByRewardId(String rewardId);
}
