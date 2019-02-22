package test;

import com.coffee.baby.xml.TargetClazz;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/2/22 14:22
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:springaop.xml")
public class AopXmlTest {
    @Resource
    private TargetClazz targetClazz;
    @Test
    public void testAOPXml() {
        targetClazz.run();
    }
}
