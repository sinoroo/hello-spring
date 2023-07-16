package com.sinoroo.hellospring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(locations = "/applicationContext.xml")
class HelloSpringApplicationTests {

	@Test
	void contextLoads() {
	}

}
