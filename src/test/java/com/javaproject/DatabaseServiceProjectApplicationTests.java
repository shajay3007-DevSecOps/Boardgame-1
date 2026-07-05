package com.javaproject;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureMockMvc
class DatabaseServiceProjectApplicationTests {
        // Fake AWS Access Key for GitLeaks testing
    String awsAccessKey = "AKIAIOSFODNN7EXAMPLE";
    @Test
    void contextLoads() {
    }
}
