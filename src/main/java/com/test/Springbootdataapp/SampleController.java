package com.test.Springbootdataapp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	@GetMapping(path="/")
	 public String sayHello() {
	  return "Hello!! from Java Hungry";
	 }
}
