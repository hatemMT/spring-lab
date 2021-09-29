package com.emaratech.home.boundary;

import com.emaratech.kafka.AppKafkaProducer;
import org.springframework.stereotype.Component;

@Component
public class MyBean {
    private AppKafkaProducer kafkaProducer;

    public MyBean(AppKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    public void produceToKafka() {
        kafkaProducer.produce("data");
    }


}
