package com.springstart.dev;



public class Developer {

	
	private String id;
	
	private String name;
	 
	private String skills;
	
	public Developer() {
		
	}

	public Developer(String id, String name, String skills) {
		super();
		this.id = id;
		this.name = name;
		this.skills = skills;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the skills
	 */
	public String getSkills() {
		return skills;
	}

	/**
	 * @param skills the skills to set
	 */
	public void setSkills(String skills) {
		this.skills = skills;
	}
	
}
