package com.kk.kkapi.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 手动注入bean
 */
@Component
public class SpringBeanUtil implements ApplicationContextAware {

    public static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (SpringBeanUtil.applicationContext==null){
            SpringBeanUtil.applicationContext = applicationContext;
        }
    }

    /**
     * 获取applicationContext
     * @return
     */
    public static ApplicationContext getApplicationContext(){
        return applicationContext;
    }


    /**
     * 通过name获取bean
     * @param name
     * @return
     */
    public static Object getBean(String name){
        return getApplicationContext().getBean(name);
    }


    /**
     * 通过class获取bean
     * @param t
     * @param <T>
     * @return
     */
    public static <T> T getBean(Class<T> t){
        return getApplicationContext().getBean(t);
    }

    /**
     * 通过name和class获取bean
     * @param name
     * @param t
     * @param <T>
     * @return
     */
    public static <T> T getBean(String name,Class<T> t){
        return getApplicationContext().getBean(name,t);
    }

}
