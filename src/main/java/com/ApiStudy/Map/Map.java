package com.ApiStudy.Map;

import java.util.List;

import org.springframework.util.StringUtils;

public class Map {

	private Integer id;
	private String name;
	private String location;
	private String url;
	private Mode mode;
	private List<Stage> stages = null;
	private Event event;

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
	

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public String getModeTemp() {
		String modeTemp = "";
		modeTemp += StringUtils.capitalize(this.getMode().getName());
		modeTemp += "(" + "<b>Id: </b>" + Integer.toString(this.getMode().getId())+ ")";
		return modeTemp;
	}

	public String getStageTemp() {
		String stageTemp = "<BR>";
		for (Stage s : stages) {
			stageTemp += "<b><span style=\"margin-left:2em\">Id: </b>" + s.getId() + "</span>" + "<BR>";
			stageTemp += "<b><span style=\"margin-left:2em\">Nome: </b>" + s.getName()  + "</span>" + "<BR>";
		}
		
		return stageTemp;
	}
	
		public String getEventTemp() {
			String eventTemp = "";
			if (getEvent() == null) {
				eventTemp += "No Event"; 
			} else {
				eventTemp += "<BR><b><span style=\"margin-left:2em\">Id: </b>" + Integer.toString(this.getEvent().getId()) + "</span>"+ "<BR>";
				eventTemp += "<b><span style=\"margin-left:2em\">Name: </b>" + getEvent().getName() + "</span>" + "<BR>";
				eventTemp += "<b><span style=\"margin-left:2em\">Start Date: </b>" + getEvent().getStartDate() + "</span>"+ "<BR>";
				eventTemp += "<b><span style=\"margin-left:2em\">End Date: </b>" + getEvent().getEndDate()+ "</span>";
			}
				return eventTemp;
		}
}
