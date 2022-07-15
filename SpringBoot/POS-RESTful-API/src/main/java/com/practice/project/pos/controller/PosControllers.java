package com.practice.project.pos.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PosControllers {
	
	@GetMapping(value="/")
	@CrossOrigin(origins = "http://localhost:4200")
	public String getPage() {
		return "Wellcome";
	}
}
