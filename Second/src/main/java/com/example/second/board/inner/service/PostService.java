package com.example.second.board.inner.service;


import com.example.second.board.inner.dto.post.*;

/**
 * @author ur2ku
 * @version 1.0
 */
public interface PostService {


    /**
     * 포스트 추가됨
     *
     * @param saveRequest : 포스트 추가 요청 DTO
     * @return save response
     * @author : IMKUNYOUNG
     */
    SaveResponse save(SaveRequest saveRequest);


    /**
     * 포스트 조회됨
     *
     * @param findRequest : 포스트 조회 요청 DTO
     * @return find response
     * @author : IMKUNYOUNG
     */
    FindResponse find(FindRequest findRequest);


    /**
     * 포스트 수정됨
     *
     * @param putRequest : 포스트 수정 요청 DTO
     * @return put response
     * @author : IMKUNYOUNG
     */
    PutResponse put(PutRequest putRequest);


    /**
     * 포스트 삭제됨
     *
     * @param deleteRequest : 포스트 삭제 요청 DTO
     * @return delete response
     * @author : IMKUNYOUNG
     */
    DeleteResponse delete(DeleteRequest deleteRequest);


    /**
     * 포스트 목록 조회됨
     *
     * @param listRequest : 포스트 목록 조회 요청 DTO
     * @return list response
     * @author : IMKUNYOUNG
     */
    ListResponse list(ListRequest listRequest);


    /**
     * 포스트 검색됨
     *
     * @param searchRequest : 포스트 검색 요청 DTO
     * @return search response
     * @author : IMKUNYOUNG
     */
    SearchResponse search(SearchRequest searchRequest);

}