package com.emaratech;

import com.emaratech.home.HomeConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@ComponentScan(basePackages = {"com.emaratech"})
@Configuration
@Import(HomeConfig.class)
public class AppConfig {

}
