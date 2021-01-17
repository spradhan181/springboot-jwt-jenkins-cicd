package com.springboot.jwt.jenkins.cicd.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CiICDApplication {
	
	@GetMapping(path = "/test")
	public String test() {
		return "SUCCESS";
	}

}
