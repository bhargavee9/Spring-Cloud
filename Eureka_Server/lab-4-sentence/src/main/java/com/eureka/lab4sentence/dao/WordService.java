package com.eureka.lab4sentence.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.eureka.lab4sentence.Word;

import org.springframework.stereotype.Service;


abstract public class WordService {
	@Autowired
	DiscoveryClient client;
	
	
   abstract public String getPartsOfSpeech(); 
   
	public Word getWord() {
		List<ServiceInstance> instance = client.getInstances(getPartsOfSpeech());
		return new RestTemplate().getForObject(instance.get(0).getUri(), Word.class);
			
		
	}

}

