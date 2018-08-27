package com.eureka.lab4sentence.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.eureka.lab4sentence.Word;

/*@Service
public class VerbService extends WordService {
	
	@GetMapping("/")
	public String getPartsOfSpeech() {
	     return "Verb";
		
	}

}*/

@FeignClient("VERB")
public interface VerbService{
	@GetMapping("/")
	public Word getWord();
	
}