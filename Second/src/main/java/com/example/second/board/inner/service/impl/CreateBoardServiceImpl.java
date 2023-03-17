package com.example.second.board.inner.service.impl;


import com.example.second.board.inner.dto.board.*;
import com.example.second.board.inner.service.CreateBoardService;
import com.example.second.board.outer.persistence.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author ImKunYoung
 * @version 1.0
 * @since 13-3-2023
 */
@RequiredArgsConstructor
@Service
public class CreateBoardServiceImpl implements CreateBoardService {

	private final BoardRepository boardRepository;


	/**
	 * 게시판 생성 요청 조회
	 * GHDV-16
	 *
	 * @param findCreateRequest :
	 * @return FindCreateResponse :
	 */
	@Override
	public FindCreateResponse find(FindCreateRequest findCreateRequest) {
		return null;
	}


	/**
	 * 게시판 생성 요청
	 * GHDV-15
	 *
	 * @param saveCreateRequest :
	 * @return SaveCreateResponse :
	 */
	@Override
	public SaveCreateResponse save(SaveCreateRequest saveCreateRequest) {
		return null;
	}


	/**
	 * 게시판 생성 요청 인가
	 * GHDV-17
	 *
	 * @param putCreateResquest :
	 * @return PutCreateResponse :
	 */
	@Override
	public PutCreateResponse put(PutCreateRequest putCreateResquest) {
		return null;
	}
}