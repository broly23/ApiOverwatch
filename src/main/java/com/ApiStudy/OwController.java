package com.ApiStudy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ApiStudy.Hero.Ability;
import com.ApiStudy.Hero.Hero;


@RestController
public class OwController {	
	
	@Autowired
	HeroConsumer heroConsumer;

	@RequestMapping(value = "/heroes")
	public List<Hero> getHeroes(){
		return heroConsumer.getHeroes();
	}
	
	@RequestMapping(value = "/heroes/{id}", produces = {"text/html"})
	public String getHeroId(@PathVariable("id") String feature){
		
		Hero h = new Hero();
		int id = Integer.parseInt(feature);
		for(Hero temp : heroConsumer.getHeroes()) {
			h = temp;
			if(h.getId() == id)break; 
		}
		String htm = "<html><head><b>Hero</b><BR></head><body>";
		htm += "<b>Id: </b>" + h.getId() + "<BR>";
		htm += "<b>Nome: </b>" + h.getName() + "<BR>"; 
		htm += "<b>Real Nome: </b>" + h.getRealName() + "<BR>";
		htm += "<b>Age: </b>" + h.getAge() + "<BR>";
		htm += "<b>Height: </b>" + h.getHeight() + "<BR>";
		htm += "<b>Affiliation: </b>" + h.getAffiliation() + "<BR>";
		htm += "<b>Base of Operations: </b>" + h.getBaseOfOperations() + "<BR>";
		htm += "<b>Health: </b>" + h.getHealth() + "<BR>";
		htm += "<b>Armour: </b>" + h.getArmour() + "<BR>";
		htm += "<b>Shield: </b>" + h.getShield() + "<BR>";
		htm += "<b>Class: </b>" + h.getRole() + "<BR>";
		htm += "<b>SubClass: </b>" + h.getSubRoles() + "<BR>";
		htm += "<b>Difficulty: </b>" + h.getDifficulty() + "<BR>";
		htm += "<b>Description: </b>" + h.getDescription() + "<BR>";
		htm += "<b>Abilities: </b>" + h.getAbilities() + "<BR>";
		
		
		htm += "</body></html>";
		return htm;
	}
	
}
