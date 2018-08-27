package com.eureka.lab4sentence.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eureka.lab4sentence.dao.*;

@Service
public class SentenceService {
	WordService wordservice;
	
	
		public SentenceService(WordService wordservice) {
		super();
		this.wordservice = wordservice;
	}


		public String buildSentence() {
			String sentence = "There was a problem assembling the sentence!";
			sentence =  
				String.format("%s %s %s %s %s.",
						wordservice.getSubject().getString(),
						wordservice.getVerb().getString(),
					    wordservice.getArticle().getString(),
					    wordservice.getAdjective().getString(),
					    wordservice.getNoun().getString());
			return sentence;
		}
		
		
        
	
		
	}	

