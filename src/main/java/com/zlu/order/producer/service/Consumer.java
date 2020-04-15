package com.zlu.order.producer.service;

import lombok.extern.java.Log;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Log
public class Consumer {

    @KafkaListener(groupId = "order_consumer", topicPartitions = {
            @org.springframework.kafka.annotation.TopicPartition(topic = "order_sender_2", partitions = {"0","1"})
    })
    public void consume(String message) {
        log.info(String.format("####-> Consuming message %s", message));
    }

}
