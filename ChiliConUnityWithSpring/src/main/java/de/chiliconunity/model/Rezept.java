package de.chiliconunity.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Rezept {

	int id;
	int anzahlPersonen;
	String name;
	User ersteller;
	List<Schritt> schritte = new ArrayList<Schritt>();
	
	@SuppressWarnings("deprecation")
	public Rezept(){
		//TODO!
		this.setAnzahlPersonen(20);
		this.setErsteller(User.createUser(new Date(1993, 03, 29), "Patrick Heger", "patrickheger1993@web.de", User.Geschlecht.maennlich));
		this.setName("Hello World");
		this.getErsteller().getMeineRezepte().add(this);
		System.out.println("Rezept erstellt");	
	}

	public int getAnzahlPersonen() {
		return anzahlPersonen;
	}


	public void setAnzahlPersonen(int anzahlPersonen) {
		this.anzahlPersonen = anzahlPersonen;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public User getErsteller() {
		return ersteller;
	}


	public void setErsteller(User ersteller) {
		this.ersteller = ersteller;
	}


	public List<Schritt> getSchritte() {
		return schritte;
	}


	public void setSchritte(ArrayList<Schritt> schritte) {
		this.schritte = schritte;
	}
	
	public int getId(){
		return this.id;
	}
}
