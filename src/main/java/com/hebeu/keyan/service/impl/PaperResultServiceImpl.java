package com.hebeu.keyan.service.impl;

import com.hebeu.keyan.dao.EIncludeMapper;
import com.hebeu.keyan.dao.EPaperMapper;
import com.hebeu.keyan.dao.RPersonProjectResultMapper;
import com.hebeu.keyan.dao.customMapper.EPaperMapperCustom;
import com.hebeu.keyan.po.*;
import com.hebeu.keyan.po.customPO.EIncludeCustom;
import com.hebeu.keyan.po.customPO.EPaperCustom;
import com.hebeu.keyan.service.PaperResultService;
import com.hebeu.keyan.service.PersonListService;
import com.hebeu.keyan.utils.FileHandle;
import com.hebeu.keyan.utils.PaperIncludeCode;
import com.hebeu.keyan.utils.SchoolNumberGenerate;
import com.hebeu.keyan.utils.UUIDUtils;
import com.hebeu.keyan.vo.IncludeListVO;
import com.hebeu.keyan.vo.PaperResultVO;
import com.hebeu.keyan.vo.PersonListVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * 作者：冯嘉龙
 * 时间：2017-08-22  8:41
 * 描述：论文 业务处理实现类
 */
@Service
public class PaperResultServiceImpl implements PaperResultService {
    private final EPaperMapperCustom ePaperMapperCustom;
    private final EPaperMapper ePaperMapper;
    private final SchoolNumberGenerate schoolNumberGenerate;
    private final PersonListService personListService;
    private final RPersonProjectResultMapper rPersonProjectResultMapper;
    private final PaperIncludeCode paperIncludeCode;
    private final EIncludeMapper eIncludeMapper;

    @Autowired
    public PaperResultServiceImpl(EPaperMapperCustom ePaperMapperCustom, EPaperMapper ePaperMapper, SchoolNumberGenerate schoolNumberGenerate, PersonListService personListService, RPersonProjectResultMapper rPersonProjectResultMapper, PaperIncludeCode paperIncludeCode, EIncludeMapper eIncludeMapper) {
        this.ePaperMapperCustom = ePaperMapperCustom;
        this.ePaperMapper = ePaperMapper;
        this.schoolNumberGenerate = schoolNumberGenerate;
        this.personListService = personListService;
        this.rPersonProjectResultMapper = rPersonProjectResultMapper;
        this.paperIncludeCode = paperIncludeCode;
        this.eIncludeMapper = eIncludeMapper;
    }

    /**
     * 通过 工号 查询 论文 集合
     *
     * @param workNum 指定查询的工号
     * @return 返回指定 工号 的 论文 集合
     */
    @Override
    public List<EPaperCustom> findPaperResultListByWorkNum(String workNum) {
        return ePaperMapperCustom.selectPaperResultByWorkNum(workNum);
    }

