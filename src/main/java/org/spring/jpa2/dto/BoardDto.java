package org.spring.jpa2.dto;

import lombok.*;
import org.spring.jpa2.entity.BoardEntity;

import javax.persistence.Column;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BoardDto {

    private Long id;

    private Long cnt=0L;

    private String title;

    private String Writer;

    private String content;

    private Date createDate;


    // DTO > Entity

    public static BoardEntity toBoardEntity(BoardDto boardDto){

        BoardEntity boardEntity = new BoardEntity();

        boardEntity.setId(boardDto.getId());
        boardEntity.setCnt(boardDto.getCnt());
        boardEntity.setTitle(boardDto.getTitle());
        boardEntity.setWriter(boardDto.getWriter());
        boardEntity.setContent(boardDto.getContent());
        boardEntity.setCreateDate(new Date());

        return boardEntity;
    }


}
