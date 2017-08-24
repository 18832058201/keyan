package com.hebeu.keyan.service.impl;

import com.hebeu.keyan.dao.EBookMapper;
import com.hebeu.keyan.dao.RPersonProjectResultMapper;
import com.hebeu.keyan.dao.customMapper.EBookMapperCustom;
import com.hebeu.keyan.po.EBook;
import com.hebeu.keyan.po.EBookExample;
import com.hebeu.keyan.po.RPersonProjectResult;
import com.hebeu.keyan.po.RPersonProjectResultExample;
import com.hebeu.keyan.po.customPO.EBookCustom;
import com.hebeu.keyan.service.BookResultService;
import com.hebeu.keyan.service.PersonListService;
import com.hebeu.keyan.utils.FileHandle;
import com.hebeu.keyan.utils.SchoolNumberGenerate;
import com.hebeu.keyan.utils.UUIDUtils;
import com.hebeu.keyan.vo.BookResultVO;
import com.hebeu.keyan.vo.PersonListVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * 作者：冯嘉龙
 * 时间：2017/8/5  10:35
 * 描述：著作成果 处理业务实现类
 */
@Service
public class BookResultServiceImpl implements BookResultService {
    private final EBookMapper eBookMapper;
    private final SchoolNumberGenerate schoolNumberGenerate;
    private final EBookMapperCustom eBookMapperCustom;
    private final RPersonProjectResultMapper rPersonProjectResultMapper;
    private final PersonListService personListService;

    @Autowired
    public BookResultServiceImpl(EBookMapper eBookMapper, SchoolNumberGenerate schoolNumberGenerate, EBookMapperCustom eBookMapperCustom, RPersonProjectResultMapper rPersonProjectResultMapper, PersonListService personListService) {
        this.eBookMapper = eBookMapper;
        this.schoolNumberGenerate = schoolNumberGenerate;
        this.eBookMapperCustom = eBookMapperCustom;
        this.rPersonProjectResultMapper = rPersonProjectResultMapper;
        this.personListService = personListService;
    }

    /**
     * 通过 工号 查询 著作成果 集合
     *
     * @param workNum 指定查询的工号
     * @return 返回指定 工号 的 著作成果 集合
     */
    @Override
    public List<EBookCustom> findBookResultListByWorkNum(String workNum) {
        return eBookMapperCustom.selectBookByWorkNum(workNum);
    }

    /**
     * 插入 著作成果（包括保存和提交）
     *
     * @param bookResultVO 著作成果 值对象
     */
    @Override
    public void insertBookResult(BookResultVO bookResultVO) {
        if (this.bookNameIsExisted(bookResultVO)) {
            throw new RuntimeException("该著作成果名称已存在");
        }
        try {
            //通过 著作成果 信息中的人员字符串得到人员列表集合
            List<PersonListVO> personListVOList = bookResultVO.getPersonListVOList();
            /*start：设置 著作成果 的属性值并保存到数据库*/
            //判断操作类型，为submit提交就 生成校内编号，并且将审核状态设置为1
            if ("submit".equals(bookResultVO.getSubmitType())) {
                schoolNumberGenerate.setSchoolNumber(bookResultVO);                         //提交时生成 著作成果 编号
                bookResultVO.setAuditStatusId(2);                                           //保存时将状态设置为2 ，即待学院审核状态
            } else if ("save".equals(bookResultVO.getSubmitType())) {
                bookResultVO.setAuditStatusId(1);                                           //保存时将状态设置为1 ，即未提交状态
            }
            //下边设置保存提交都相同的属性
            bookResultVO.setBookId(UUIDUtils.getUUID());                                 //生成 著作成果 主键
            //取集合中第一个为负责人并设置到 著作成果 信息
            //-3表示校外人员，-2表示学生，其他情况表示校内教师
            if ("-3".equals(personListVOList.get(0).getWorkNum())) {
                bookResultVO.setLeader("校外人员：" + personListVOList.get(0).getWorkName());
            } else if ("-2".equals(personListVOList.get(0).getWorkNum())) {
                bookResultVO.setLeader("学生：" + personListVOList.get(0).getWorkName());
            } else {
                bookResultVO.setLeader(personListVOList.get(0).getWorkName() + "(" + personListVOList.get(0).getWorkNum() + ")");
            }
            bookResultVO.setAttachment(FileHandle.fileUpload(FileHandle.BOOKRESULT, bookResultVO.getFile(), bookResultVO.getBookId())); //保存文件并得到文件名
            bookResultVO.setPersonList(bookResultVO.getPersonListVO().getWorkName());          //设置人员列表字符串
            bookResultVO.setInsertTime(new Date());                                         //设置当前系统时间为插入时间
            bookResultVO.setLastTime(new Date());                                           //设置当前系统时间为最后更新时间
            System.out.println(bookResultVO.toString());
            eBookMapper.insertSelective(bookResultVO);                                   //向数据库插入 著作成果 数据
            /*end：设置 著作成果 的属性值并保存到数据库*/

            /*start：向人员项目关系表中插数据*/
            //创建关系表对象，需要初始化 （项目或成果id，类型，项目或成果名称，关键性时间）四个属性值
            RPersonProjectResult r = new
                    RPersonProjectResult(bookResultVO.getBookId(), 18, bookResultVO.getBookName(), bookResultVO.getPublishDate());
            personListService.insertRPersonProjectResult(personListVOList, r);        //传入人员列表和对应项目中的属性对象
            /*end：向人员项目关系表中插数据*/

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("插入数据失败");
        }
    }

    /**
     * 通过著作成果主键查询 著作成果 详细信息
     *
     * @param bookId 著作成果id
     * @return 返回 著作成果 对象
     */
    @Override
    public EBookCustom findBookResultById(String bookId) {
        return eBookMapperCustom.selectBookResultInfoById(bookId);
    }

