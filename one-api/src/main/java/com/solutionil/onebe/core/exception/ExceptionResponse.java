package com.solutionil.onebe.core.exception;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ExceptionResponse {
	  private String details;
	  private String message;

	  public ExceptionResponse(String message, String details) {
	    super();
	    this.message = message;
	    this.details = details;
	  }
}