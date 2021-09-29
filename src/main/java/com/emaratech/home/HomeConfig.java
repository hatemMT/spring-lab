package com.emaratech.home;

import com.emaratech.home.boundary.HomeService;
import com.emaratech.home.control.HomeRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/application-${spring.profiles.active}.properties")
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
