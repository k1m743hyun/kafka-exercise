package com.k1m743hyun.kafkaexercise.controller;

import com.k1m743hyun.kafkaexercise.service.ProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping(value = "/kafka")
@RestController
public class ProducerController {

    private final ProducerService service;

    @PostMapping(value = "/publish")
    @ResponseBody
    public String sendMessageToKafkaTopic(@RequestParam String message) {
        service.sendMessage(message);
        return "Success";
    }
}
