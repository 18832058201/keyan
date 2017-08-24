import com.hebeu.keyan.po.EProject;
import com.hebeu.keyan.utils.SchoolNumberGenerate;
import com.hebeu.keyan.vo.ProjectVO;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 作者：陈德华
 * 时间：2017/8/4 11:25
 * 描述：校内编号测试
 */
public class SchooleNumberTest {
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SchoolNumberGenerate schoolNumberGenerate = (SchoolNumberGenerate) context.getBean("schoolNumberGenerate");

        ProjectVO eProject = new ProjectVO();
        eProject.setSubjectTypeId(1);
        schoolNumberGenerate.setSchoolNumber(eProject);
        System.out.println(eProject.getSchoolNumber());

    }

    @Test
    public void test02(){
        ProjectVO projectVO = new ProjectVO();
        System.out.println(EProject.class.isAssignableFrom(EProject.class));
//        System.out.println(EProject.class().isAssignableFrom(EProject.class));
    }

    @Test
    public void test03(){
        String register = "陈德华(00001)";
        System.out.println(register.split("\\(")[0]);
    }
}
