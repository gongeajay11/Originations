package com.example.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.netflix.client.http.HttpResponse;

@ControllerAdvice
public class EmployeeExceptionController {

	@ExceptionHandler(EmployeeNotFoundException.class)
	public ExceptionResponse handleException(EmployeeNotFoundException e, HttpResponse response) {
		ExceptionResponse ex = new ExceptionResponse();
		ex.setErrormsg(ex.getErrormsg());
		ex.setStatuscode(ex.getStatuscode());
		return ex;

	}

}
