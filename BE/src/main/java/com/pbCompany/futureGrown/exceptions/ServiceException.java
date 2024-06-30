package com.pbCompany.futureGrown.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;
@Getter
public class ServiceException extends RuntimeException {
    private HttpStatus httpStatus;
    private String message;
    public ServiceException(HttpStatus httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.message = message;
    }
}
