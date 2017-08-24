import com.hebeu.keyan.po.IncludeTool;
import com.hebeu.keyan.service.IncludeToolService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 作者：张彤
 * 时间：2017/8/2 16:25
 * 描述：测试是否能查询到数据
 */
public class SelectTest {

    @Test
    public void selectAll(){
        String xmlPath = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
        IncludeToolService service = (IncludeToolService) context.getBean("includeToolService");
        List<IncludeTool> list = service.findIncludeToolList();
        for (IncludeTool i : list){
            System.out.println(i.getIncludeToolName());
        }
        System.out.println(list.size());
    }
}
