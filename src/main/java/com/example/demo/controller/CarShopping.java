package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class CarShopping {
	@GetMapping("/toyota")
	public String getToyotaCar(@RequestParam String model)
	{
		return "Toyota " + model;
	}
	
	@GetMapping("/tesla")
	public String getTeslaCar()
	{
		return "Tesla 2023 models";
		
	}
	
	@GetMapping("/audi")
	public String getAudiCar()
	{
		return " Audi Cars";
	}
	
	
	@GetMapping("/hundai")
	public String getHundaiCar()
	{
		return "Hundai cars";
	}
	
}
