package com.hebeu.keyan.service.impl;

import com.hebeu.keyan.dao.RPersonProjectResultMapper;
import com.hebeu.keyan.dao.customMapper.PersonListMapper;
import com.hebeu.keyan.po.ECollege;
import com.hebeu.keyan.po.EDepartment;
import com.hebeu.keyan.po.RPersonProjectResult;
import com.hebeu.keyan.po.UserInfo;
import com.hebeu.keyan.service.PersonListService;
import com.hebeu.keyan.vo.PersonListVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：陈德华
 * 时间：2017/8/2 20:20
 * 描述：人员列表相关处理业务实现类
 */
@Service
public class PersonListServiceImpl implements PersonListService {

    private final PersonListMapper personListMapper;

    private final RPersonProjectResultMapper rPersonProjectResultMapper;

    @Autowired
    public PersonListServiceImpl(PersonListMapper personListMapper, RPersonProjectResultMapper rPersonProjectResultMapper) {
        this.personListMapper = personListMapper;
        this.rPersonProjectResultMapper = rPersonProjectResultMapper;
    }

    /**
     * 查询所有的学院
     *
     * @return 查询所有的学院
     */
    @Override
    public List<ECollege> findECollege() {
        return personListMapper.selectECollegeOrderbyName("ASC");
    }

    /**
     * 通过学院id查询教研室
     *
     * @param collegeId 学院编号
     * @return 返回指定范围内的教研室集合
     */
    @Override
    public List<EDepartment> findEDepartmentByCollegeId(Integer collegeId) {
        if (collegeId == null) {
            return null;
        }
        return personListMapper.selectEDepartmentOrderByName(collegeId, "ASC");
    }

    /**
     * 通过学院编号或教研室编号查询人员
     *
     * @param collegeId    学院编号
     * @param departmentId 教研室编号
     * @return 返回指定范围的人员集合
     */
    @Override
    public List<UserInfo> findUserInfoByCollegeIdOrDepartmentId(Integer collegeId, Integer departmentId) {
        if (collegeId == null && departmentId == null) {
            return null;
        }
        return personListMapper.selectUserInfoOrderByName(collegeId, departmentId, "ASC");
    }

    /**
     * 通过接收的PersonListVO对象转为集合
     *
     * @param personListVOs PersonListVO对象
     * @return 返回list集合
     */
    @Override
    public List<PersonListVO> getPersonList(PersonListVO personListVOs) {
        //如果人员列表为空就返回null
        if (personListVOs == null) {
            return null;
        }
        List<PersonListVO> personListVOList = new ArrayList<>();
        //将每个属性进行字符串切割，得到数组，然后将数组转换成集合
        String[] personTypeArr = personListVOs.getPersonType().split(",");
        String[] workNumArr = personListVOs.getWorkNum().split(",");
        String[] workNameArr = personListVOs.getWorkName().split(",");
        String[] collegeIdArr = personListVOs.getCollegeId().split(",");
        String[] collegeNameArr = personListVOs.getCollegeName().split(",");
        boolean flag = true;
        for (int i = 0; i < personTypeArr.length; i++) {
            PersonListVO personListVO;
            //将第一个人校内教职工设置为负责人
            if (flag&&"1".equals(personTypeArr[i])) {
                personListVO = new PersonListVO(personTypeArr[i], collegeIdArr[i],
                        collegeNameArr[i], workNumArr[i], workNameArr[i], 1);
                flag = false;
            } else {
                personListVO = new PersonListVO(personTypeArr[i], collegeIdArr[i],
                        collegeNameArr[i], workNumArr[i], workNameArr[i], 0);
            }
            personListVOList.add(personListVO);
        }
        return personListVOList;
    }

    /**
     * 向人员项目成果关系表插入数据
     *
     * @param personListVOList 人员列表集合
     * @param rPersonProjectResult  关系表对象
     */
    @Override
    public void insertRPersonProjectResult(List<PersonListVO> personListVOList, RPersonProjectResult rPersonProjectResult) {

        try {
            RPersonProjectResult r;
            for (PersonListVO personListVO : personListVOList) {                    //遍历人员列表集合
                r = new RPersonProjectResult();
                //下面开始设置关系表对象数据，其中学生和校外人员对应某些数据为null
                r.setId(rPersonProjectResult.getId());                              //设置项目或成果编号
                r.setWorkNum(personListVO.getWorkNum());                            //设置工号
                r.setWorkName(personListVO.getWorkName());                          //设置人员姓名
                r.setCollegeId("null".equals(personListVO.getCollegeId())?          //设置学院id(当为校外人员时，此值为null，所以此处需要判断是否为空，若为空就设置为-1，表示校外人员)
                        null:Integer.valueOf(personListVO.getCollegeId()));
                r.setCollegeName(personListVO.getCollegeName());                    //设置学院/单位名
                r.setPersonType(Integer.parseInt(personListVO.getPersonType()));    //设置人员类别
                r.setIsLeader(personListVO.getIsLeader());                          //设置负责人
                r.setType(rPersonProjectResult.getType());                          //设置类别，1表示项目
                r.setName(rPersonProjectResult.getName());                          //设置项目名或成果名
                r.setKeyDate(rPersonProjectResult.getKeyDate());                    //设置关键性时间
                rPersonProjectResultMapper.insertSelective(r);                      //向关系表插入数据
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
            throw new RuntimeException("插入数据失败");
        }
    }

}
