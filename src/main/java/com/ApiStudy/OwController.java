package com.ApiStudy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ApiStudy.Hero.Hero;
import com.ApiStudy.Map.Map;


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
		String htm = "<html><head><h1 style=\"color:blue;\"><span style=\"margin-left:3em\">"
				+ "<b>Hero</b></h1></span></head><body>";
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
		htm += "<b>Class: </b>" + h.getRoleTemp();
		htm += "<b>SubClass: </b>" + h.getSubRoleTemp();
		htm += "<b>Difficulty: </b>" + h.getDifficulty() + "<BR>";
		htm += "<b>Description: </b>" + h.getDescription() + "<BR>";
		htm += "<b>Abilities: </b>" + h.getAbilityTemp();
		
		
		htm += "</body></html>";
		return htm;
	}
	
	@Autowired
	MapConsumer mapConsumer;
	
	@RequestMapping(value = "/maps")
	public List<Map> getMaps(){
		return mapConsumer.getMaps();
	}
	
	@RequestMapping(value = "/maps/{id}", produces = {"text/html"})
	public String getMapId(@PathVariable("id") String feature){
		
		Map m = new Map();
		int id = Integer.parseInt(feature);
		for(Map temp : mapConsumer.getMaps()) {
			m = temp;
			if(m.getId() == id)break; 
		}
		String htm = "<html><head><h1 style=\"color:green;\"><span style=\"margin-left:3em\">"
				+ "<b>Map</b></h1></span></head><body>";
		htm += "<b>Id: </b>" + m.getId() + "<BR>";
		htm += "<b>Nome: </b>" + m.getName() + "<BR>";
		htm += "<b>Location: </b>" + m.getLocation() + "<BR>";
		htm += "<b>Mode: </b>" + m.getModeTemp() + "<BR>";
		htm += "<b>Stage: </b>" + m.getStageTemp();
		
			htm += "<b>Event: </b>" + m.getEventTemp() + "<BR>";
		
		return htm;
	}
}
