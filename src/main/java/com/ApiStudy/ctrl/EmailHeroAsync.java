package com.ApiStudy.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailHeroAsync {

	@Autowired
	private MessengeSender sender;
	
	@RequestMapping(value = "/mail-me-hero")
	public String mailMeHeroes(@RequestParam(value="email") String email, @RequestParam(value="heroID") String heroID) {
		try {
			sender.send(email + " = " + heroID);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(email + " = " + heroID);
		return email + " = " + heroID;
	}
}
