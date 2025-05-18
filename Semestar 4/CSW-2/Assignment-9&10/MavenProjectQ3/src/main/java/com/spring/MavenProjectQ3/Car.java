package com.spring.MavenProjectQ3;

public class Car implements Vehicle{
	private String name;
	private int id;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getID() {
		return id;
	}
	
	public void start () {
		System.out.println(name+" car "+"with ID "+id+" is starting.");
		
	}
	public void stop() {
		System.out.println(name+" car "+"with ID "+id+" is stopping");
	}	
}
