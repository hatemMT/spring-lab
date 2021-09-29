package com.emaratech.home;

import com.emaratech.home.control.HomeRepository;
import com.emaratech.home.boundary.HomeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/application.properties")
public class HomeConfig {


    @Bean
    public HomeService greeting(HomeRepository homeRepo) {
        return new HomeService(homeRepo);
    }

    @Bean
    public HomeRepository createHomeRepository() {
        return new HomeRepository();
    }

}
