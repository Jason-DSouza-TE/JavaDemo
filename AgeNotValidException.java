package com.te.exceptions2.common;

public class AgeNotValidException extends Exception {
	String msg;

	public AgeNotValidException(String message) {
		this.msg = message;
	}

	@Override
	public String getMessage() {
		return this.msg;
	}

}
