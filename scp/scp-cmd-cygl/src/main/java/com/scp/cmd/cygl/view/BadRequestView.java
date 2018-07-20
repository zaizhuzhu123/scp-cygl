package com.scp.cmd.cygl.view;

import org.springframework.http.HttpStatus;

public class BadRequestView extends View {
	private String message;
	private int status;

	public BadRequestView(String message) {
		this.status = HttpStatus.BAD_REQUEST.value();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public int getStatus() {
		return status;
	}
}
