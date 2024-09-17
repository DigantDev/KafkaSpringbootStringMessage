package com.digant.KafkaSpringBootProducer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.digant.KafkaSpringBootProducer.MessageDto;

@Service
public class MessageService {
	
	@Autowired
	KafkaTemplate< String, String> kafatemplate;
	
	public MessageDto sendmessage(MessageDto messagedto) {
		kafatemplate.send("kafaka-springboot-topic",messagedto.getMessage());
		return messagedto;
	}
	

}
