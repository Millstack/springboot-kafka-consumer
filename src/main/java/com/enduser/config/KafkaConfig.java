package com.enduser.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import com.enduser.topics.TopicConstants;

@Configuration
public class KafkaConfig {
	
	// Apache-kafka listener works for one topic only 
	@KafkaListener (topics = TopicConstants.LOCATION_UPDATE_TOPIC, groupId = TopicConstants.GROUP_ID)
	public void updateLocation(String location) {
		
		System.out.println(location);
	}
}
