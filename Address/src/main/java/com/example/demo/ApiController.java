package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@GetMapping("/Adlist")
	public List<Address> getFamilyDetails(){
		List<Address> detailsList =new ArrayList<>();
		detailsList.add(new Address("Jahan Sai","Coimbatore",641046));
		detailsList.add(new Address("Raj","Chennai",60064));
		detailsList.add(new Address("Jayanth","Chennai",60073));

		
		return detailsList;
	}
	}

