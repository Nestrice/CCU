package de.chiliconunity.model;

import java.util.ArrayList;

public class Projekt {

	String ort;
	String name;
	int teilnehmerUNTER12;
	int teilnehmerUEBER12;
	ArrayList<Mitarbeiter> projektMitarbeiter = new ArrayList<Mitarbeiter>();
	ArrayList<Tagesplan> tagesplaene = new ArrayList<Tagesplan>();
	
}
