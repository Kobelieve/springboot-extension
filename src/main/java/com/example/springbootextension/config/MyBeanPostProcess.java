package com.example.springbootextension.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @ClassName: MyBeanPostProcess
 * @Description: TODO
 * @Author: Tao
 * @Date 2020-05-06 08:08
 */
@Component
public class MyBeanPostProcess implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("before...初始化..." + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("after...初始化..." + beanName);
        return bean;
    }
}
