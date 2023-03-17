package com.example.second.board.outer.web.rest;

import com.example.second.board.inner.dto.board.*;
import com.example.second.board.inner.service.CreateBoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * packageName    : com.shareincor.sharein.subdomain.board.outer.web.rest
 * fileName       : BoardResource
 * author         : ImKunYoung
 * date           : 2023-03-02
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-03-02        ImKunYoung       최초 생성
 */
@RequiredArgsConstructor
@RequestMapping("/apartment/board/v1/create")
@RestController
public class CreateBoardResource {

    private final CreateBoardService createBoardService;


    /**
     * 게시판 생성 요청 조회
     * GHDV-16
     *
     * @param findCreateRequest :
     * @return response entity
     */
    @GetMapping
    public ResponseEntity<FindCreateResponse> find(FindCreateRequest findCreateRequest) {
        return null;
    }

    /**
     * 게시판 생성 요청
     * GHDV-15
     *
     * @param saveCreateRequest :
     * @return response entity
     */
    @PostMapping
    public ResponseEntity<SaveCreateResponse> save(SaveCreateRequest saveCreateRequest) {
        return null;
    }

    /**
     * 게시판 생성 요청 인가
     * GHDV-17
     *
     * @param boardId :
     * @return response entity
     */
    @PutMapping("/{boardId}")
    public ResponseEntity<PutCreateResponse> put(@PathVariable("boardId") Long boardId) {
        return null;
    }

}
