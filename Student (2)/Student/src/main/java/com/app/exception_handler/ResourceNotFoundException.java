package com.app.exception_handler;

public class ResourceNotFoundException extends RuntimeException {
	
	public ResourceNotFoundException(String mesg) {
		super(mesg);
	}

}
