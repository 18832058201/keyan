import com.hebeu.keyan.utils.FileHandle;
import org.junit.Test;

/**
 * 作者：陈德华
 * 时间：2017/8/3 16:30
 * 描述：文件处理相关测试
 */
public class FileHandleTest {

    /**
     * 测试文件路径配置文件读取
     */
    @Test
    public void test01(){
        System.out.println(FileHandle.ABSOLUTEPATH);
        System.out.println(FileHandle.CROSSWISEPROJECT);
        System.out.println(FileHandle.LENGTHWAYSPROJECT);
        System.out.println(FileHandle.IDENTIFYRESULT);
        System.out.println(FileHandle.REWARDRESULT);
        System.out.println(FileHandle.PATENTREULT);
        System.out.println(FileHandle.PAPERRESULT);
        System.out.println(FileHandle.PLANTRESULT);
        System.out.println(FileHandle.SOFTWARERESULT);
        System.out.println(FileHandle.STANDARDRESULT);
        System.out.println(FileHandle.BOOKRESULT);
    }

    @Test
    public void test02(){
        String fileName = "123.jpg";
        String suffix = fileName.substring(fileName.lastIndexOf("."),fileName.length());
        System.out.println(suffix);
    }

    @Test
    public void test03(){
        String fileName = "123.jpg";
        String suffix = fileName.substring(0,fileName.lastIndexOf("."));
        System.out.println(suffix);
    }
}
