package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Handbags {
	
	@GetMapping("/handbag")
	public String getHandBag(@RequestParam String company)
	{
		return"HandBag "  +company;
		
	}
	
		
			}

