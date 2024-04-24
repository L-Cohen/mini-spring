package com.ryf.bean;

import com.ryf.bean.factory.config.BeanDefinition;
import com.ryf.bean.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

public class BeanDefinitionAndBeanDefinitionRegistryTest {

    @Test
    public void testBeanFactory() {
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(HelloService.class);
        defaultListableBeanFactory.registerBeanDefinition("helloService", beanDefinition);

        HelloService helloService = (HelloService) defaultListableBeanFactory.getBean("helloService");
        helloService.sayHello();
    }

    public static class HelloService {
        public String sayHello() {
            System.out.println("hello");
            return "hello";
        }
    }
}
