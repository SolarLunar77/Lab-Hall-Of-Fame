package co.grandcircus.LabHallOfFame.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HallOfFameResponse {
	
	@JsonProperty("tiny")
	private List<Inventor> inventors;
	
	@JsonProperty("complete")
	private List<Innovator> innovators;
	
	
	
	@JsonProperty
	public List<Inventor> getInventors() {
		return inventors;
	}
	
	public void setInventors(List<Inventor> inventors) {
		this.inventors = inventors;
	}

	public List<Innovator> getInnovators() {
		return innovators;
	}

	public void setInnovators(List<Innovator> innovators) {
		this.innovators = innovators;
	}

	public HallOfFameResponse(List<Inventor> inventors, List<Innovator> innovators) {
		super();
		this.inventors = inventors;
		this.innovators = innovators;
	}

	public HallOfFameResponse() {
		super();
	}

	@Override
	public String toString() {
		return "HallOfFameResponse [inventors=" + inventors + ", innovators=" + innovators + "]";
	}
	
	

}
