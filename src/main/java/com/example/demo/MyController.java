package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/msg")
	public Res getMsg()
	{
		return new Res("GG!");
	}
	
}
