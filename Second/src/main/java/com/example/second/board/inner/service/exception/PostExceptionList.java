package com.example.second.board.inner.service.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

/**
 * packageName    : com.shareincor.sharein.subdomain.board.inner.service.exception
 * fileName       : ExceptionList
 * author         : ImKunYoung
 * date           : 2023-02-14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-02-14        ImKunYoung       최초 생성
 */
@Getter
@RequiredArgsConstructor
public enum PostExceptionList {

    NOT_FOUND_BOARD("D0000", HttpStatus.NOT_FOUND, "게시판을 찾을 수 없습니다."),
    NOT_FOUND_POST("D0001", HttpStatus.NOT_FOUND, "게시글을 찾을 수 없습니다."),
    NOT_AUTHORITY_PUT("D0002", HttpStatus.FORBIDDEN, "게시글을 수정할 권한이 없습니다.");

    public final String CODE;
    public final HttpStatus httpStatus;
    public final String MESSAGE;

}
