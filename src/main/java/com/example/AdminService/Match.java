package com.example.AdminService;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="Match")
public class Match {

	@Id
	private int id;
	
	private String Date;
	private String timing;
	private String stadium;
	private String teamAName;
	private String teamBName;

	
	public Match() {
		
	}

	public Match(int id, String date, String timing, String stadium,String teamAName, String teamBName) {
		this.id=id;
		
		this.Date = date;
		this.timing = timing;
		this.stadium = stadium;
		this.teamAName = teamAName;
		this.teamBName = teamBName;
	}
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getTiming() {
		return timing;
	}

	public void setTiming(String timing) {
		this.timing = timing;
	}

	public String getStadium() {
		return stadium;
	}

	public void setStadium(String stadium) {
		this.stadium = stadium;
	}
	
	public String getTeamAName() {
		return teamAName;
	}

	public void setTeamAName(String teamAName) {
		this.teamAName = teamAName;
	}

	public String getTeamBName() {
		return teamBName;
	}

	public void setTeamBName(String teamBName) {
		this.teamBName= teamBName;
	}
	
	
}
