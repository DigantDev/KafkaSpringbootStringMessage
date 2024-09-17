package com.digant.KafkaSpringBootProducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.digant.KafkaSpringBootProducer.MessageDto;
import com.digant.KafkaSpringBootProducer.service.MessageService;


@RestController
public class MessageController {
	
	@Autowired
	MessageService messageservice;
	
	@PostMapping(value="/kafka-message")
	public ResponseEntity<MessageDto> sendmessage(@RequestBody MessageDto messagedto){
		 messagedto=messageservice.sendmessage(messagedto);
		return new ResponseEntity<MessageDto>(messagedto, HttpStatus.CREATED);
		
	}

}
