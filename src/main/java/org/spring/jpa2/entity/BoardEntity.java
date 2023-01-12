package org.spring.jpa2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.spring.jpa2.dto.BoardDto;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="board_tb")
public class BoardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
    @Column(name = "board_Id")     // 칼럼명
    private Long id;

    @Column(nullable = false)
    private Long cnt=0L;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String Writer;

    @Column(nullable = false)
    private String content;

    private Date createDate;

//
//    @CreatedDate    // 생성 시간 자동 설정
//    private LocalDateTime createDate2;
//    @LastModifiedDate // 수정 시간 자동 설정
//    private LocalDateTime createDate3;

    // Entity > Dto 변환

    public static BoardDto toBoardDto(BoardEntity boardentity){

        BoardDto boardDto = new BoardDto();

        boardDto.setId(boardentity.getId());
        boardDto.setCnt(boardentity.getCnt());
        boardDto.setTitle(boardentity.getTitle());
        boardDto.setWriter(boardentity.getWriter());
        boardDto.setContent(boardentity.getContent());
        boardDto.setCreateDate(boardentity.getCreateDate());

        return boardDto;
    }


    
}
