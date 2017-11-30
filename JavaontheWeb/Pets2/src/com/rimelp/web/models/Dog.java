package com.rimelp.web.models;

public class Dog extends Animal implements Pet {
	
	public Dog(String name, String breed, Double weight) {
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}
	
	public String showAffection() {
		if(weight >= 30) {
			return name + " curled up next to you.";
		}
		else {
			return name + " hopped on your lap and cuddled you";
		}
	}
}
