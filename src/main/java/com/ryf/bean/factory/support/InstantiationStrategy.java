package com.ryf.bean.factory.support;

import com.ryf.bean.factory.config.BeanDefinition;

/**
 * 实例化策略
 */
public interface InstantiationStrategy {

    /**
     * 根据beanDefinition实例化bean
     * @param beanDefinition bean定义
     * @return bean
     */
    Object instantiate(BeanDefinition beanDefinition);
}
