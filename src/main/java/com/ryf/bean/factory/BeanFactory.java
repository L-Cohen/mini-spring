package com.ryf.bean.factory;

import java.util.HashMap;
import java.util.Map;

public class BeanFactory {
    private final Map<String, Object> beanMap = new HashMap<>();

    public void registryBean(String beanName, Object bean){
        beanMap.computeIfAbsent(beanName, k -> bean);
    }

    public Object getBean(String beanName) {
        return beanMap.get(beanName);
    }
}
