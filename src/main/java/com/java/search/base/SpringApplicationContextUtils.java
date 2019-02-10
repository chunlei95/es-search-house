package com.java.search.base;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author xzmeasy
 * @version 1.0
 * @since 二月 星期五, 2019
 */
public class SpringApplicationContextUtils<T> implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringApplicationContextUtils.applicationContext = applicationContext;
    }

    public static <T> T getBean(String beanName) {
        return SpringApplicationContextUtils.getBean(beanName);
    }

    public static <T> T getBean(Class<T> beanType) {
        return SpringApplicationContextUtils.applicationContext.getBean(beanType);
    }

}
