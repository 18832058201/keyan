import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 作者：陈德华
 * 时间：2017/08/03
 * 描述：mybatis逆向工程
 * 修改generatorConfig.xml文件中的表的指定然后执行此程序就可以生成表对应的po类和mapper
 * 生成后需要在mapper接口上加上 @Repository 注解
 */
public class GeneratorSqlmap {

	private void generator() throws Exception{
		List<String> warnings = new ArrayList<>();
		/* 指定 逆向工程配置文件 */
		InputStream configFile = GeneratorSqlmap.class.getResourceAsStream("generatorConfig.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(true);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
				callback, warnings);
		myBatisGenerator.generate(null);
	}

	public static void main(String[] args) throws Exception {
		try {
			GeneratorSqlmap generatorSqlmap = new GeneratorSqlmap();
			generatorSqlmap.generator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
