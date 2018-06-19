package com.casalenca.model;

import org.springframework.http.HttpStatus;

public class Message {

	private HttpStatus status;
	private String message;

	public Message() {
		// TODO Auto-generated constructor stub
	}

	public Message(HttpStatus status, String message) {
		this.status = status;
		this.message = message;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus accepted) {
		this.status = accepted;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
