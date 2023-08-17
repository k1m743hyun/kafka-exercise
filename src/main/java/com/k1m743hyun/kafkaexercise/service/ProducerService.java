package com.k1m743hyun.kafkaexercise.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class ProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC = "k1m743hyun";

    public void sendMessage(String message) {

        log.info("Producing message: {}", message);
        this.kafkaTemplate.send(TOPIC, message);
    }
}
