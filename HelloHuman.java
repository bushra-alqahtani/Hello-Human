package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class HelloHuman {
	
	
	
	//Create an app that will show in the browser either a default value of "human" or with the name provided in the URL query string.
	@RequestMapping("/")
	public String hello() {
		return "hello from the controller ";
	}
	
	
	//NINJA BONUS: Include a "last_name" as a parameter and print out both the first and last names.
	
	@RequestMapping(value="/{human}/{human2}",method=RequestMethod.GET)
	public String greating(@PathVariable("human") String human,@PathVariable("human2") String human2) {
	
		
		
		return "Hello "+ human +" "+ human2 +"  ";
	}
	
	//SENSEI BONUS: Add a "times" parameter and show the greeting that many times.
	
	@RequestMapping(value="/{human}/{human2}/{times}",method=RequestMethod.GET)
	public String greatingTimes(@PathVariable("human") String human,@PathVariable("human2") String human2,@PathVariable("times") int times) {
	
		
		
		return ("Hello "+ human +" "+ human2 +"  ").repeat(times);
	}
	

//	@RequestMapping("/request-param")
//	public String index(@RequestParam(value="q") String searchQuery) {
//		return " You searched for "+searchQuery;
//	}
}
