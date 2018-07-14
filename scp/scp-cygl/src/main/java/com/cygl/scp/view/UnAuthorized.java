package com.cygl.scp.view;

import org.springframework.http.HttpStatus;

public class UnAuthorized extends View {
	private String message;
	private int status;

	public UnAuthorized(String message) {
		status = HttpStatus.UNAUTHORIZED.value();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public int getStatus() {
		return status;
	}
}
