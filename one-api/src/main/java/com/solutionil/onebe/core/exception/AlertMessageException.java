package com.solutionil.onebe.core.exception;


import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Data
@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class AlertMessageException extends RuntimeException {
  private Exception originException;

	@Builder
	public AlertMessageException(String message, Exception e) {
	  super(message);
	  this.originException = e;
  }
}
