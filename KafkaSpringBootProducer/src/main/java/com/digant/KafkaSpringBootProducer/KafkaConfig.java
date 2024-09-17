package com.digant.KafkaSpringBootProducer;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaAdmin.NewTopics;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

@Configuration
public class KafkaConfig {
	
	@Bean
	public KafkaTemplate<String, String> getKafkaConfig(){
		Map<String, String> config= new HashMap<>();
		config.put("bootstrap.servers", "localhost:9092");
		config.put("ack", "all");
		config.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		config.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		
		ProducerFactory<String, String> factory= new DefaultKafkaProducerFactory(config);
		return new KafkaTemplate<>(factory);
	}
		 @Bean
		 public NewTopic getTopic(){
			return new NewTopic("kafaka-springboot-topic", 1, (short) 1);
			
		}
	

}
