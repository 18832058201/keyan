package com.hebeu.keyan.service;

import com.hebeu.keyan.po.EInclude;
import com.hebeu.keyan.po.IncludeTool;
import com.hebeu.keyan.vo.IncludeListVO;

import java.util.List;

/**
 * 作者：冯嘉龙
 * 时间：2017-08-22  16:42
 * 描述：收录列表处理业务接口
 */
public interface IncludeListService {
    /**
     * 查询所有的收录工具
     * @return 查询所有的收录工具
     */
    public List<IncludeTool> findAllEIncludeTool();

    /**
     * 通过接收的includeListVO对象转为集合
     * @param includeListVOs 对象
     * @return 返回List<includeListVO>集合
     */
    public List<IncludeListVO> getIncludeList(IncludeListVO includeListVOs);
}
