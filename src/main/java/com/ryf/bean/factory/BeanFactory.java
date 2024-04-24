package com.ryf.bean.factory;

public interface BeanFactory {
    /**
     * 获取bean
     *
     * @param beanName
     * @return bean
     * @throws BeansException bean不存在时
     */
    Object getBean(String beanName);
}
