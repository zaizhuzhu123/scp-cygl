package com.cygl.scp.view;

import java.util.Set;

import org.springframework.http.HttpStatus;

public class UnsupportMethmod extends View {
	private String message;
	private int status;
	private Set<String> supportMethmods;

	public UnsupportMethmod(String message, Set<String> supportMethmods) {
		this.status = HttpStatus.METHOD_NOT_ALLOWED.value();
		this.message = message;
		this.supportMethmods = supportMethmods;
	}

	public String getMessage() {
		return message;
	}

	public int getStatus() {
		return status;
	}

	public Set<String> getSupportMethmods() {
		return supportMethmods;
	}
}
