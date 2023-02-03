package com.example.kafkaservice.config;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaConsumerConfig {

    /**
     * BootStrap Servers
     */
    @Value("${spring.kafka.bootstrap-servers}")
    private String boostrapServers;


    /**
     * This defines the Kafka properties of the Kafka Consumer.
     *
     * @return consumer properties.
     * @see org.apache.kafka.clients.consumer.ConsumerConfig defaults
     */
    public Map<String, Object> consumerProperties() {
        Map<String, Object> consumerPropertiesConfigMap = new HashMap<>();
        consumerPropertiesConfigMap.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, boostrapServers);
        consumerPropertiesConfigMap.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringSerializer.class);
        consumerPropertiesConfigMap.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringSerializer.class);
        return consumerPropertiesConfigMap;
    }

    /**
     * Defines and configures a KafkaConsumerFactory, a class that gives out Kafka consumers.
     * Initializing a Consumer with certain properties.
     */

    @Bean("greetings-consumer")
    public ConsumerFactory<String, String> consumerFactory() {
        return new DefaultKafkaConsumerFactory<>(consumerProperties());
    }

}
