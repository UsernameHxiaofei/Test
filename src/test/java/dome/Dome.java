package dome;

import com.dome.Application;
import com.dome.config.StrProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

import java.util.List;
import java.util.Properties;
import java.util.Set;

@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
@EnableConfigurationProperties(StrProperties.class)
@Component
public class Dome {
    
    @Autowired
    private StrProperties strProperties;

    private static List<String> list  = new ArrayList<>();

    private static Integer num = 1;

    @Test
    public void test08 ()  {
        String abc = strProperties.getAbc();
        System.out.println("abc = " + abc);
    }

}
