package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ApiController {
  public String name="Jahan Sai";
  @GetMapping("/msg")
  public String getName() {
	
	  return "Hi "+name;
	  
  }
}
