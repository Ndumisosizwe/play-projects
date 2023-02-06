package com.example.kafkaservice.rest;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * Make a rest request to publish a kafka event.
 */
@RestController
@RequestMapping("/kafka/api/producer/v1")
public class KafkaProducerController {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducerController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping
    public String produceKafkaMessage(@RequestBody String incomingRestMessage) throws ExecutionException, InterruptedException {
        final CompletableFuture<SendResult<String, String>> send = kafkaTemplate.send("new-topic", incomingRestMessage);
        send.complete(send.get());
        return "message sent " + send;
    }
}
