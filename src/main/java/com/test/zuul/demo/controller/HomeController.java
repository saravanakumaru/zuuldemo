package com.test.zuul.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class HomeController {
	private static Logger log = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "home", method = RequestMethod.GET)
	public String getHomePage() {
		return "Welcome to Spring boot app";
	}

	@RequestMapping(value = "campaign", method = RequestMethod.GET)
	public String getCampaignDetails() {
		log.info("This >> Coming in to the campaign");
		return "This is inside Campaign details";
	}

}
