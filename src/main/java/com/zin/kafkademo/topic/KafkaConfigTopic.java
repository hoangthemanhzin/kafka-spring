package com.zin.kafkademo.topic;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfigTopic {
    @Bean
    public NewTopic kafkaDemoTopic(){
        return TopicBuilder.name("topicNameZin").build();
    }
}
