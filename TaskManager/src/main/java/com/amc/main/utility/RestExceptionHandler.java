package com.amc.main.utility;

import java.time.LocalDateTime;

import javax.persistence.EntityNotFoundException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler
{

	 @Override
	   protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
	       String error = "Malformed JSON request";
	       return buildResponseEntity(new ApiError(HttpStatus.BAD_REQUEST,LocalDateTime.now(), error, ex.getLocalizedMessage()));
	   }

	   private ResponseEntity<Object> buildResponseEntity(ApiError apiError) {
	       return new ResponseEntity<>(apiError, apiError.getStatus());
	   }
	   
	   @ExceptionHandler(EntityNotFoundException.class)
	   protected ResponseEntity<Object> handleEntityNotFound(
	           EntityNotFoundException ex) {
	       ApiError apiError = new ApiError(HttpStatus.NOT_FOUND,LocalDateTime.now(),ex.getMessage(),ex.getLocalizedMessage());
	       apiError.setMessage(ex.getMessage());
	       return buildResponseEntity(apiError);
	   }
	
	
	
	
}
