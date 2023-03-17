package com.example.second.board.inner.service.exception;


/**
 * packageName    : com.shareincor.sharein.subdomain.board.inner.service.exception
 * fileName       : NotPostException
 * author         : ImKunYoung
 * date           : 2023-02-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-02-17        ImKunYoung       최초 생성
 */
public class NotPostException extends ApplicationException {

    public NotPostException() {
        super(PostExceptionList.NOT_FOUND_POST.getCODE(), PostExceptionList.NOT_FOUND_POST.getHttpStatus(), PostExceptionList.NOT_FOUND_POST.getMESSAGE());
    }

}
