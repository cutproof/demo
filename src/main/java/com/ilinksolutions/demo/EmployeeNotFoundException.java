package com.ilinksolutions.demo;

class EmployeeNotFoundException extends RuntimeException {

	EmployeeNotFoundException(Long id) {
		super("Could not find employee " + id);
	}
}
