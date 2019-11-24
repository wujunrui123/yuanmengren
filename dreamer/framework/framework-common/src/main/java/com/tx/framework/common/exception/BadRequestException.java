package com.tx.framework.common.exception;


import org.springframework.http.HttpStatus;

public class BadRequestException extends AbstractDreamerHttpException {

  public BadRequestException(String str) {
    super(str);
    setHttpStatus(HttpStatus.BAD_REQUEST);
  }
}
