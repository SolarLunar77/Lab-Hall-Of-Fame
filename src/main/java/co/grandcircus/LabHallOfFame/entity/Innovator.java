package co.grandcircus.LabHallOfFame.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Innovator implements Comparable<Innovator>{

	private String firstName;
	
	private String lastName;
	
	private String innovation;
	
	private Integer year;
	
	
	

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

	public String getInnovation() {
		return innovation;
	}

	public void setInnovation(String innovation) {
		this.innovation = innovation;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Innovator(String firstName, String lastName, String innovation, Integer year) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.innovation = innovation;
		this.year = year;
	}

	public Innovator() {
		super();
	}

	@Override
	public String toString() {
		return "Innovator [firstName=" + firstName + ", lastName=" + lastName + ", innovation=" + innovation + ", year="
				+ year + "]";
	}

	@Override
	public int compareTo(Innovator o) {
		return getYear().compareTo(o.getYear());
	}
	
	
	
	
//	firstName	"Ada"
//	lastName	"Lovelace"
//	innovation	"published the first computer programs"
//	year	
	
}
