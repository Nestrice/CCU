package de.chiliconunity.data;

import java.util.ArrayList;
import java.util.List;

public class Recipe {

	int numberOfPersons;
	String name;
	User author;
	List<Step> steps = new ArrayList<Step>();
	List<Ingredient> ingredients = new ArrayList<>();
	
	public Recipe(){
		//TODO!
		this.setNumberOfPersons(20);
		//this.setErsteller(User.createUser(new Date(1993, 03, 29), "Patrick Heger", "patrickheger1993@web.de", User.Gender.maennlich));
		this.setName("Hello World");
		//this.getErsteller().getMeineRezepte().add(this);
		System.out.println("Rezept erstellt");	
	}

	public int getNumberOfPersons() {
		return numberOfPersons;
	}


	public void setNumberOfPersons(int numberOfPersons) {
		this.numberOfPersons = numberOfPersons;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public User getAuthor() {
		return author;
	}


	public void setAuthor(User author) {
		this.author = author;
	}


	public List<Step> getSteps() {
		return steps;
	}


	public void setSteps(ArrayList<Step> steps) {
		this.steps = steps;
	}
}
