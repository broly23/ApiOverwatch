package com.ApiStudy.Map;

import java.util.List;

public class Map {

	private Integer id;
	private String name;
	private String location;
	private String url;
	private Mode mode;
	private List<Stage> stages = null;
	private Object event;

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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Mode getMode() {
		return mode;
	}

	public void setMode(Mode mode) {
		this.mode = mode;
	}

	public List<Stage> getStages() {
		return stages;
	}

	public void setStages(List<Stage> stages) {
		this.stages = stages;
	}

	public Object getEvent() {
		return event;
	}

	public void setEvent(Object event) {
		this.event = event;
	}

}
