package com.example.kafkaservice.kafka.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


/**
 * Defines Kafka Listeners, which are Kafka abstractions that allow us to consume events from Kafka topics.
 */

@Component
@Slf4j
public class KafkaListeners {

    @KafkaListener(id = "asdfasfd87hc90yf92835yg34f2", topics = {"new-topic"})
    public void Listener(String kafKaIncomingMessage) {
        log.info("{} -> Kafka Message Consumed : {}", this.getClass().getName(), kafKaIncomingMessage);
    }

}
