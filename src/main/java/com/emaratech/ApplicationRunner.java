package com.emaratech;

import com.emaratech.home.boundary.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MyBean myBean = applicationContext.getBean(MyBean.class);
        String s = myBean.loadProperty();
        System.out.println(s);
    }
}
