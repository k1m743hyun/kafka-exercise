package com.k1m743hyun.kafkaexercise.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Slf4j
@Service
public class ConsumerService {

    @KafkaListener(topics = "k1m743hyun", groupId = "media")
    public void receiveMessage(String message) throws IOException {
        log.info("Consumed message: {}", message);
    }
}
