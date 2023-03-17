package com.example.second.board.inner.dto.board;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * packageName    : com.shareincor.sharein.subdomain.board.inner.dto.board
 * fileName       : CreateDeleteRequest
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
public class PostDeleteRequest {

    private Board board;


    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Board {
        @NotNull(message = "Board Id cannot be null")
        @Size(min = 1, message = "Board Id cannot be empty")
        private Long id;
    }
}
