package com.springstart.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springstart.dev.Developer;

@Service
public class DeveloperService {
	private List<Developer> developers = new ArrayList<>(Arrays.asList(
				(new Developer("1", "Developer1","Java,Spring Boot" )),  
				(new Developer("2", "Developer2","Java,Spring Boot,REST,AWS" ))
						));
	
	public List<Developer> getAllDeveloper()  
	{  
	return developers;  
	}

	public void addDeveloper(Developer developer) {
		
		developers.add(developer);
	}

	public void updateDeveloper(Developer developer, String id) {
		
		for(int i=0;i<developers.size();i++) {
			Developer dev =developers.get(i);
			if(dev.getId().equals(id)) {
				developers.set(i, developer);
				return;
			}
		}
	}


	public void deleteDeveloper(String id) {
		developers.removeIf(t ->t.getId().equals(id));
	}  
}

