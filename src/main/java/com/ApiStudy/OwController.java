package com.ApiStudy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ApiStudy.Achievement.Achievement;
import com.ApiStudy.Hero.Hero;
import com.ApiStudy.Map.Maps;

@RestController
public class OwController {

	/*------------*/
	/*-AUTOWIREDS-*/
	/*------------*/

	@Autowired
	HeroConsumer heroConsumer;
	@Autowired
	AchievementConsumer achievementConsumer;
	@Autowired
	MapConsumer mapConsumer;

	/*------------*/
	/*---HEROES---*/
	/*------------*/

	@RequestMapping(value = "/heroes", produces = {"text/html"})
	public String getHeroes(){
		String htm = "<html><head><font size=5><b>Hero's Profile</b></head></font><BR><BR><body>";
		for (Hero h : heroConsumer.getHeroes() ) {
			htm += "<b>Nome: </b>" + h.getName() + "<BR>";
			htm += "<b>ID: </b>" + h.getId() + "<BR>";
			htm += "<b>Real Nome: </b>" + h.getRealName() + "<BR>";
			htm += "<b>Age: </b>" + h.getAge() + "<BR>";
			htm += "<b>Height: </b>" + h.getHeight() + "<BR>";
			htm += "<b>Affiliation: </b>" + h.getAffiliation() + "<BR>";
			htm += "<b>Base of Operations: </b>" + h.getBaseOfOperations() + "<BR>";
			htm += "<b>Health: </b>" + h.getHealth() + "<BR>";
			htm += "<b>Armour: </b>" + h.getArmour() + "<BR>";
			htm += "<b>Shield: </b>" + h.getShield() + "<BR>";
			htm += "<b>Class: </b>" + h.getRoleToString();
			htm += "<b>SubClass: </b>" + h.getSubRoleToString();
			htm += "<b>Difficulty: </b>" + h.getDifficulty() + "<BR>";
			htm += "<b>Description: </b>" + h.getDescription() + "<BR>";
			htm += "<b>Abilities: </b>" + h.getAbilityToString();
			htm += "_____________________________________________<BR><BR>";
			htm += "</body></html>";
		}
		
		return htm;
	}

	@RequestMapping(value = "/heroes/{id}", produces = { "text/html" })
	public String getHeroId(@PathVariable("id") String feature) {

		
		Hero h = new Hero();
		int id = Integer.parseInt(feature);
		for (Hero temp : heroConsumer.getHeroes()) {
			h = temp;
			if (h.getId() == id)
				break;
		}
		String htm = "<html><head><font size=5><b>"+ h.getName() +"'s Profile</b>"
				+ "</font></head><body>";
		htm += "<BR><b>Id: </b>" + h.getId() + "<BR>";
		htm += "<b>Nome: </b>" + h.getName() + "<BR>";
		htm += "<b>Real Nome: </b>" + h.getRealName() + "<BR>";
		htm += "<b>Age: </b>" + h.getAge() + "<BR>";
		htm += "<b>Height: </b>" + h.getHeight() + "<BR>";
		htm += "<b>Affiliation: </b>" + h.getAffiliation() + "<BR>";
		htm += "<b>Base of Operations: </b>" + h.getBaseOfOperations() + "<BR>";
		htm += "<b>Health: </b>" + h.getHealth() + "<BR>";
		htm += "<b>Armour: </b>" + h.getArmour() + "<BR>";
		htm += "<b>Shield: </b>" + h.getShield() + "<BR>";
		htm += "<b>Class: </b>" + h.getRoleToString();
		htm += "<b>SubClass: </b>" + h.getSubRoleToString();
		htm += "<b>Difficulty: </b>" + h.getDifficulty() + "<BR>";
		htm += "<b>Description: </b>" + h.getDescription() + "<BR>";
		htm += "<b>Abilities: </b>" + h.getAbilityToString();

		htm += "</body></html>";
		return htm;
	}

	/*------------*/
	/*----MAPS----*/
	/*------------*/

	@RequestMapping(value = "/maps", produces = {"text/html"})
	public String getMaps() {
		String htm = "<html><head><font size=5><b>All Maps</b></head></font><BR><BR><body>";
		for (Maps m : mapConsumer.getMaps()) {
			htm += "<b>Id: </b>" + m.getId() + "<BR>";
			htm += "<b>Nome: </b>" + m.getName() + "<BR>";
			htm += "<b>Location: </b>" + m.getLocation() + "<BR>";
			htm += "<b>Mode: </b>" + m.getModeToString() + "<BR>";
			htm += "<b>Stage: </b>" + m.getStageToString();
			htm += "<b>Event: </b>" + m.getEventToString() + "<BR>";
			htm += "_____________________________________________<BR><BR>";
			htm += "</body></html>";
		}
		return htm;
	}

	@RequestMapping(value = "/maps/{id}", produces = { "text/html" })
	public String getMapId(@PathVariable("id") String feature) {

		Maps m = new Maps();
		int id = Integer.parseInt(feature);
		for (Maps temp : mapConsumer.getMaps()) {
			m = temp;
			if (m.getId() == id)
				break;
		}
		String htm = "<html><head><h1 style=\"color:green;\"><span style=\"margin-left:3em\">"
				+ "<b>Map</b></h1></span></head><body>";
		htm += "<b>Id: </b>" + m.getId() + "<BR>";
		htm += "<b>Nome: </b>" + m.getName() + "<BR>";
		htm += "<b>Location: </b>" + m.getLocation() + "<BR>";
		htm += "<b>Mode: </b>" + m.getModeToString() + "<BR>";
		htm += "<b>Stage: </b>" + m.getStageToString();
		htm += "<b>Event: </b>" + m.getEventToString() + "<BR>";

		return htm;
	}

	/*------------*/
	/* ACHIEVEMENTS */
	/*------------*/

	@RequestMapping(value = "/achievements")
	public List<Achievement> getAchievements() {
		return achievementConsumer.getAchievements();
	}

	@RequestMapping(value = "/achievements/{heroid}", produces = { "text/html" })
	public String getAchievementsByHeroId(@PathVariable("heroid") String heroid) {
		int id = Integer.parseInt(heroid);
		String heroName = "";
		List<Achievement> achievements = new ArrayList<Achievement>();
		for (Achievement a : achievementConsumer.getAchievements()) {
			if (a.getHero() != null && a.getHero().getId() == id) {
				achievements.add(a);
				heroName = a.getHero().getName();
			}
		}
		String htm = "<html><head><b>" + heroName + "'s Achievements</b><BR><BR></head><body>";

		for (Achievement a : achievements) {
			htm += "<b>Id: </b>" + a.getId() + "<BR>";
			htm += "<b>Name: </b>" + a.getName() + "<BR>";
			htm += "<b>Description: </b>" + a.getDescription() + "<BR>";
			htm += "<b>Reward: </b><BR>";
			htm += a.getRewardToString() + "<BR>";
			
		}
		htm += "</body></html>";
		return htm;
	}
}
