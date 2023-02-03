package com.example.kafkaservice.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * Responsible for creating Kafka Topics.
 */
@Configuration
public class KafkaTopicConfig {


    /**
     * Create a Kafka Topic.
     *
     * @return a new Topic created on Kafka Server Broker.
     */
    @Bean
    public NewTopic topic() {
        return TopicBuilder.name("new-topic")
                .replicas(1)
                .build();
    }
}
