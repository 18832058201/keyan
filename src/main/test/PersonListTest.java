import com.hebeu.keyan.dao.customMapper.PersonListMapper;
import com.hebeu.keyan.dao.customMapper.UserInfoMapperCustom;
import com.hebeu.keyan.po.ECollege;
import com.hebeu.keyan.po.EDepartment;
import com.hebeu.keyan.po.UserInfo;
import com.hebeu.keyan.po.customPO.UserInfoCustom;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 作者：陈德华
 * 时间：2017/8/2 21:27
 * 描述：人员列表相关查询测试
 */
public class PersonListTest {

    /**
     * 学院查询测试
     */
    @Test
    public void selectCollege(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonListMapper personListMapper = (PersonListMapper) context.getBean("personListMapper");
        List<ECollege> eCollegeList = personListMapper.selectECollegeOrderbyName("DEFAULT");
        System.out.println(eCollegeList.size());
        for (ECollege eCollege:eCollegeList){
            System.out.println(eCollege.getCollegeName());
        }
    }


    /**
     * 查询教研室
     */
    @Test
    public void selectDepartment(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonListMapper personListMapper = (PersonListMapper) context.getBean("personListMapper");
        List<EDepartment> eDepartmentList  = personListMapper.selectEDepartmentOrderByName(2,"ASC");
        System.out.println(eDepartmentList.size());
        for (EDepartment eDepartment:eDepartmentList){
            System.out.println(eDepartment.getDepartmentName());
        }
    }

    /**
     * 人员查询测试
     */
    @Test
    public void selectPerson(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonListMapper personListMapper = (PersonListMapper) context.getBean("personListMapper");
        List<UserInfo> userInfoList  = personListMapper.selectUserInfoOrderByName(null,null,"ASC");
        System.out.println(userInfoList.size());
        for (UserInfo userInfo:userInfoList){
            System.out.println(userInfo.getWorkName());
        }
    }


    /**
     * 测试人员视图查询
     */
    @Test
    public void selectUserInfoByUserId(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserInfoMapperCustom userInfoMapperCustom = (UserInfoMapperCustom) context.getBean("userInfoMapperCustom");
        UserInfoCustom userInfoCustom = userInfoMapperCustom.selectUserInfoByUserId("11871");
        System.out.println(userInfoCustom.toString());
    }

}
