package edu.asu.diging.tutorial.spring.service;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import edu.asu.diging.tutorial.spring.domain.Mood;
 
@Service
public class MoodService {
 
	
	@PostConstruct
	public void init(){
		
	}
	
	
	
	
    public Mood getCurrentMood() {
        return new Mood("happy");
    }
    	
    public String getExplantion(){
    	return "every thing is interlinked";
    }

}