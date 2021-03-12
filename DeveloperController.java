package com.springstart.controller;



import java.util.Arrays;
/*
 * public class BooksController {
 * 
 * }
 */
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springstart.dev.Developer;
import com.springstart.service.DeveloperService;

//mark class as Controller  
@RestController  
public class DeveloperController   
{
	@Autowired
	private DeveloperService developerService;
	
	@RequestMapping("/developer")
	public List<Developer> getAllDeveloper() {
		return developerService.getAllDeveloper();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/developer")
	public void addDeveloper(@RequestBody Developer developer) {
		developerService.addDeveloper(developer);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/developer/{id}")
	public void updateDeveloper(@RequestBody Developer developer, @PathVariable String id) {
		developerService.updateDeveloper(developer,id);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/developer/{id}")
	public void deleteDeveloper( @PathVariable String id) {
		developerService.deleteDeveloper(id);
	}
}