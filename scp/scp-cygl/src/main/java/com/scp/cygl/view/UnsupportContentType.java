package com.scp.cygl.view;

import java.util.Set;

import org.springframework.http.HttpStatus;

public class UnsupportContentType extends View {
	private String message;
	private int status;
	private Set<String> supportContentTypes;

	public UnsupportContentType(String message, Set<String> supportContentTypes) {
		this.status = HttpStatus.METHOD_NOT_ALLOWED.value();
		this.message = message;
		this.supportContentTypes = supportContentTypes;
	}

	public String getMessage() {
		return message;
	}

	public int getStatus() {
		return status;
	}

	public Set<String> getSupportContentTypes() {
		return supportContentTypes;
	}

}
