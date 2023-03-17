package com.example.second.board.inner.service.exception;


/**
 * packageName    : com.shareincor.sharein.subdomain.board.inner.service.exception
 * fileName       : NotValidAuthorException
 * author         : ImKunYoung
 * date           : 2023-02-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-02-21        ImKunYoung       최초 생성
 */
public class NotAuthorityPutException extends ApplicationException {

    public NotAuthorityPutException() {
        super(PostExceptionList.NOT_AUTHORITY_PUT.getCODE(), PostExceptionList.NOT_AUTHORITY_PUT.getHttpStatus(), PostExceptionList.NOT_AUTHORITY_PUT.getMESSAGE());
    }
}
