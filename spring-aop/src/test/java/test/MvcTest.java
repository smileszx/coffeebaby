package test;

import com.coffee.baby.mvc.HomeController;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/2/22 16:41
 **/
@WebAppConfiguration
public class MvcTest {

    @Test
    public void testHome() throws Exception{
        HomeController controller = new HomeController();
        Assert.assertEquals("home", controller.home());

        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
        mockMvc.perform(get("/")).andExpect(view().name("home"));
    }
}
