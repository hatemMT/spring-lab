package com.emaratech.kafka;

import com.emaratech.Logged;

public class AppKafkaProducerIml implements AppKafkaProducer {
    @Logged
    @Override
    public void produce(String data) {
        System.out.println("Producing in production!");
    }
}
