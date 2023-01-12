package org.spring.jpa2.service;

import org.spring.jpa2.dto.BoardDto;
import org.spring.jpa2.entity.BoardEntity;
import org.spring.jpa2.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    public void insertBoard(BoardEntity boardEntity){

        boardRepository.save(boardEntity);


    }



}
