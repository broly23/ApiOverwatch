package com.ApiStudy.Achievement;

import com.ApiStudy.Hero.Hero;

public class Achievement {	

	private Integer id;
	private String name;
	private String description;
	private String url;
	private Hero hero;
	private Reward reward;

	public Integer getId() {
	return id;
	}

	public void setId(Integer id) {
	this.id = id;
	}

	public String getName() {
	return name;
	}

	public void setName(String name) {
	this.name = name;
	}

	public String getDescription() {
	return description;
	}

	public void setDescription(String description) {
	this.description = description;
	}

	public String getUrl() {
	return url;
	}

	public void setUrl(String url) {
	this.url = url;
	}

	public Hero getHero() {
	return hero;
	}

	public void setHero(Hero hero) {
	this.hero = hero;
	}

	public Reward getReward() {
	return reward;
	}

	public void setReward(Reward reward) {
	this.reward = reward;
	}
}
