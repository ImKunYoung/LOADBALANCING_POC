package com.example.second.board.inner.service.exception;


/**
 * packageName    : com.shareincor.sharein.subdomain.board.inner.service.exception
 * fileName       : NOTSUCHBOARDException
 * author         : ImKunYoung
 * date           : 2023-02-14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-02-14        ImKunYoung       최초 생성
 */
public class NotFoundBoardException extends ApplicationException {

    public NotFoundBoardException() {
        super(PostExceptionList.NOT_FOUND_BOARD.getCODE(), PostExceptionList.NOT_FOUND_BOARD.getHttpStatus(), PostExceptionList.NOT_FOUND_BOARD.getMESSAGE());
    }

}
