package com.zin.kafkademo.kafka;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaPoducer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaPoducer.class);
    private KafkaTemplate<String, String> kafkaTemplate;
    public KafkaPoducer(KafkaTemplate<String, String> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message){
        LOGGER.info(String.format("Message sent %s", message));
        kafkaTemplate.send("topicNameZin", message);
    }
}
