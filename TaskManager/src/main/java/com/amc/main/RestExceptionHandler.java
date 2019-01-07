package com.amc.main;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.amc.main.utility.ApiError;
import com.amc.main.utility.NotFoundException;

@ControllerAdvice
public class RestExceptionHandler {
	
	
	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<ApiError> sendNotFound(Exception exception)
	{
		ApiError apiError = new ApiError(HttpStatus.NOT_FOUND, LocalDateTime.now(), exception.getMessage());
		ResponseEntity< ApiError> entity = new ResponseEntity<ApiError>(apiError, HttpStatus.NOT_FOUND);
		return entity;
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ApiError> globalException(Exception exception)
	{
		ApiError apiError = new ApiError(HttpStatus.INTERNAL_SERVER_ERROR, LocalDateTime.now(), exception.getMessage());
		ResponseEntity< ApiError> entity = new ResponseEntity<ApiError>(apiError, HttpStatus.INTERNAL_SERVER_ERROR);
		return entity;
	}
}
