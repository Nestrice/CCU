package de.chiliconunity.model;

public class Schritt {

	String text;
	Schritt naechsterSchritt;
	
	public Schritt naechstenSchrittaufrufen(){
		
		if (naechsterSchritt != null){
			return naechsterSchritt;
			}
		else{
			return null;
		}
	}
}
