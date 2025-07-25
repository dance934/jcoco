package com.example.moduleb;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WelcomeTest {

    @Test
    public void testGetMessage() {
        Welcome welcome = new Welcome();
        assertEquals("Welcome from module-b", welcome.getMessage());
    }
}