    /**
     * 插入 论文（包括保存和提交）
     *
     * @param paperResultVO 论文 值对象
     */
    @Override
    public void insertPaperResult(PaperResultVO paperResultVO) {
        if (this.paperNameIsExisted(paperResultVO)) {
            throw new RuntimeException("输入的名称已存在，请重新输入");
        }
        try {
            //通过 论文 信息中的人员字符串得到人员列表集合
            List<PersonListVO> personListVOList = paperResultVO.getPersonListVOList();
            /*start：设置 论文 的属性值并保存到数据库*/
            //判断操作类型，为submit提交就 生成校内编号，并且将审核状态设置为1
            if ("submit".equals(paperResultVO.getSubmitType())) {
                schoolNumberGenerate.setSchoolNumber(paperResultVO);                         //提交时生成 论文 编号
                paperResultVO.setAuditStatusId(2);                                           //保存时将状态设置为2 ，即待学院审核状态
            } else if ("save".equals(paperResultVO.getSubmitType())) {
                paperResultVO.setAuditStatusId(1);                                           //保存时将状态设置为1 ，即未提交状态
            }
            //下边设置保存提交都相同的属性
            paperResultVO.setPaperId(UUIDUtils.getUUID());                               //生成 论文 主键
            //取集合中第一个为负责人并设置到 论文 信息
            //-3表示校外人员，-2表示学生，其他情况表示校内教师
            if ("-3".equals(personListVOList.get(0).getWorkNum())) {
                paperResultVO.setLeader("校外人员：" + personListVOList.get(0).getWorkName());
            } else if ("-2".equals(personListVOList.get(0).getWorkNum())) {
                paperResultVO.setLeader("学生：" + personListVOList.get(0).getWorkName());
            } else {
                paperResultVO.setLeader(personListVOList.get(0).getWorkName() + "(" + personListVOList.get(0).getWorkNum() + ")");
            }
            paperResultVO.setAttachment(FileHandle.fileUpload(FileHandle.PAPERRESULT, paperResultVO.getFile(), paperResultVO.getPaperId())); //保存文件并得到文件名
            paperResultVO.setPersonList(paperResultVO.getPersonListVO().getWorkName());          //设置人员列表字符串
            paperResultVO.setInsertTime(new Date());                                         //设置当前系统时间为插入时间
            paperResultVO.setLastTime(new Date());                                           //设置当前系统时间为最后更新时间
            System.out.println(paperResultVO.toString());
            ePaperMapper.insertSelective(paperResultVO);                                   //向数据库插入 论文 数据
            /*end：设置 论文 的属性值并保存到数据库*/

            /*start：向人员项目成果关系表中插数据*/
            //创建关系表对象，需要初始化 （项目或成果id，类型，项目或成果名称，关键性时间）四个属性值
            RPersonProjectResult r = new
                    RPersonProjectResult(paperResultVO.getPaperId(), 14, paperResultVO.getPaperName(), paperResultVO.getPublishDate());
            personListService.insertRPersonProjectResult(personListVOList, r);        //传入人员列表和对应项目中的属性对象
            /*end：向人员项目成果关系表中插数据*/
            /*向e_include表中插入数据*/
            //获取收录集合
            List<IncludeListVO> includeListVOList = paperResultVO.getIncludeListVO();
            if (paperResultVO.getIncludeListVO() != null) {
                for (IncludeListVO includeListVO : includeListVOList) {
                    EInclude eInclude = new EInclude();
                    eInclude.setIncludeId(paperIncludeCode.getIncludeCode());
                    eInclude.setIncludeDate(java.sql.Date.valueOf(includeListVO.getIncludeDate()));
                    eInclude.setIncludeToolId(Integer.valueOf(includeListVO.getIncludeToolId()));
                    eInclude.setIncludeNumber(includeListVO.getIncludeNumber());
                    eInclude.setPaperId(paperResultVO.getPaperId());
                    eInclude.setRegistrant(paperResultVO.getRegistrant());
                    eInclude.setAuditStatusId(paperResultVO.getAuditStatusId());
                    eInclude.setInsertTime(new Date());//设置当前系统时间为插入时间
                    eInclude.setLastTime(new Date());//设置当前系统时间为最后更新时间
                    eIncludeMapper.insertSelective(eInclude);//插入到数据库
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("插入数据失败");
        }
    }

    /**
     * 通过主键id查询成果的详细信息
     *
     * @param paperId 论文id
     * @return 返回论文对象
     */
    @Override
    public EPaperCustom findPaperResultByPaperId(String paperId) {
        return ePaperMapperCustom.selectPaperResultInfoByPaperId(paperId);
    }

    /**
     * 通过指定主键id查询对应的人员列表
     *
     * @param paperId 论文id
     * @return 返回人员列表集合
     */
    @Override
    public List<PersonListVO> findPersonListByPaperId(String paperId) {
        return ePaperMapperCustom.selectPersonListByPaperId(paperId);
    }

    /**
     * 通过指定主键id查询对应的收录列表
     *
     * @param paperId 论文id
     * @return 返回收录列表集合
     */
    @Override
    public List<EIncludeCustom> findIncludeListByPaperId(String paperId) {
        return ePaperMapperCustom.selectIncludeListByPaperId(paperId);
    }

    /**
     * 编辑成果信息
     *
     * @param paperResultVO 成果值对象
     */
    @Override
    public void updatePaperResult(PaperResultVO paperResultVO) {
        if (this.paperNameIsExisted(paperResultVO)) {
            throw new RuntimeException("输入的名称已存在，请重新输入");
        }
        try {
            //通过 成果对象 信息中的人员字符串得到人员列表集合
            List<PersonListVO> personListVOList = paperResultVO.getPersonListVOList();
            /*start：设置 论文 的属性值并保存到数据库*/
            //判断操作类型，为submit提交就 生成校内编号，并且将审核状态设置为1
            if ("submit".equals(paperResultVO.getSubmitType())) {
                schoolNumberGenerate.setSchoolNumber(paperResultVO);                         //提交时生成 论文 编号
                paperResultVO.setAuditStatusId(2);                                           //保存时将状态设置为2 ，即待学院审核状态
            } else if ("save".equals(paperResultVO.getSubmitType())) {
                paperResultVO.setAuditStatusId(1);                                           //保存时将状态设置为1 ，即未提交状态
            }
            //下边设置保存提交都相同的属性
            //取集合中第一个为负责人并设置到 论文 信息
            //-3表示校外人员，-2表示学生，其他情况表示校内教师
            if ("-3".equals(personListVOList.get(0).getWorkNum())) {
                paperResultVO.setLeader("校外人员：" + personListVOList.get(0).getWorkName());
            } else if ("-2".equals(personListVOList.get(0).getWorkNum())) {
                paperResultVO.setLeader("学生：" + personListVOList.get(0).getWorkName());
            } else {
                paperResultVO.setLeader(personListVOList.get(0).getWorkName() + "(" + personListVOList.get(0).getWorkNum() + ")");
            }
            paperResultVO.setAttachment(FileHandle.fileUpload(FileHandle.PAPERRESULT, paperResultVO.getFile(), paperResultVO.getPaperId())); //保存文件并得到文件名
            paperResultVO.setPersonList(paperResultVO.getPersonListVO().getWorkName());          //设置人员列表字符串
            paperResultVO.setLastTime(new Date());                                         //设置当前系统时间为最后更新时间
            System.out.println(paperResultVO.toString());
            ePaperMapper.updateByPrimaryKeySelective(paperResultVO);                        //更新 论文 数据
            /*end：设置 论文 的属性值并保存到数据库*/

            /*start：删除人员项目成果关系表中需此论文id的所有数据*/
            RPersonProjectResultExample rPersonProjectResultExample = new RPersonProjectResultExample();
            RPersonProjectResultExample.Criteria criteria = rPersonProjectResultExample.createCriteria();
            criteria.andIdEqualTo(paperResultVO.getPaperId());
            rPersonProjectResultMapper.deleteByExample(rPersonProjectResultExample);
            /*end：删除人员项目成果关系表中需此论文id的所有数据*/
            /*start：向人员项目关系表中插数据*/
            //创建关系表对象，需要初始化 （项目或成果id，类型，项目或成果名称，关键性时间）四个属性值
            RPersonProjectResult r = new
                    RPersonProjectResult(paperResultVO.getPaperId(), 14, paperResultVO.getPaperName(), paperResultVO.getPublishDate());
            personListService.insertRPersonProjectResult(personListVOList, r);        //传入人员列表和对应项目中的属性对象
            /*end：向人员项目关系表中插数据*/

            /*start：操作论文收录表（e_include）*/
            //1. 查询原来的信息，并删除对应论文id的所有数据
            EIncludeExample eIncludeExample = new EIncludeExample();
            EIncludeExample.Criteria criteria1 = eIncludeExample.createCriteria();
            criteria1.andPaperIdEqualTo(paperResultVO.getPaperId());
            eIncludeMapper.deleteByExample(eIncludeExample);

            //2. 获取前台的收录集合
            List<IncludeListVO> includeListVOList = paperResultVO.getIncludeListVO();
            if (paperResultVO.getIncludeListVO() != null) {
                //3. 将新数据插入到表格中
                for (IncludeListVO includeListVO : includeListVOList) {
                    EInclude eInclude = new EInclude();
                    eInclude.setIncludeId(paperIncludeCode.getIncludeCode());
                    eInclude.setIncludeDate(java.sql.Date.valueOf(includeListVO.getIncludeDate()));
                    eInclude.setIncludeToolId(Integer.valueOf(includeListVO.getIncludeToolId()));
                    eInclude.setIncludeNumber(includeListVO.getIncludeNumber());
                    eInclude.setPaperId(paperResultVO.getPaperId());
                    eInclude.setRegistrant(paperResultVO.getRegistrant());
                    eInclude.setAuditStatusId(paperResultVO.getAuditStatusId());
                    eInclude.setInsertTime(new Date());//设置当前系统时间为插入时间
                    eInclude.setLastTime(new Date());//设置当前系统时间为最后更新时间
                    eIncludeMapper.insertSelective(eInclude);//插入到数据库
                }
            }
            /*end：操作论文收录表（e_include）*/
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("插入数据失败");
        }
    }

    /**
     * 检查是否存在同名论文输入的名称
     *
     * @param paperResultVO 项目对象
     * @return 存在就返回true  ，不存在返回false
     */
    @Override
    public boolean paperNameIsExisted(PaperResultVO paperResultVO) {
        //传入的论文输入的项目名为空时返回false表示不存在
        if (paperResultVO.getPaperName() == null) {
            return false;
        }
        EPaperExample ePaperExample = new EPaperExample();
        EPaperExample.Criteria criteria = ePaperExample.createCriteria();
        criteria.andPaperNameEqualTo(paperResultVO.getPaperName());
        if (paperResultVO.getPaperId() != null) {
            criteria.andPaperIdNotEqualTo(paperResultVO.getPaperId());//排除自身
        }
        return ePaperMapper.selectByExample(ePaperExample).size() > 0;//大于0返回true表示存在该名称
    }

    /**
     * 删除指定id的论文
     *
     * @param paperId 论文编号
     */
    @Override
    public void deletePaperResultByPaperId(String paperId) {
        try {
            //先查询出要删除的论文
            EPaper ePaper = ePaperMapper.selectByPrimaryKey(paperId);
            //删除论文收录表(e_include)数据
            EIncludeExample eIncludeExample = new EIncludeExample();
            EIncludeExample.Criteria criteria1 = eIncludeExample.createCriteria();
            criteria1.andPaperIdEqualTo(paperId);
            eIncludeMapper.deleteByExample(eIncludeExample);
            //删除人员项目成果关系表的数据
            RPersonProjectResultExample rPersonProjectResultExample = new RPersonProjectResultExample();
            RPersonProjectResultExample.Criteria criteria = rPersonProjectResultExample.createCriteria();
            criteria.andIdEqualTo(paperId);
            rPersonProjectResultMapper.deleteByExample(rPersonProjectResultExample);
            //从e_reward表删除论文
            ePaperMapper.deleteByPrimaryKey(paperId);
            //删除相关的附件，最后进行删除附件操作，如果前面删除失败就不会删除附件
            FileHandle.deleteFile(FileHandle.PAPERRESULT, ePaper.getAttachment());
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("删除该成果失败");
        }
    }

    /**
     * 单独提交论文收录
     */
    @Override
    public void updateInclude(PaperResultVO paperResultVO) {
        try {
            /*start：操作论文收录表（e_include）*/
            //1. 查询原来的信息，并删除对应论文id的所有数据
            EIncludeExample eIncludeExample = new EIncludeExample();
            EIncludeExample.Criteria criteria1 = eIncludeExample.createCriteria();
            criteria1.andPaperIdEqualTo(paperResultVO.getPaperId());
            eIncludeMapper.deleteByExample(eIncludeExample);
            //2. 获取前台的收录集合
            List<IncludeListVO> includeListVOList = paperResultVO.getIncludeListVO();
            if (paperResultVO.getIncludeListVO() != null) {
                //3. 将新数据插入到表格中
                for (IncludeListVO includeListVO : includeListVOList) {
                    EInclude eInclude = new EInclude();
                    eInclude.setIncludeId(paperIncludeCode.getIncludeCode());
                    eInclude.setIncludeDate(java.sql.Date.valueOf(includeListVO.getIncludeDate()));
                    eInclude.setIncludeToolId(Integer.valueOf(includeListVO.getIncludeToolId()));
                    eInclude.setIncludeNumber(includeListVO.getIncludeNumber());
                    eInclude.setPaperId(paperResultVO.getPaperId());
                    eInclude.setRegistrant(paperResultVO.getRegistrant());
                    if (Integer.valueOf(includeListVO.getStatusId()) == 1) {
                        if (paperResultVO.getAuditStatusId() == 1) {
                            eInclude.setAuditStatusId(1);
                        } else if (paperResultVO.getAuditStatusId() == 2 || paperResultVO.getAuditStatusId() == 3 || paperResultVO.getAuditStatusId() == 5) {
                            eInclude.setAuditStatusId(2);
                        } else if (paperResultVO.getAuditStatusId() == 4 || paperResultVO.getAuditStatusId() == 6) {
                            eInclude.setAuditStatusId(paperResultVO.getAuditStatusId());
                        }
                    } else {
                        eInclude.setAuditStatusId(Integer.valueOf(includeListVO.getStatusId()));
                    }
                    eInclude.setInsertTime(new Date());//设置当前系统时间为插入时间
                    eInclude.setLastTime(new Date());//设置当前系统时间为最后更新时间
                    eIncludeMapper.insertSelective(eInclude);//插入到数据库
                }
            }
            /*end：操作论文收录表（e_include）*/
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("插入数据失败");
        }
    }
}
