package com.example.AdminService;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

public class Teams {

	
	private String teamCode;
	private String teamName;
	
	
	public Teams() {
		
	}

	public Teams( String teamCode, String teamName) {
		
		this.teamCode = teamCode;
		this.teamName = teamName;
	
	}

	
	public String getTeamCode() {
		return teamCode;
	}

	public void setTeamCode(String teamCode) {
		this.teamCode = teamCode;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	
}
