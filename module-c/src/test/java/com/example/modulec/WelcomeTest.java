package com.example.modulec;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WelcomeTest {

    @Test
    public void testGetMessage() {
        Welcome welcome = new Welcome();
        assertEquals("Welcome from module-c", welcome.getMessage());
    }
}
