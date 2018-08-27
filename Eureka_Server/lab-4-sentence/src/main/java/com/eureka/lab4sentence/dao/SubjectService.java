package com.eureka.lab4sentence.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.eureka.lab4sentence.Word;

/*@Service
public class SubjectService extends WordService {
	@GetMapping("/")
	public String getPartsOfSpeech() {
	     return "SUBJECT";
		
	}

}*/


@FeignClient("SUBJECT")
public interface SubjectService{
	@GetMapping("/")
	public Word getWord();
	
}