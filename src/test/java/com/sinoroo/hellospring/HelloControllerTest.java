package com.sinoroo.hellospring;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import com.sinoroo.hellospring.service.HelloService;


@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations="/applicationContext.xml")
public class HelloControllerTest {

    @Autowired
    private ApplicationContext context;
    
    @Test
    public void SayHello() throws Exception {
        // given
        System.out.println("Hey");
        //then
        Assertions.assertThat(context).isNotEqualTo(null);
        //String[] beanDefinitionNames = context.getBeanDefinitionNames();
        //System.out.println(Arrays.toString(beanDefinitionNames));
		HelloService helloService = (HelloService) context.getBean("helloService");
        Assertions.assertThat(helloService).isNotEqualTo(null);
        Assertions.assertThat(helloService.SayHello()).isEqualTo(5);
    }
}
