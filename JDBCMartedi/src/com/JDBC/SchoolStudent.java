package com.JDBC;

import java.time.LocalDate;

public class SchoolStudent {
	
	long id;
	String name;
	String lastname;
	String gender;
	String birthdate;
	double avg;
	double min_vote;
	double max_vote;
	
	
	public SchoolStudent(String name, String lastname, String gender, String birthdate, double avg, double min_vote,
			double max_vote) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.gender = gender;
		this.birthdate = birthdate;
		this.avg = avg;
		this.min_vote = min_vote;
		this.max_vote = max_vote;
	}
	


	public long getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getBirthdate() {
		return birthdate;
	}


	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}


	public double getAvg() {
		return avg;
	}


	public void setAvg(double avg) {
		this.avg = avg;
	}


	public double getMin_vote() {
		return min_vote;
	}


	public void setMin_vote(double min_vote) {
		this.min_vote = min_vote;
	}


	public double getMax_vote() {
		return max_vote;
	}


	public void setMax_vote(double max_vote) {
		this.max_vote = max_vote;
	}



	@Override
	public String toString() {
		
		return "id = " + this.id + ", nome = " + this.name + ", conome = " + this.lastname + ", sesso = " + this.gender + 
				", data di nascita = " + this.birthdate + ", media = " + this.avg + ", voto minimo = " + this.min_vote + ", voto massimo = " + this.max_vote;
	}
	
	
	
	
	
	
}
