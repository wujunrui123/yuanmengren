package com.tx.framework.common.exception;

import org.springframework.http.HttpStatus;


public abstract class AbstractDreamerHttpException extends RuntimeException {

    protected HttpStatus httpStatus;

    public AbstractDreamerHttpException(String msg){
        super(msg);
    }

    public AbstractDreamerHttpException(String msg, Exception e){
        super(msg,e);
    }

    protected void setHttpStatus(HttpStatus httpStatus){
        this.httpStatus = httpStatus;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
