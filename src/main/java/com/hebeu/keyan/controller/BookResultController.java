package com.hebeu.keyan.controller;

import com.hebeu.keyan.po.customPO.ActiveUser;
import com.hebeu.keyan.service.BasicParameterService;
import com.hebeu.keyan.service.BookResultService;
import com.hebeu.keyan.service.PersonListService;
import com.hebeu.keyan.utils.DateToString;
import com.hebeu.keyan.vo.BookResultVO;
import com.hebeu.keyan.vo.PersonListVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 作者：冯嘉龙
 * 时间：2017/8/5  11:27
 * 描述：著作成果 相关控制器
 */
@Controller
@RequestMapping("/result/bookResult/")
public class BookResultController {
    private final BasicParameterService basicParameterService;
    private final PersonListService personListService;
    private final BookResultService bookResultService;

    @Autowired
    public BookResultController(BasicParameterService basicParameterService, PersonListService personListService, BookResultService bookResultService) {
        this.basicParameterService = basicParameterService;
        this.bookResultService = bookResultService;
        this.personListService = personListService;
    }

    /**
     * 查看个人 著作成果 列表
     *
     * @return 返回 著作成果 列表页面
     */
    @RequestMapping("bookResultList.action")
    public String bookResultList(HttpSession session, Model model) {
        //从session中取到用户信息
        ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");
        //System.out.println("当前登录用户为"+activeUser.getUserId());
        model.addAttribute("ds", new DateToString());
        model.addAttribute("bookResultList", bookResultService.findBookResultListByWorkNum(activeUser.getUserId()));//将查询到的 著作成果 集合放到model中
        return "result/bookResult/personalBookResultList";
    }

    /**
     * 新增 著作成果 表单
     *
     * @return 跳转到新增 著作成果 表单
     */
    @RequestMapping("toAddBookResult.action")
    public String toAddBookResult(Model model) {
        /*start：基础表参数设置，其中部分参数不需要在此设置，需要通过ajax异步请求方式来设置*/
        model.addAttribute("subjectTypeList", basicParameterService.findSubjectType());                 //学科门类
        model.addAttribute("bookPressTypeList", basicParameterService.findBookPressType());              //出版社类型
        /*end：基础表参数设置*/
        model.addAttribute("collegeList", personListService.findECollege());   //学院
        return "result/bookResult/personalBookResultAdd";
    }

    /**
     * 通过ajax异步请求改变学科门类时更改与其关联的项
     *
     * @param subjectTypeId 学科门类编号
     * @return 返回存放与学科门类相关联的map集合
     */
    @RequestMapping("subjectTypeChange.action")
    @ResponseBody
    public Map<String, List> subjectTypeChange(Integer subjectTypeId) {
        Map<String, List> map = new HashMap<>();
        map.put("subjectFirstList", basicParameterService.findPerSubjectFirst(subjectTypeId));        //所属学科
        map.put("bookTypeList", basicParameterService.findBookType(subjectTypeId));        //著作类型
        return map;
    }

    /**
     * 新增：著作成果保存、提交
     *
     * @param bookResultVO 著作成果 传值对象
     * @param personListVO 人员列表对象
     * @return 保存成功就重定向到 著作成果 列表，失败就返回 著作成果新增表单
     */
    @RequestMapping("insertBookResult.action")
    public String insertBookResult(BookResultVO bookResultVO, PersonListVO personListVO,RedirectAttributesModelMap model) {
        System.out.println("人员列表对象为：" + personListVO);
        //将PersonListVO对象设置到bookResultVO对象中
        bookResultVO.setPersonListVO(personListVO);
        //将personListVO转成集合后设置到bookResultVO对象中
        bookResultVO.setPersonListVOList(personListService.getPersonList(personListVO));
        try {
            bookResultService.insertBookResult(bookResultVO);  //调用 著作成果 处理业务插入 著作成果 信息到数据库中
        } catch (Exception e) {
            e.printStackTrace();
            if ("插入数据失败".equals(e.getMessage())) {
                return "redirect:/result/bookResult/toAddBookResult.action";
            }else if ("该著作成果名称已存在".equals(e.getMessage())) {
                model.addFlashAttribute("exceptionMessage","输入的名称已存在，请重新输入！");
                return "redirect:/result/bookResult/toAddBookResult.action";
            }
        }
        return "redirect:/result/bookResult/bookResultList.action";
    }

