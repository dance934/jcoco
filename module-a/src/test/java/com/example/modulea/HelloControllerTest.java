package com.example.modulea;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloControllerTest {

    @Test
    public void testHello() {
        HelloController controller = new HelloController();
        assertEquals("Hello World", controller.hello());
    }
}
