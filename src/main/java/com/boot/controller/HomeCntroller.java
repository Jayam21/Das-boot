package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeCntroller {
	@RequestMapping("/")
	public String home() {
		return "Das Boot ,reporting for duty"; 
	}

}
