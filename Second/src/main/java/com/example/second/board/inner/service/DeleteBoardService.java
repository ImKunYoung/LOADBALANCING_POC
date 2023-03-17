package com.example.second.board.inner.service;

import com.example.second.board.inner.dto.board.*;

/**
 * packageName    : com.shareincor.sharein.subdomain.board.inner.service
 * fileName       : DeleteBoardService
 * author         : ImKunYoung
 * date           : 2023-03-02
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-03-02        ImKunYoung       최초 생성
 */
public interface DeleteBoardService {

    void save(PostDeleteRequest postDeleteRequest);

    FindDeleteResponse find(FindDeleteRequest findDeleteRequest);

    PutDeleteResponse put(PutDeleteRequest putDeleteRequest);

}
