package com.example.second.board.inner.service.impl;
import com.example.second.board.inner.domain.Board;
import com.example.second.board.inner.domain.vo.Status;
import com.example.second.board.inner.dto.board.*;
import com.example.second.board.inner.service.DeleteBoardService;
import com.example.second.board.outer.persistence.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.second.board.inner.service.exception.*;

/**
 * packageName    : com.shareincor.sharein.subdomain.board.inner.service.impl
 * fileName       : DeleteBoardServiceImpl
 * author         : ImKunYoung
 * date           : 2023-03-02
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-03-02        ImKunYoung       최초 생성
 */
@RequiredArgsConstructor
@Service
public class DeleteBoardServiceImpl implements DeleteBoardService {

    private final BoardRepository boardRepository;


    @Override
    @Transactional
    public void save(PostDeleteRequest postDeleteRequest) {
        Board board = boardRepository.findById(postDeleteRequest.getBoard().getId())
                .orElseThrow(NotFoundBoardException::new);

        board.setDeletedStatus(Status.DELETED_WAITING);
    }

    @Override
    public FindDeleteResponse find(FindDeleteRequest findDeleteRequest) {
        return null;
    }

    @Override
    public PutDeleteResponse put(PutDeleteRequest putDeleteRequest) {
        return null;
    }
}
