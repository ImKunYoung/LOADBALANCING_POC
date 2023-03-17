package com.example.second.board.inner.service;


import com.example.second.board.inner.dto.board.*;

/**
 * The interface Create board service.
 *
 * @author ImKunYoung
 * @version 1.0
 * @since 13 -3-2023
 */
public interface CreateBoardService {


	/**
	 * 게시판 생성 요청 조회
	 * GHDV-16
	 *
	 * @param findCreateRequest :
	 * @return findCreateRequest :
	 */
	FindCreateResponse find(FindCreateRequest findCreateRequest);


	/**
	 * 게시판 생성 요청
	 * GHDV-15
	 *
	 * @param saveCreateRequest :
	 * @return saveCreateRequest :
	 */
	SaveCreateResponse save(SaveCreateRequest saveCreateRequest);


	/**
	 * 게시판 생성 요청 인가
	 * GHDV-17
	 *
	 * @param putCreateResquest :
	 * @return putCreateResquest :
	 */
	PutCreateResponse put(PutCreateRequest putCreateResquest);

}