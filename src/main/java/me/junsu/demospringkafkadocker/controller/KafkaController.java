package me.junsu.demospringkafkadocker.controller;

import lombok.RequiredArgsConstructor;
import me.junsu.demospringkafkadocker.service.SampleKafkaProducer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class KafkaController {
    private final SampleKafkaProducer kafkaProducer;

    @PostMapping("/kafka/send")
    public String sendMessage(@RequestParam String message) {
        kafkaProducer.sendMessage(message);
        return "success";
    }
}
