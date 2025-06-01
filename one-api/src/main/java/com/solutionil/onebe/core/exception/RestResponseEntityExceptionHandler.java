package com.solutionil.onebe.core.exception;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.SchedulingException;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Slf4j
@ControllerAdvice
@RestController
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

  @ExceptionHandler(Exception.class)
  public final ResponseEntity<ExceptionResponse> handleAllExceptions(Exception ex, WebRequest request) {
    ExceptionResponse exceptionResponse = new ExceptionResponse(ex.getMessage(), request.getDescription(false));
    log.error(ex.getMessage(), ex);
    return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
  }
  @ExceptionHandler(RuntimeException.class)
  public final ResponseEntity<ExceptionResponse> handleRuntimeExceptions(RuntimeException ex, WebRequest request) {
    ExceptionResponse exceptionResponse = new ExceptionResponse(ex.getMessage(), request.getDescription(false));
    log.error(ex.getMessage(), ex);
    return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
  }

  @ExceptionHandler(NotFoundException.class)
  public final ResponseEntity<ExceptionResponse> handleUserNotFoundException(NotFoundException ex, WebRequest request) {
    ExceptionResponse exceptionResponse = new ExceptionResponse(ex.getMessage(), request.getDescription(false));
    log.error(ex.getMessage(), ex);
    return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
  }

  @ExceptionHandler(SchedulingException.class)
  public final ResponseEntity<ExceptionResponse> handleUserNotFoundException(SchedulingException ex, WebRequest request) {
    ExceptionResponse exceptionResponse = new ExceptionResponse(ex.getMessage(), request.getDescription(false));
    log.error(ex.getMessage(), ex);

    return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
  }

  @ExceptionHandler(AlertMessageException.class)
  public final ResponseEntity<ExceptionResponse> handleAlertMessageException(AlertMessageException ex, WebRequest request) {
    ExceptionResponse exceptionResponse = new ExceptionResponse(ex.getMessage(), request.getDescription(false));

    if (!StringUtils.hasText(ex.getOriginException().getMessage())) {
      // 슬랙 알람

    }

    log.error(ex.getMessage(), ex);
    return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
  }

}
