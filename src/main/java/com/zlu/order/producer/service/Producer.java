package com.zlu.order.producer.service;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Log
public class Producer {


    private static final String TOPIC = "order_sender_2";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        log.info(String.format("####-> Producing message -> %s", message));

        kafkaTemplate.send(TOPIC, 0,"producer_1", "producer_1");
        kafkaTemplate.send(TOPIC, 1,"producer_2", "producer_2");

    }
}
