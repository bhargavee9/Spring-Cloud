package com.eureka.lab4sentence.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.eureka.lab4sentence.Word;
/*
@Service
public class NounService extends WordService {
	
	@GetMapping("/")
	public String getPartsOfSpeech() {
	     return "NOUN";
		
	}

}*/
@FeignClient("NOUN")
public interface NounService{
	@GetMapping("/")
	public Word getWord();
	
}
