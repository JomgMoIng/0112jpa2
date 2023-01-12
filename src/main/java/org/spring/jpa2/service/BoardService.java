package org.spring.jpa2.service;

import org.spring.jpa2.dto.BoardDto;
import org.spring.jpa2.entity.BoardEntity;
import org.spring.jpa2.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    public void insertBoard(BoardEntity boardEntity){

        boardRepository.save(boardEntity);



    }


    public void insertBoard2(BoardDto boardDto){

        BoardEntity boardEntity = BoardDto.toBoardEntity(boardDto);

        boardRepository.save(boardEntity);

    }


    public List<BoardDto> list(){

        List<BoardDto> boardDtoList = new ArrayList<>();

        // DB > Entity
        List<BoardEntity> boardEntityList = boardRepository.findAll();  // 1 DB 데이터 get

        // Entity > Dto
        for(BoardEntity boardEntity: boardEntityList){

            boardDtoList.add(BoardEntity.toBoardDto(boardEntity)); // g하나의 레코드(Entity) >

        }
        return boardDtoList; // List Dto




    }







}
