package com.example.exception;

public class ExceptionResponse {

	private int statuscode;
	private String errormsg;

	public int getStatuscode() {
		return statuscode;
	}

	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}

	public String getErrormsg() {
		return errormsg;
	}

	public void setErrormsg(String errormsg) {
		this.errormsg = errormsg;
	}

}
