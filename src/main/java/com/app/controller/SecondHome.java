package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondHome {
	
	@GetMapping("/secondHome")
	public String getHomeMessage(){
		return "SpringBootGitJenkinsDockerApplication Second Home Page Called...............===>";
	}

}
