package com.example.second.board.inner.dto.board;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

/**
 * packageName    : com.shareincor.sharein.subdomain.board.inner.dto.board
 * fileName       : FindCreateResponse
 * author         : ImKunYoung
 * date           : 2023-03-01
 * description    : 게시판 생성 요청 조회
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-03-01        ImKunYoung       최초 생성
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FindCreateResponse {

    private List<Board> boards;

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Board {
        private Long id;
        private String title;
        private ApartmentV apartmentV;
        private LocalDateTime createdDate;
        private LocalDateTime modifiedDate;

        @Data
        @Builder
        @AllArgsConstructor
        @NoArgsConstructor
        public static class ApartmentV {
            private Long id;
            private String name;
        }

    }
}
