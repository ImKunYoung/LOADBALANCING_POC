package com.example.second.board.outer.web.rest;

import com.example.second.board.inner.dto.board.*;
import com.example.second.board.inner.service.DeleteBoardService;
import com.example.second.board.outer.web.HeaderUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * packageName    : com.shareincor.sharein.subdomain.board.outer.web.rest
 * fileName       : DeleteBoard
 * author         : ImKunYoung
 * date           : 2023-03-02
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-03-02        ImKunYoung       최초 생성
 */
@RequiredArgsConstructor
@RequestMapping("/apartment/board/v1/delete")
@RestController
public class DeleteBoardResource {

    private final DeleteBoardService deleteBoardService;

    private static final String ENTITY_NAME = "Board";

    @Value("${clientApp.name}")
    private String applicationName;

    /**
     * 게시판 삭제 요청됨
     *
     * @param postDeleteRequest : 게시판 삭제 요청 DTO
     * @return response entity
     * @author : IMKUNYOUNG
     */
    @PostMapping
    public ResponseEntity<PostDeleteResponse> save(@RequestBody PostDeleteRequest postDeleteRequest) {
        deleteBoardService.save(postDeleteRequest);

        return ResponseEntity
                .ok()
                .headers(HeaderUtil.createEntityDeletionAlert(applicationName, false, ENTITY_NAME, postDeleteRequest.toString()))
                .body(PostDeleteResponse.builder().message("게시판 삭제 요청이 완료되었습니다.").build());
    }


    /**
     * 게시판 삭제 요청 조회됨
     *
     * @param findDeleteRequest : 게시판 삭제 요청 조회 DTO
     * @return response entity
     * @author : IMKUNYOUNG
     */
    @GetMapping
    public ResponseEntity<FindDeleteResponse> find(@RequestBody FindDeleteRequest findDeleteRequest) {
        return null;
    }


    /**
     * 게시판 삭제 요청 인가됨
     *
     * @param putDeleteRequest : 게시판 삭제 요청 인가 DTO
     * @return response entity
     * @author : IMKUNYOUNG
     */
    @PutMapping
    public ResponseEntity<PutDeleteResponse> put(@RequestBody PutDeleteRequest putDeleteRequest) {
        return null;
    }


}
