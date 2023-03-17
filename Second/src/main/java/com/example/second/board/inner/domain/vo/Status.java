package com.example.second.board.inner.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Status {

    CREATED("게시판 생성됨"),
    CREATED_WAITING("게시판 생성 대기중"),
    CREATED_DENIED("게시판 생성 거부됨"),
    DELETED("게시판 삭제됨"),
    DELETED_WAITING("게시판 삭제 대기중"),
    DELETED_DENIED("게시판 삭제 거부됨");

    private final String responseMessage;


}
