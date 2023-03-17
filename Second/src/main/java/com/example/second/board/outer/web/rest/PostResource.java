package com.example.second.board.outer.web.rest;

import com.example.second.board.inner.dto.post.*;
import com.example.second.board.inner.service.PostService;
import com.example.second.board.outer.web.HeaderUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * The type Post resource.
 *
 * @author ur2ku
 * @version 1.0
 */
@RequiredArgsConstructor
@RequestMapping("/apartment/board/post/v1")
@RestController
public class PostResource {

    private final PostService postService;

    private static final String ENTITY_NAME = "Post";

    @Value("${clientApp.name}")
    private String applicationName;


    /**
     * 포스트 추가됨
     *
     * @param saveRequest : SaveRequest DTO
     * @return response entity
     * @author : IMKUNYOUNG
     */
    @PostMapping
    public ResponseEntity<SaveResponse> save(@RequestBody SaveRequest saveRequest) {
        /*TODO: - Check id*/
        SaveResponse saveResponse = postService.save(saveRequest);
        return ResponseEntity.ok(saveResponse);
    }


    /**
     * 포스트 조회됨
     *
     * @param boardId : 게시판 id
     * @param postId  : 포스트 id
     * @return response entity
     * @author : IMKUNYOUNG
     */
    @GetMapping("/{boardId}/{postId}")
    public ResponseEntity<FindResponse> find(@PathVariable("boardId") Long boardId, @PathVariable("postId") Long postId) {
        /*TODO: - Check id*/
        FindRequest findRequest = new FindRequest(boardId, postId);

        FindResponse findResponse = postService.find(findRequest);
        return ResponseEntity.ok(findResponse);
    }


    /**
     * 포스트 수정됨
     *
     * @param putRequest : PutRequest DTO
     * @return response entity
     * @author : IMKUNYOUNG
     */
    @PutMapping
    public ResponseEntity<PutResponse> put(@RequestBody PutRequest putRequest) {
        /*TODO: - Check id*/
        PutResponse putResponse = postService.put(putRequest);
        return ResponseEntity.ok(putResponse);
    }


    /**
     * 포스트 삭제됨
     *
     * @param deleteRequest : DeleteRequest DTO
     * @return response entity
     * @author : IMKUNYOUNG
     */
    @DeleteMapping
    public ResponseEntity<DeleteResponse> delete(@RequestBody DeleteRequest deleteRequest) {
        /*TODO: - Check id*/
        return ResponseEntity
                .ok()
                .headers(HeaderUtil.createEntityDeletionAlert(applicationName, false, ENTITY_NAME, deleteRequest.toString()))
                .body(postService.delete(deleteRequest));
    }


    /**
     * 포스트 목록 조회됨
     *
     * @param boardId : 게시판 id
     * @return response entity
     * @author : IMKUNYOUNG
     */
    @GetMapping("/{boardId}")
    public ResponseEntity<ListResponse> list(@PathVariable("boardId") Long boardId) {
        /*TODO: - Check id*/
        ListRequest listRequest = new ListRequest(boardId);
        ListResponse listResponse = postService.list(listRequest);
        return ResponseEntity.ok(listResponse);
    }


    /**
     * 포스트 검색됨
     *
     * @param boardId : 게시판 id
     * @param keyword : 검색어
     * @return response entity
     * @author : IMKUNYOUNG
     */
    @GetMapping("/search/{boardId}/{keyword}")
    public ResponseEntity<SearchResponse> search(@PathVariable("boardId") Long boardId, @PathVariable("keyword") String keyword) {
        /*TODO: - Check id*/
        SearchRequest searchRequest = SearchRequest.builder()
                .board(SearchRequest.Board.builder()
                        .id(boardId)
                        .build())
                .keyword(keyword)
                .build();
        return ResponseEntity.ok(postService.search(searchRequest));
    }


}