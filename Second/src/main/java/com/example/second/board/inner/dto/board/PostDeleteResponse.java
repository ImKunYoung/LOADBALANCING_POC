package com.example.second.board.inner.dto.board;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * packageName    : com.shareincor.sharein.subdomain.board.inner.dto.board
 * fileName       : PostDeleteResponse
 * author         : ImKunYoung
 * date           : 2023-03-01
 * description    : 게시판 삭제 요청
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-03-01        ImKunYoung       최초 생성
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostDeleteResponse {
    private String message;
}
