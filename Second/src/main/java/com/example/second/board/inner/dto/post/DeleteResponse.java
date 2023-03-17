package com.example.second.board.inner.dto.post;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * packageName    : com.shareincor.sharein.subdomain.board.inner.dto.post
 * fileName       : DeleteResponse
 * author         : ImKunYoung
 * date           : 2023-02-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-02-21        ImKunYoung       최초 생성
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeleteResponse {
    private String message;
}
