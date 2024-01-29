package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

	@GetMapping("/home")
	public String getHomeMessage(){
		return "SpringBootGitJenkinsDockerApplication home page called...............";
	}
}
