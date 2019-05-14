package com.agsft.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.agsft.model.Employee;

@RestController
public class EmpController {
	
	@GetMapping("/")
	public String get(@PathVariable int id)
	{
		return "hiii";
	}

}
