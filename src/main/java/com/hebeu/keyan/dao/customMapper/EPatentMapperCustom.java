package com.hebeu.keyan.dao.customMapper;

import com.hebeu.keyan.po.customPO.EPatentCustom;
import com.hebeu.keyan.vo.PersonListVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/8/10.
 */
@Repository
public interface EPatentMapperCustom {
    public List<EPatentCustom> selectPatentByWorkNum(String workNum);
    public EPatentCustom selectPatentResultInfoById(String patentId);
    public List<PersonListVO> selectPersonListByPatentId(String patentId);
}
