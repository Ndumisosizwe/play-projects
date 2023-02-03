package com.example.kafkaservice.config;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaProducerConfig {

    /**
     * BootStrap Servers
     */
    @Value("${spring.kafka.bootstrap-servers}")
    private String boostrapServers;


    /**
     * This defines the Kafka properties of the Kafka Producer.
     *
     * @return producer properties.
     * @see ProducerConfig defaults
     */
    public Map<String, Object> producerProperties() {
        Map<String, Object> producerPropertiesConfigMap = new HashMap<>();
        producerPropertiesConfigMap.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, boostrapServers);
        producerPropertiesConfigMap.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        producerPropertiesConfigMap.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        return producerPropertiesConfigMap;
    }

    /**
     * Defines and configures a KafkaProducerFactory, a class that gives out Kafka producers.
     * Initializing a Producer with certain properties.
     */

    @Bean("greetings-producer")
    public ProducerFactory<String, String> producerFactory() {
        return new DefaultKafkaProducerFactory<>(producerProperties());
    }

    /**
     * A Kafka Template allows us to send/retrieve objects to/from topics
     *
     * @return A kafka Template, a template needs a Factory.
     */
    @Bean
    public KafkaTemplate<String, String> kafkaTemplate(@Qualifier("greetings-producer") ProducerFactory<String, String> producerFactory) {
        return new KafkaTemplate<>(producerFactory);
    }

}
