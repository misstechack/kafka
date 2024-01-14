package com.springkafka.service;

import org.springframework.stereotype.Service;
import org.springframework.kafka.annotation.KafkaListener;

@Service
public class MyKafkaListener {
	
	@KafkaListener(topics = "kafkaTopic", groupId = "kafka-group")
	public void listenToKafkaTopic(String message) {
		System.out.println("Message Received: " + message);
		
	}

}
