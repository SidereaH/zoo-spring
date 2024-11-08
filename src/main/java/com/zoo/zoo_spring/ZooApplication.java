package com.zoo.zoo_spring;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class ZooApplication {
    public static ApplicationContext context;

    public static void main(String[] args) {
        SpringApplication.run(ZooApplication.class, args);

    }

}
