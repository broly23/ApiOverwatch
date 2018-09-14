package com.ApiStudy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OwController {	
	
	@Autowired
	HeroConsumer heroConsumer;

	
}
