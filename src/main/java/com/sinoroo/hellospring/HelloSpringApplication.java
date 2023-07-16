package com.sinoroo.hellospring;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.sinoroo.hellospring.controller.HelloController;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		//ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class); // @SpringBootApplication 사용 시 쓸모 없음, @SpringBootApplication 이 동일한 역할

        //String[] beanDefinitionNames = context.getBeanDefinitionNames();
        //System.out.println(Arrays.toString(beanDefinitionNames));
		//HelloController helloController = (HelloController) context.getBean("helloController");
        //System.out.println(helloController != null);
		
		//@SpringBootApplication 이 없으면 아래 코드에서 Exception발생
		SpringApplication.run(HelloSpringApplication.class, args);
	}

}
