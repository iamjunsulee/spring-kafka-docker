package me.junsu.demospringkafkadocker.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class SamplerKafkaConsumer {
    @KafkaListener(groupId = "jjun", topics = "test")
    public void consume(String message) {
        System.out.println("Consumer :: " + message);
    }
}
