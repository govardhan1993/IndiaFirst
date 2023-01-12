package com.spring.project.exception;

public class UserAlredyFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserAlredyFoundException(String message) {
		super(message);
	}
	

}
