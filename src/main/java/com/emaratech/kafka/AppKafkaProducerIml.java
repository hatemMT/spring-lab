package com.emaratech.kafka;

public class AppKafkaProducerIml implements AppKafkaProducer {
    @Override
    public void produce(String data) {
        System.out.println("Producing in production!");
    }
}
