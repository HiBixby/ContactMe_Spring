package shop.hibixby.contactme.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest(controllers=PingController.class)
public class PingControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void pong이_리턴된다() throws Exception{
        String pong = "pong";
        mvc.perform(get("/ping"))
                .andExpect(status().isOk())
                .andExpect(content().string(pong));
    }
}
