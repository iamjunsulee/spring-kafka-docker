package me.junsu.demospringkafkadocker.service;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SampleKafkaProducer {
    private static final String TOPIC = "test";
    private final KafkaTemplate<String, String> kafkaTemplate;
    
    /*
    Kafka 서버로 메시지 전송
     */
    public void sendMessage(String message) {
        System.out.println("Producer :: " + message);
        kafkaTemplate.send(TOPIC, message);
    }
}
