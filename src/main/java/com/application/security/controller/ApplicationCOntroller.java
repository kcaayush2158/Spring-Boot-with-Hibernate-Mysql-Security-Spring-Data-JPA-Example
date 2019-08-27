package com.application.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/auth")
public class ApplicationCOntroller {
	
	@GetMapping("/process")
	public String process() {
		return "processing";
	}
}
