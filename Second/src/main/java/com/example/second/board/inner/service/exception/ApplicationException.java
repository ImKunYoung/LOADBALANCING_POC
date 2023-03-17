package com.example.second.board.inner.service.exception;

import org.springframework.http.HttpStatus;

/**
 * packageName    : com.shareincor.sharein.subdomain.board.inner.service.exception
 * fileName       : ApplicationException
 * author         : ImKunYoung
 * date           : 2023-02-14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-02-14        ImKunYoung       최초 생성
 */
public class ApplicationException extends RuntimeException {

    private final String errorCode;
    private final HttpStatus httpStatus;

    protected ApplicationException(String errorCode, HttpStatus httpStatus, String message) {
        super(message);
        this.errorCode = errorCode;
        this.httpStatus = httpStatus;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

}
