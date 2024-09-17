package com.digant.KafkaSpringBootConsumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {
	
	@KafkaListener(topics= {"kafaka-springboot-topic"}, groupId = "test")
	public void receiveMessage(String message) {
		System.out.println("Message recived: "+message);
	}

}
