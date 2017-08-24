package com.hebeu.keyan.service.impl;

import com.hebeu.keyan.dao.EIncludeMapper;
import com.hebeu.keyan.dao.IncludeToolMapper;
import com.hebeu.keyan.po.EInclude;
import com.hebeu.keyan.po.EIncludeExample;
import com.hebeu.keyan.po.IncludeTool;
import com.hebeu.keyan.po.IncludeToolExample;
import com.hebeu.keyan.service.IncludeListService;
import com.hebeu.keyan.vo.IncludeListVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 作者：冯嘉龙
 * 时间：2017-08-22  16:42
 * 描述：论文收录相关处理业务实现类
 */
@Service
public class IncludeListServiceImpl implements IncludeListService {
    private final EIncludeMapper eIncludeMapper;
    private final IncludeToolMapper includeToolMapper;

    @Autowired
    public IncludeListServiceImpl(EIncludeMapper eIncludeMapper, IncludeToolMapper includeToolMapper) {
        this.eIncludeMapper = eIncludeMapper;
        this.includeToolMapper = includeToolMapper;
    }

    /**
     * 查询所有的收录工具
     *
     * @return 所有的收录工具集合
     */
    @Override
    public List<IncludeTool> findAllEIncludeTool() {
        IncludeToolExample includeToolExample = new IncludeToolExample();
        IncludeToolExample.Criteria criteria = includeToolExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return includeToolMapper.selectByExample(includeToolExample);
    }

    /**
     * 通过接收的includeListVO对象转为集合
     *
     * @param includeListVOs 对象
     * @return 返回List<includeListVO>集合
     */
    @Override
    public List<IncludeListVO> getIncludeList(IncludeListVO includeListVOs) {
        //如果列表为空就返回null
        if (includeListVOs.getIncludeNumber() == null) {
            return null;
        }
        List<IncludeListVO> includeListVOList = new ArrayList<>();
        //将每个属性进行字符串切割，得到数组，然后将数组转换成集合
        String[] includeDateArr = includeListVOs.getIncludeDate().split(",");
        String[] includeToolIdArr = includeListVOs.getIncludeToolId().split(",");
        String[] includeToolNameArr = includeListVOs.getIncludeToolName().split(",");
        String[] includeNumberArr = includeListVOs.getIncludeNumber().split(",");
        String[] statusIdArr = includeListVOs.getStatusId().split(",");
        for (int i = 0; i < includeDateArr.length; i++) {
            IncludeListVO includeListVO = new IncludeListVO(includeDateArr[i], includeToolIdArr[i], includeToolNameArr[i], includeNumberArr[i], statusIdArr[i]);
            includeListVOList.add(includeListVO);
        }
        return includeListVOList;
    }
}
