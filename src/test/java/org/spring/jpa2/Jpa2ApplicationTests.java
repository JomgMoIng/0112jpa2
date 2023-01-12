package org.spring.jpa2;

import org.junit.jupiter.api.Test;
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

		BoardEntity boardEntity = new BoardEntity();
		boardEntity.setCnt(3L);
		boardEntity.setWriter("m1");
		boardEntity.setTitle("제목11");
		boardEntity.setCreateDate(new Date());
		boardEntity.setContent("내용11");

		boardService.insertBoard(boardEntity);

	}

}
