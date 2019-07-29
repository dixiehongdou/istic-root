import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hch on 2019/7/15.
 */
@Slf4j
public class GenMain {
    public static void main(String[] args) {
        ArrayList<String> warnings = Lists.newArrayList();
        boolean overwrite = true;//如果已经生成过了是否进行覆盖
        String genCfg = "/Users/hch/IdeaProjects/istic-root/managementsystem/src/main/resources/generator/generatorConfig.xml";

        File configFile = new File(genCfg);
        ConfigurationParser cfgParser = new ConfigurationParser(warnings);//配置文件解析器
        Configuration config = null;
        try {
            config = cfgParser.parseConfiguration(configFile);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XMLParserException e) {
            e.printStackTrace();
        }
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator generator = null;
        try {
            generator = new MyBatisGenerator(config, callback, warnings);
        } catch (InvalidConfigurationException e) {
            e.printStackTrace();
        }
        try {
            generator.generate(null);
            log.info("mybatis 代码生成成功。。。");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
