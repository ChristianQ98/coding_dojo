package com.christianquintero.routing;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {

	@RequestMapping(value = "/dojo", method = RequestMethod.GET)
	public String dojo(@PathVariable("dojo") String dojo) {
		return "The dojo is awesome!";
	}
	
	
	@RequestMapping(value = "/burbank-dojo/{burbank}", method = RequestMethod.GET)
	public String burbank(@PathVariable("burbank") String burbank) {
		return "Burbank Dojo is located in Southern California." + burbank;
	}
	
	
	@RequestMapping(value = "/san-jose/{san-jose}", method = RequestMethod.GET)
	public String sanJose(@PathVariable("san-jose") String sanJose) {
		return "SJ dojo is the headquarters." + sanJose ;
	}
}