    /**
     * 查看指定著作编号的著作成果详情
     *
     * @param bookId 著作成果id
     * @return 返回到 著作成果 详情页面
     */
    @RequestMapping("personalBookResultInfo.action")
    public String personalBookResultInfo(Model model, String bookId) {
        model.addAttribute("bookResultInfo", bookResultService.findBookResultById(bookId));  //著作成果详细信息
        model.addAttribute("personList", bookResultService.findPersonListByBookId(bookId));//著作成果对应的人员列表
        model.addAttribute("ds", new DateToString());    //时间格式化对象
        return "result/bookResult/personalBookResultInfo";
    }

    /**
     * 编辑 著作成果 表单
     *
     * @return 跳转到编辑 著作成果 表单
     */
    @RequestMapping("toEditBookResult.action")
    public String toEditBookResult(Model model,String bookId,String editType) {
        /*start：基础表参数设置，其中部分参数不需要在此设置，需要通过ajax异步请求方式来设置*/
        model.addAttribute("bookResultVO",bookResultService.findBookResultById(bookId));                //按照bookid查出来的著作成果对象
        Integer subjectTypeId = bookResultService.findBookResultById(bookId).getSubjectTypeId();            //获得该著作成果对象的学科门类编号
        model.addAttribute("subjectFirstList",basicParameterService.findPerSubjectFirst(subjectTypeId)); //读取该学科门类编号对应的学科门类数据
        model.addAttribute("bookTypeList",basicParameterService.findBookType(subjectTypeId));            //读取该学科门类编号对应的著作类型数据
        model.addAttribute("subjectTypeList", basicParameterService.findSubjectType());                 //学科门类
        model.addAttribute("bookPressTypeList", basicParameterService.findBookPressType());              //出版社类型
        /*end：基础表参数设置*/
        model.addAttribute("personList",bookResultService.findPersonListByBookId(bookId));              //该著作成果的人员列表
        model.addAttribute("ds", new DateToString());    //时间格式化对象
        model.addAttribute("collegeList", personListService.findECollege());   //学院
        //审核时编辑
        if("audit".equals(editType)){
            return "result/bookResult/auditBookResultEdit";
        }
        return "result/bookResult/personalBookResultEdit";
    }

    /**
     * 编辑：著作成果保存、提交
     *
     * @param bookResultVO 著作成果 传值对象
     * @param personListVO 人员列表对象
     * @return 保存成功就重定向到 著作成果 列表，失败就返回 著作成果新增表单
     */
    @RequestMapping("updateBookResult.action")
    public String updateBookResult(BookResultVO bookResultVO, PersonListVO personListVO, RedirectAttributesModelMap model) {
        System.out.println("人员列表对象为：" + personListVO);
        //将PersonListVO对象设置到bookResultVO对象中
        bookResultVO.setPersonListVO(personListVO);
        //将personListVO转成集合后设置到bookResultVO对象中
        bookResultVO.setPersonListVOList(personListService.getPersonList(personListVO));
        try {
            bookResultService.updateBookResult(bookResultVO);//调用 著作成果 处理业务修改 著作成果 信息到数据库中
        } catch (Exception e) {
            e.printStackTrace();
            if ("编辑数据失败".equals(e.getMessage())) {
                return "redirect:/result/bookResult/toEditBookResult.action?bookId=" + bookResultVO.getBookId() + "";
            }else if ("该著作成果名称已存在".equals(e.getMessage())) {
                model.addFlashAttribute("exceptionMessage","输入的名称已存在，请重新输入！");
                return "redirect:/result/bookResult/toEditBookResult.action?bookId=" + bookResultVO.getBookId() + "";
            }
        }
        return "redirect:/result/bookResult/personalBookResultInfo.action?bookId=" + bookResultVO.getBookId() + "";
    }

    /**
     * 通过ajax来判断输入的bookName是否存在
     * @param validateName 输入的 著作 名称
     * @param bookId 著作成果编号
     * @return 返回true表示已存在，返回false表示不存在
     */
    @RequestMapping("bookNameIsExisted.action")
    @ResponseBody  //表示这是ajax响应体
    public boolean bookNameIsExisted(String validateName,String bookId){
        BookResultVO bookResultVO = new BookResultVO();
        bookResultVO.setBookName(validateName);
        if(bookId!=null){
            bookResultVO.setBookId(bookId);
        }
        return bookResultService.bookNameIsExisted(bookResultVO);
    }

    /**
     * 删除指定id的著作成果
     * @param bookId 著作成果id
     * @return 返回著作成果列表
     */
    @RequestMapping("deleteBookResult.action")
    public String deleteBookResult(String bookId){
        System.out.println(bookId);
        try {
            bookResultService.deleteBookResultByBookId(bookId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/result/bookResult/bookResultList.action";
    }
}
