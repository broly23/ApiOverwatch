package com.ApiStudy.Achievement;

import com.ApiStudy.Hero.HeroBean;

public class Achievement {	

	private Integer id;
	private String name;
	private String description;
	private String url;
	private HeroBean hero;
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

	public HeroBean getHero() {
	return hero;
	}

	public void setHero(HeroBean hero) {
	this.hero = hero;
	}

	public Reward getReward() {
	return reward;
	}
	
	public String getRewardToString() {
		String rewardString = "";
		rewardString += "<b>Id: </b>" + reward.getId() + "<BR>";
		rewardString += "<b>Name: </b>" + reward.getName() + "<BR>";
		rewardString += "<b>Cost: </b>" + reward.getCost() + "<BR>";
		rewardString += "<b>URL: </b>" + reward.getUrl() + "<BR>";
		rewardString += "<b>Type: </b><BR>";
		rewardString += "<b>Id: </b>" + reward.getType().get(Reward.idType) + "<BR>";
		rewardString += "<b>Name: </b>" + reward.getType().get(Reward.nameType) + "<BR>";
		rewardString += "<b>URL: </b>" + reward.getType().get(Reward.urlType) + "<BR>";
		rewardString += "<b>Quality: </b><BR>";
		rewardString += "<b>Id: </b>" + reward.getQuality().get(Reward.nameQuality) + "<BR>";
		return rewardString;
		
	}

	public void setReward(Reward reward) {
	this.reward = reward;
	}

}
