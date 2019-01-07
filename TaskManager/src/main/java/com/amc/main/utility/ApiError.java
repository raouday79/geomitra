package com.amc.main.utility;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class ApiError {
	
	
	private HttpStatus httpStatus;
	
	private LocalDateTime localDateTime;
	
	private String message;

	public ApiError(HttpStatus httpStatus, LocalDateTime localDateTime, String message) {
		super();
		this.httpStatus = httpStatus;
		this.localDateTime = localDateTime;
		this.message = message;
		
	}
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}
	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	

}
