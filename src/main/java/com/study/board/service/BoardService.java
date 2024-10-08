package com.study.board.service;

import com.study.board.entity.Board;
import com.study.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    // 글 작성 처리
    public void write(Board board) {

        boardRepository.save(board);
    }

    // 게시글 리스트 가져오기
    public List<Board> boardList() {

        return boardRepository.findAll();
    }

    // 특정 게시글 가져오기
    public Board boardView(Integer id) {

        return boardRepository.findById(id).get();
    }
}
