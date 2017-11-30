package com.rimelp.web.models;

public class Cat extends Animal implements Pet {
	
	public Cat(String name, String breed, Double weight) {
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}
	
	public String showAffection() {
		return "Your " + breed + " cat, " + name + ", looked at you with some affection. You think...";
	}
	
}