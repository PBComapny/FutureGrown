package com.pbCompany.futureGrown.models.responses;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BasicErrorResponse {
    private String exception;
    private String message;
    private int status;
    private String error;

    public BasicErrorResponse(String exception, String message, int status, String error) {
        this.exception = exception;
        this.message = message;
        this.status = status;
        this.error = error;
    }
}
