package com.example.second.board.inner.dto.board;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * packageName    : com.shareincor.sharein.subdomain.board.inner.dto.board
 * fileName       : boardrequest
 * author         : ImKunYoung
 * date           : 2023-03-01
 * description    : 게시판 조회
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-03-01        ImKunYoung       최초 생성
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardRequest {

    private ApartmentV apartment;

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ApartmentV {
        private Long id;
    }

}
