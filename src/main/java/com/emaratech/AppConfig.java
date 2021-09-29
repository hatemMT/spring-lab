package com.emaratech;

import com.emaratech.home.HomeConfig;
import com.emaratech.kafka.AppKafkaProducer;
import com.emaratech.kafka.AppKafkaProducerIml;
import com.emaratech.kafka.AppKafkaProducerMock;
import org.springframework.context.annotation.*;

@ComponentScan(basePackages = {"com.emaratech"})
@Configuration
@Import(HomeConfig.class)
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    @Profile("prod")
    public AppKafkaProducer kafkaProducerProdBean() {
        return new AppKafkaProducerIml();
    }

    @Bean
    @Profile("dev")
    public AppKafkaProducer kafkaProducerDevBean() {
        return new AppKafkaProducerMock();
    }
}
