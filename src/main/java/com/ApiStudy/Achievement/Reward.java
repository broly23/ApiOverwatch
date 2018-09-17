package com.ApiStudy.Achievement;

import java.util.ArrayList;
import java.util.Map;

public class Reward {

	private Integer id;
	private String name;
	private Object cost;
	 String url;
	private ArrayList < Map<String, String> > type = new ArrayList < Map<String, String> > ();
	private Map<String, String> quality;

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

	public Object getCost() {
		return cost;
	}

	public void setCost(Object cost) {
		this.cost = cost;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public ArrayList < Map<String, String> > getType() {
		return type;
	}

	public void setType(ArrayList < Map<String, String> > type) {
		this.type = type;
	}

	public Map<String, String> getQuality() {
		return quality;
	}

	public void setQuality(Map<String, String> quality) {
		this.quality = quality;
	}

}
