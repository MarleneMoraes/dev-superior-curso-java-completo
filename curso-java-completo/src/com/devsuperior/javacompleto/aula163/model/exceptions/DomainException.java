package com.devsuperior.javacompleto.aula163.model.exceptions;

public class DomainException extends RuntimeException{
	private static final long serialVersionUID = 1L; //serializable
	
	public DomainException(String msg) {
		super(msg);
	}

}
