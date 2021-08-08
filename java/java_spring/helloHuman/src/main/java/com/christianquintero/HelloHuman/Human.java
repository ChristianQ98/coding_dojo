package com.christianquintero.HelloHuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Human {
	@RequestMapping("/")
	public String index(@RequestParam(value = "first", required = false) String firstName, @RequestParam(value = "last", required = false) String lastName) {
		if(firstName == null) {
			return "Hello Human!";
		} else if(lastName == null) {
			return "<h1>Hello " + firstName + "!" + "<a style='margin-left:70%; font-size:70%;' href='#'>Go Back</a></h1>";
		} else {
			return "<h1>Hello " + firstName + " " + lastName + "!" + "<a style='margin-left:70%; font-size:70%;' href='#'>Go Back</a></h1>";
		}
	}
}
