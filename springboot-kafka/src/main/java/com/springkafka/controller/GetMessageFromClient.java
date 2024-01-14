package com.springkafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springkafka.service.MyKafkaProducer;

@RestController
@RequestMapping("/rest/api")
public class GetMessageFromClient {
	
	@Autowired
	MyKafkaProducer myKafkaProducer;
	
	@GetMapping("/producer")
	public String sendMessage(@RequestParam("message") String message) {
		myKafkaProducer.sendMessageToTopic(message);
		return "Message sent successfully to topic";
	}

}