    /**
     * 通过指定 著作成果 查询对应的人员列表
     *
     * @param bookId 著作成果id
     * @return 返回人员列表集合
     */
    @Override
    public List<PersonListVO> findPersonListByBookId(String bookId) {
        return eBookMapperCustom.selectPersonListByBookId(bookId);
    }

    /**
     * 编辑著作成果信息
     *
     * @param bookResultVO 著作成果值对象
     */
    @Override
    public void updateBookResult(BookResultVO bookResultVO) {
        if (this.bookNameIsExisted(bookResultVO)) {
            throw new RuntimeException("该著作成果名称已存在");
        }
        try {
            //通过 著作成果 信息中的人员字符串得到人员列表集合
            List<PersonListVO> personListVOList = bookResultVO.getPersonListVOList();
            /*start：设置 著作成果 的属性值并保存到数据库*/
            //判断操作类型，为submit提交就 生成校内编号，并且将审核状态设置为1
            if ("submit".equals(bookResultVO.getSubmitType())) {
                schoolNumberGenerate.setSchoolNumber(bookResultVO);                         //提交时生成 著作成果 编号
                bookResultVO.setAuditStatusId(2);                                           //保存时将状态设置为2 ，即待学院审核状态
            } else if ("save".equals(bookResultVO.getSubmitType())) {
                bookResultVO.setAuditStatusId(1);                                           //保存时将状态设置为1 ，即未提交状态
            }
            //下边设置保存提交都相同的属性
            //取集合中第一个为负责人并设置到 著作成果 信息
            //-3表示校外人员，-2表示学生，其他情况表示校内教师
            if ("-3".equals(personListVOList.get(0).getWorkNum())) {
                bookResultVO.setLeader("校外人员：" + personListVOList.get(0).getWorkName());
            } else if ("-2".equals(personListVOList.get(0).getWorkNum())) {
                bookResultVO.setLeader("学生：" + personListVOList.get(0).getWorkName());
            } else {
                bookResultVO.setLeader(personListVOList.get(0).getWorkName() + "(" + personListVOList.get(0).getWorkNum() + ")");
            }
            bookResultVO.setAttachment(FileHandle.fileUpload(FileHandle.BOOKRESULT, bookResultVO.getFile(), bookResultVO.getBookId())); //保存文件并得到文件名
            bookResultVO.setPersonList(bookResultVO.getPersonListVO().getWorkName());          //设置人员列表字符串
            bookResultVO.setLastTime(new Date());                                         //设置当前系统时间为最后更新时间
            System.out.println(bookResultVO.toString());
            eBookMapper.updateByPrimaryKeySelective(bookResultVO);                        //更新 著作成果 数据
            /*end：设置 著作成果 的属性值并保存到数据库*/
            /*start：删除人员项目成果关系表中需此著作成果id的所有数据*/
            RPersonProjectResultExample rPersonProjectResultExample = new RPersonProjectResultExample();
            RPersonProjectResultExample.Criteria criteria = rPersonProjectResultExample.createCriteria();
            criteria.andIdEqualTo(bookResultVO.getBookId());
            rPersonProjectResultMapper.deleteByExample(rPersonProjectResultExample);
            /*end：删除人员项目成果关系表中需此著作成果id的所有数据*/

            /*start：向人员项目关系表中插数据*/
            //创建关系表对象，需要初始化 （项目或成果id，类型，项目或成果名称，关键性时间）四个属性值
            RPersonProjectResult r = new
                    RPersonProjectResult(bookResultVO.getBookId(), 18, bookResultVO.getBookName(), bookResultVO.getPublishDate());
            personListService.insertRPersonProjectResult(personListVOList, r);        //传入人员列表和对应项目中的属性对象
            /*end：向人员项目关系表中插数据*/

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("插入数据失败");
        }
    }

    /**
     * 检查是否存在同名著作成果
     *
     * @param bookResultVO 项目对象
     * @return 存在就返回true  ，不存在返回false
     */
    @Override
    public boolean bookNameIsExisted(BookResultVO bookResultVO) {
        //传入的著作成果名为空时返回false表示不存在
        if (bookResultVO.getBookName() == null) {
            return false;
        }
        EBookExample eBookExample = new EBookExample();
        EBookExample.Criteria criteria = eBookExample.createCriteria();
        criteria.andBookNameEqualTo(bookResultVO.getBookName());
        //排除自身进行查重
        if (bookResultVO.getBookId() != null) {
            criteria.andBookIdNotEqualTo(bookResultVO.getBookId());
        }
        return eBookMapper.selectByExample(eBookExample).size() > 0;  //大于0返回true表示存在该著作成果
    }

    /**
     * 删除指定id的著作成果
     *
     * @param bookId 著作成果编号
     */
    public void deleteBookResultByBookId(String bookId) {
        try {
            //先查询出要删除的著作成果
            EBook eBook = eBookMapper.selectByPrimaryKey(bookId);
            //从e_book表删除著作成果
            eBookMapper.deleteByPrimaryKey(bookId);
            //删除人员项目成果关系表的数据
            RPersonProjectResultExample rPersonProjectResultExample = new RPersonProjectResultExample();
            RPersonProjectResultExample.Criteria criteria = rPersonProjectResultExample.createCriteria();
            criteria.andIdEqualTo(bookId);
            rPersonProjectResultMapper.deleteByExample(rPersonProjectResultExample);
            //删除项目相关的附件，最后进行删除附件操作，如果前面删除项目失败就不会删除附件
            FileHandle.deleteFile(FileHandle.BOOKRESULT, eBook.getAttachment());
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("删除著作成果失败");
        }
    }
}

