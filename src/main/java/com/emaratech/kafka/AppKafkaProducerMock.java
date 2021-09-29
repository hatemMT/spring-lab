package com.emaratech.kafka;

public class AppKafkaProducerMock implements AppKafkaProducer {
    @Override
    public void produce(String data) {
        System.out.println("Producing in Dev!");
    }
}
