package com.ryf.bean;

import com.ryf.bean.factory.BeanFactory;
import org.junit.Test;

public class SimpleBeanContainerTest {

    @Test
    public void testGetBean() throws Exception {
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.registryBean("helloService", new HelloService());
        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        System.out.println(helloService.sayHello());
    }

    static class HelloService {
        public String sayHello() {
            return "hello";
        }
    }
}
