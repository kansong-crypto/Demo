package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class Config {

    @Value("${app.name}")
    private String appName;

    @Autowired
    private Environment environment;

    public String print() {
        String a = "通过@Value获取的值："+ this.appName;
        String b = "通过environment获取的值："+ environment.getProperty("app.size");
        return a + "\n"+ b;
    }
}
