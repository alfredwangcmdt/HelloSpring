package com.tutorialspoint;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by AlfredWang on 2017/9/19.
 */
public class InitHelloWorld implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanNmae) throws BeansException{
        System.out.println("BeforeInitialization : " + beanNmae);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanNmae) throws BeansException {
        System.out.println("AfterInitilization : "+ beanNmae);
        return bean;
    }
}
