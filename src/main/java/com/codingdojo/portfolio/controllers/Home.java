package com.codingdojo.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {
	@RequestMapping("/")
	public String index() {
		return "forward:/index.html";
	}
	
	@RequestMapping("/projects")
	public String projects() {
		return "proj.html";
	}
	
	@RequestMapping("/me")
	public String mepage() {
		return "mepage.html";
	}
}
