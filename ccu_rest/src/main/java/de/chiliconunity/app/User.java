package de.chiliconunity.app;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	public enum Gender {
		male, female, other
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Integer id;
	private String name;
	private String email;
	LocalDate birthdate;
	Gender gender;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private User() {
	}

	public static User createUser(LocalDate birthdate, String name, String email, Gender gender) {
		User user = new User();
		user.setBirthdate(birthdate);
		user.setGender(gender);
		user.setEmail(email);
		user.setName(name);
		return user;
	}

	// @formatter:off
	
	@Override
	public String toString() {
		return new java.lang.StringBuilder()
				.append("User [")
					.append(" name=").append(name)
					.append(", email=").append(email)
					.append(", gender=").append(gender)
					.append(", birthdate=").append(birthdate)
				.append("]").toString();
	}

	// @formatter:on

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

}
