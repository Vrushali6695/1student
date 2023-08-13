package com.app.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString

public class ApiResponse {
	
	private String message;
	
	public ApiResponse(String message) {
	
		this.message=message;
	}

}
