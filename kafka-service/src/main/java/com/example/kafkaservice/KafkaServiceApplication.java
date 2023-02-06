package com.example.kafkaservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
@Slf4j
public class KafkaServiceApplication implements CommandLineRunner {

    private final KafkaTemplate<String, String> kafkaTemplateForGreetings;

    public KafkaServiceApplication(KafkaTemplate<String, String> KafkaTemplateForGreetings) {
        this.kafkaTemplateForGreetings = KafkaTemplateForGreetings;
    }

    public static void main(String[] args) {
        SpringApplication.run(KafkaServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Sending Message To Kafka");
        this.kafkaTemplateForGreetings.send("new-topic", "All of a sudden new message !");
        log.info("Greetings sent To Kafka");
    }
}
