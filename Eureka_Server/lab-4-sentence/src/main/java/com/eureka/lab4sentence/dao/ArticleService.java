package com.eureka.lab4sentence.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.eureka.lab4sentence.Word;

@FeignClient("ARTICLE")
public interface ArticleService {
       @GetMapping("/")
       public Word getWord();
}
