package com.emaratech;

import com.emaratech.home.entity.HomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HomeService homeBean = applicationContext.getBean(HomeService.class);
        boolean running = homeBean.isRunning();
        System.out.println(running);
    }
}
