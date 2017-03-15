package de.chiliconunity.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@javax.persistence.Entity
@Table(name="USRS")
public class User{
	
	public enum Geschlecht{
		maennlich, weiblich
	}
    
	int id;
	
	Date geburtsdatum;
	
	String name;
	
	String mail;
	
	Geschlecht geschlecht;
	
	@JsonIgnore
	List<Projekt> meineProjekte = new ArrayList<Projekt>();
	
	@JsonIgnore
	List<Rezept> meineRezepte = new ArrayList<Rezept>();
	String passwort ="asdf";
//	TechnischeRolle technischeRolle = new TechnischerAnwender();
	
	public User(){
	}
	
	public static User createUser(Date geburtsdatum, String name, String mail, Geschlecht geschlecht){
		User user = new User();
		user.setGeburtsdatum(geburtsdatum);
		user.setGeschlecht(geschlecht);
		user.setMail(mail);
		user.setName(name);		
		return user;
	}
	
	   @Override
	    public String toString() {
	        return "User [Name= " + name  + ", email=" + mail + ", geschlecht= " + geschlecht + ", Geburtsdatdum= " + geburtsdatum + "]";
	    }
	
//	public TechnischeRolle getTechnischeRolle(){
//		return this.technischeRolle;
//	}
//	   
	   

	public Date getGeburtsdatum() {
		return geburtsdatum;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name="gbrtsdtm")
	public void setGeburtsdatum(Date geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

	@Column(name="NME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name="ML")
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Geschlecht getGeschlecht() {
		return geschlecht;
	}

	public void setGeschlecht(Geschlecht geschlecht) {
		this.geschlecht = geschlecht;
	}

	public List<Projekt> getMeineProjekte() {
		return meineProjekte;
	}

	public void setMeineProjekte(ArrayList<Projekt> meineProjekte) {
		this.meineProjekte = meineProjekte;
	}
	
	public List<Rezept> getMeineRezepte() {
		return meineRezepte;
	}

	public void setMeineRezepte(ArrayList<Rezept> meineRezepte) {
		this.meineRezepte = meineRezepte;
	}

	public String getPasswort() {
		return this.passwort;
	}
	

	public void setPasswort(String passwort) {
		this.passwort=passwort;
		
	}
	
	@Id
	@GeneratedValue(generator="identGenerator")
	@GenericGenerator(name="identGenerator", strategy= "IDENTITY")
	public int getId(){
		return this.id;
	}

	}

