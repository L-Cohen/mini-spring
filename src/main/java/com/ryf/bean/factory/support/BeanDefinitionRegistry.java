package com.ryf.bean.factory.support;

import com.ryf.bean.factory.config.BeanDefinition;

/**
 * 向注册表中注BeanDefinition
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
