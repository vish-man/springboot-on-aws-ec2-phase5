package com.vishwanath.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping(" ")
	public String welcome()
	{
		return"Hi there!! I'm Vish here..:)";
	}

}
