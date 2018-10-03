package com.ApiStudy.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ApiStudy.messenger.MessengeSender;

@RestController
public class Controller {
	
	@Autowired
	MessengeSender sender;

	@RequestMapping(value = "/heroes")
	public String getHeroes(@RequestParam(value="produce", defaultValue="json") String produce) {
		try {
			sender.send("/heroes | " + produce);
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
		return "202 - Solicitação enviada com sucesso";
	}
	
}
