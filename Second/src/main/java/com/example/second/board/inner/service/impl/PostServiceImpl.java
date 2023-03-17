package com.example.second.board.inner.service.impl;


import com.example.second.board.inner.domain.Board;
import com.example.second.board.inner.domain.Post;
import com.example.second.board.inner.dto.post.*;
import com.example.second.board.inner.service.PostService;
import com.example.second.board.inner.service.exception.NotFoundBoardException;
import com.example.second.board.outer.persistence.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author ur2ku
 * @version 1.0
 */
@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

	private final BoardRepository boardRepository;
	private final ModelMapper modelMapper;


	/**
	 * 포스트 추가됨
	 *
	 * @param saveRequest : 포스트를 추가하기 위한 DTO
	 * @return saveResponse : 추가된 포스트 정보를 담은 DTO
	 * @author : IMKUNYOUNG
	 */
	@Transactional
	@Override
	public SaveResponse save(SaveRequest saveRequest) {
		Board board = boardRepository.findById(saveRequest.getBoard().getId())
				.orElseThrow(NotFoundBoardException::new);

		board.addPost(new Post(saveRequest));
		boardRepository.save(board);

		return modelMapper.map(board.getLastPost(), SaveResponse.class);
	}


	/**
	 * 포스트 조회됨
	 *
	 * @param findRequest : 포스트를 조회하기 위한 DTO
	 * @return findResponse : 조회된 포스트 정보를 담은 DTO
	 * @author : IMKUNYOUNG
	 */
	@Transactional
	@Override
	public FindResponse find(FindRequest findRequest) {
		Board board = boardRepository.findById(findRequest.getBoard().getId())
				.orElseThrow(NotFoundBoardException::new);

		return modelMapper.map(board.findPost(findRequest), FindResponse.class);
	}


	/**
	 * 포스트 수정됨
	 *
	 * @param putRequest : 포스트를 수정하기 위한 DTO
	 * @return putResponse : 수정된 포스트 정보를 담은 DTO
	 * @author : IMKUNYOUNG
	 */
	@Override
	public PutResponse put(PutRequest putRequest) {
		Board board = boardRepository.findById(putRequest.getBoard().getId())
				.orElseThrow(NotFoundBoardException::new);

		Post post = board.updatePost(putRequest);

		boardRepository.save(board);
		return modelMapper.map(post, PutResponse.class);
	}


	/**
	 * 포스트 삭제됨
	 *
	 * @param deleteRequest : 포스트를 삭제하기 위한 DTO
	 * @return deleteResponse : 삭제 성공 여부를 담은 DTO
	 * @author : IMKUNYOUNG
	 */
	@Override
	public DeleteResponse delete(DeleteRequest deleteRequest) {
		Board board = boardRepository.findById(deleteRequest.getBoard().getId())
				.orElseThrow(NotFoundBoardException::new);

		board.deletePost(deleteRequest);
		boardRepository.save(board);

		return new DeleteResponse("Delete Success");
	}


	/**
	 * 포스트 목록 조회됨
	 *
	 * @param listRequest : 포스트 목록을 조회하기 위한 DTO
	 * @return listResponse : 조회된 포스트 목록을 담은 DTO
	 * @author : IMKUNYOUNG
	 */
	@Override
	public ListResponse list(ListRequest listRequest) {
		Board board = boardRepository.findById(listRequest.getBoard().getId())
				.orElseThrow(NotFoundBoardException::new);

		List<Post> posts = board.getPostOrderById();

		ListResponse listResponse = new ListResponse();
		listResponse.setPosts(posts);

		return listResponse;
	}


	/**
	 * 포스트 검색됨
	 *
	 * @param searchRequest : 포스트를 검색하기 위한 DTO
	 * @return searchResponse : 검색된 포스트 목록을 담은 DTO
	 * @author : IMKUNYOUNG
	 */
	@Override
	public SearchResponse search(SearchRequest searchRequest) {
		Board board = boardRepository.findById(searchRequest.getBoard().getId())
				.orElseThrow(NotFoundBoardException::new);

		List<Post> posts = board.searchPosts(searchRequest.getKeyword());

		SearchResponse searchResponse = new SearchResponse();
		searchResponse.setPosts(posts);

		return searchResponse;
	}

}