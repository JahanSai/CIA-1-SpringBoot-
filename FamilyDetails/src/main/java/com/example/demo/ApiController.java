package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@GetMapping("/list")
	public List<family> getFamilyDetails(){
		List<family> detailsList =new ArrayList<>();
		detailsList.add(new family("Meena",47,"Mother"));
		detailsList.add(new family("Jahan",19,"Son"));
		detailsList.add(new family("Jaswanthi",19,"Daughter"));
		
		return detailsList;
	}
	}

