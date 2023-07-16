package com.sinoroo.hellospring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sinoroo.hellospring.controller.HelloController;

@Configuration
@ComponentScan(basePackageClasses = HelloSpringApplication.class)
public class ApplicationConfig {
    /*
    @Bean
    public HelloController helloController (){
        return new HelloController();
    }
    */
}
