package com.ApiStudy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ApiStudy.Hero.Hero;

@RestController
public class OwController {	
	
	@Autowired
	HeroConsumer heroConsumer;

	@RequestMapping(value = "/heroes")
	public List<Hero> getHeroes(){
		return heroConsumer.getHeroes();
	}
	
}
