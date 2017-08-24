package com.hebeu.keyan.controller;

import com.hebeu.keyan.po.UserInfo;
import com.hebeu.keyan.service.PersonListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 作者：陈德华
 * 时间：2017/8/2 23:42
 * 描述：人员列表选择控制器
 */
@Controller
@RequestMapping("/personList/")
public class PersonListController {

    private final PersonListService personListService;

    @Autowired
    public PersonListController(PersonListService personListService) {
        this.personListService = personListService;
    }


    /**
     * 通过ajax改变与其级联的教研室和人员
     * @param collegeId 学院编号
     * @return 返回map集合
     */
    @RequestMapping("collegeChange.action")
    @ResponseBody
    public Map<String,List> collegeChange(Integer collegeId){
        Map<String,List> map = new HashMap<>();
        map.put("departmentList",personListService.findEDepartmentByCollegeId(collegeId));
        map.put("personList",personListService.findUserInfoByCollegeIdOrDepartmentId(collegeId,null));
        return map;
    }

    /**
     * 改变教研室时改变人员列表
     * @param collegeId 学院id
     * @param departmentId 教研室id
     * @return 返回人员集合
     */
    @RequestMapping("departmentChange.action")
    @ResponseBody
    public List<UserInfo> departmentChange(Integer collegeId,Integer departmentId){
        return personListService.findUserInfoByCollegeIdOrDepartmentId(collegeId,departmentId);
    }
}
