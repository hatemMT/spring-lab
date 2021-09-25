package com.emaratech.home;

import com.emaratech.home.control.HomeRepository;
import com.emaratech.home.entity.HomeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
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
