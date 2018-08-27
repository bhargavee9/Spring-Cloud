package com.eureka.lab4sentence.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.eureka.lab4sentence.Word;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/*
@Service
public class NounService extends WordService {
	
	@GetMapping("/")
	public String getPartsOfSpeech() {
	     return "NOUN";
		
	}

}*/
@FeignClient("NOUN")
public interface AdjectiveService{
	
	@GetMapping("/")
	public Word getWord();

	
}
