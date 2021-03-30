package com.jsfspring.beans;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Developer implements Serializable {
	
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String firstName;

  private String lastName;

  private String email;
  
  private String skills;

  public Developer() {	
  }

  public Developer(Integer id, String firstName, String lastName, String email, String skills) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.skills = skills;
   }

   public Integer getId() {
	return id;
   }

   public void setId(Integer id) {
	this.id = id;
   }

  public String getFirstName() {
	return firstName;
  }

  public void setFirstName(String firstName) {
	this.firstName = firstName;
  }

  public String getLastName() {
	return lastName;
  }

  public void setLastName(String lastName) {
	this.lastName = lastName;
  }

  public String getEmail() {
	return email;
  }

  public void setEmail(String email) {
	this.email = email;
  }

  public String getSkills() {
	return skills;
  }

  public void setSkills(String skills) {
	this.skills = skills;
  }

  public static long getSerialversionuid() {
	return serialVersionUID;
  }

  @Override
  public String toString() {
	return "Developer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
			+ ", skills=" + skills + "]";
  }

  }
