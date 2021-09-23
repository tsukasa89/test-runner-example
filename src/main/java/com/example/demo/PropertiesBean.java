package com.example.demo;

import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

public class PropertiesBean {

    private static Properties props;

    public Properties getProperties() {

        return props;
    }

    public PropertiesBean(final String propertiesFile) {

        Resource resource = new ClassPathResource(propertiesFile);

        try {
            props = PropertiesLoaderUtils.loadProperties(resource);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
