package test.boottest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Test {

	@GetMapping("/lik/BTS")
	public String call() {
		return "<body bgcolor='pink' text='black'><h1>Hello, we are BTS!</h1></body";

	}

	@GetMapping("/lik/{name}")
	public String call2(@PathVariable String name) {
		name = name.toUpperCase();
		return "<body bgcolor='red' text='yellow'><h1>Hi, I am!" + name + "</h1></body";

	}

	@GetMapping("\test")
	public String postTest(@RequestParam String name, @RequestParam String job) {
		return "<h1>" + name + "works as a" + job + "</h1>";
	}

}
