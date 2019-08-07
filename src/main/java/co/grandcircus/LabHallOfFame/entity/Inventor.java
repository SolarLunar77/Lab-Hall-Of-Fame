package co.grandcircus.LabHallOfFame.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Inventor implements Comparable<Inventor> {
	
	private String name;
	
	//@JsonProperty is used to change/match the JSON fields in the API
	@JsonProperty(value="invented")
	private String invention;
	
	private Integer year;
	
	

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInvention() {
		return invention;
	}

	public void setInvention(String invention) {
		this.invention = invention;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Inventor(String name, String invention, Integer year) {
		super();
		this.name = name;
		this.invention = invention;
		this.year = year;
	}

	public Inventor() {
		super();
	}

	@Override
	public String toString() {
		return "Inventor [name=" + name + ", invention=" + invention + ", year=" + year + "]";
	}

	@Override
	public int compareTo(Inventor o) {
		// TODO Auto-generated method stub
		return 0;
	}
	


}
