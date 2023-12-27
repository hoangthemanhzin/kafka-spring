package com.zin.kafkademo.controller;

import com.zin.kafkademo.kafka.KafkaPoducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController {
    @Autowired
    private KafkaPoducer kafkaPoducer;
    // request to localhost:8080/api/v1/kafka/publish/message=hello world
    @GetMapping("publish")
    public ResponseEntity<String> ResponseMessage(@RequestParam("message") String message){
        kafkaPoducer.sendMessage(message);
        return ResponseEntity.ok("message sent to producer");
    }
}
