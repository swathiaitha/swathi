package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Shopping {
	
@GetMapping("/mobile")
public String mobile() {
		return " mobile offers";
}
	
	
@GetMapping("/iphone")
	public String iphone()
	{
	return "i phone 14 pro $200 discount";
}

@GetMapping("/samsung")
public String samsung(){

	return "samsung s23 ultra $250cashback";
	
	
}
@GetMapping("/lg")
public String lg(){
	return "LG 85 inch LED TV";
}

}
