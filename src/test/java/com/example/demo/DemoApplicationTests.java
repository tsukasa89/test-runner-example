package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Properties;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class DemoApplicationTests {

    @Value("${main-value:#{null}}")
    private String mainValue;
    @Value("${test-value:#{null}}")
    private String testValue;

    @Autowired
    private PropertiesBean propertiesBean;

    @Test
    @DisplayName("application config main resoruce value")
    void testMainApplicationValue() {
        assertThat(mainValue).isEqualTo("main");
    }

    @Test
    @DisplayName("application config test resoruce value")
    void testTestApplicationValue() {
        assertThat(testValue).isEqualTo("test");
    }

    @Test
    @DisplayName("test resource properties value")
    void testTestPropertiesValue() {

        final Properties props = propertiesBean.getProperties();
        System.out.println("props=[" + props + "]");

        // VS Code Test Runner for Java [FAILED]
        // gradlew test [PASSED]
        assertThat(props.getProperty("PROPVALUE")).isEqualTo("TEST");
    }
}
