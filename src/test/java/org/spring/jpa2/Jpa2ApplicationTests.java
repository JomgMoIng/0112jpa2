package org.spring.jpa2;

import org.junit.jupiter.api.Test;
import org.spring.jpa2.dto.BoardDto;
import org.spring.jpa2.entity.BoardEntity;
import org.spring.jpa2.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class Jpa2ApplicationTests {

	@Autowired
	private BoardService boardService;

	@Test
	void contextLoads() {
/*

		BoardEntity boardEntity = new BoardEntity();
		boardEntity.setCnt(4L);
		boardEntity.setWriter("m3");
		boardEntity.setTitle("제목21");
		boardEntity.setCreateDate(new Date());
		boardEntity.setContent("내용21");

		boardService.insertBoard(boardEntity);
*/


		BoardDto boardDto = new BoardDto();

		boardDto.setCnt(3L);
		boardDto.setTitle("제목4");
		boardDto.setContent("내용33");
		boardDto.setWriter("작성자5");
		boardDto.setCreateDate(new Date());

		boardService.insertBoard2(boardDto);

	}

}
