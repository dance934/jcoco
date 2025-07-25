package com.example.modulea;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

// @SpringBootTest(classes = HelloController.class)
// @AutoConfigureMockMvc
public class HelloControllerIT {

    // @Autowired
    // private MockMvc mockMvc;

    // @Test
    // public void testHello() throws Exception {
    //     mockMvc.perform(get("/"))
    //             .andExpect(status().isOk())
    //             .andExpect(content().string("Hello World"));
    // }

        @Test
    public void testHello() throws Exception {
        System.out.println("Integration test from module-a");
    }
}
