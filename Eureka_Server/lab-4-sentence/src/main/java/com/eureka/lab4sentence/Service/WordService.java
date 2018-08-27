package com.eureka.lab4sentence.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eureka.lab4sentence.Word;
import com.eureka.lab4sentence.dao.AdjectiveService;
import com.eureka.lab4sentence.dao.ArticleService;
import com.eureka.lab4sentence.dao.NounService;
import com.eureka.lab4sentence.dao.SubjectService;
import com.eureka.lab4sentence.dao.VerbService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class WordService {
	VerbService verbService;
	SubjectService subjectService;
	ArticleService articleService;
	AdjectiveService adjectiveService;
	NounService nounService;

	@Autowired
	public WordService(VerbService verbService, SubjectService subjectService, ArticleService articleService,
			AdjectiveService adjectiveService, NounService nounService) {
		super();
		this.verbService = verbService;
		this.subjectService = subjectService;
		this.articleService = articleService;
		this.adjectiveService = adjectiveService;
		this.nounService = nounService;
	}
	
	public Word getAdjective() {
		return adjectiveService.getWord();
	}
	
	@HystrixCommand(fallbackMethod="getFallbackArticle")
	public Word getArticle() {
		return articleService.getWord();
	}
	public Word getVerb() {
		return verbService.getWord();
	}
	public Word getNoun() {
		return nounService.getWord();
	}
	
	@HystrixCommand(fallbackMethod="getFallbackSubject")
	public Word getSubject() {
		return subjectService.getWord();
	}

	public Word getFallbackArticle() {
		return new Word("Something");
	}
	
	public Word getFallbackSubject() {
		return new Word("Someone");
	}
}
