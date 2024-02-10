package com.spring.data.jpa.Exception;

@SuppressWarnings("serial")
public class ProductNotFoundException extends RuntimeException{
	

		public ProductNotFoundException(String message) {
	        super(message);
	    }
	}

