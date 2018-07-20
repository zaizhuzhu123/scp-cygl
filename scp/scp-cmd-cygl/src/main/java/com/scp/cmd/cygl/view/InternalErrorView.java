package com.scp.cmd.cygl.view;

import org.springframework.http.HttpStatus;

public class InternalErrorView extends View {
	private String message;
	private int status;
	private long errorCode;

	public InternalErrorView(String message, long errorCode) {
		status = HttpStatus.INTERNAL_SERVER_ERROR.value();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public int getStatus() {
		return status;
	}

	public long getErrorCode() {
		return errorCode;
	}
}
