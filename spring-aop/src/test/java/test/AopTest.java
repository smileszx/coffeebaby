package test;

import com.coffee.baby.annotation.Audience;
import com.coffee.baby.annotation.ConcertConfig;
import com.coffee.baby.annotation.PerformImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/2/22 12:38
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertConfig.class)
public class AopTest {
    @Resource
    private PerformImpl performance;

    @Test
    public void testAOP() {
        performance.perform();
    }

}
