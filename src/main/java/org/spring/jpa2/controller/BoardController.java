package org.spring.jpa2.controller;

import lombok.RequiredArgsConstructor;
import org.spring.jpa2.dto.BoardDto;
import org.spring.jpa2.dto.MemberDto;
import org.spring.jpa2.service.BoardService;
import org.spring.jpa2.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class BoardController {

/*    @Autowired
    private BoardService boardService;*/


/*    private BoardController(BoardService boardService){
        this.boardService=boardService;
    }*/

    // @RequiredArgsConstructor
    private final BoardService boardService;

    @GetMapping("/write")
    public String write(){
        return "write";
    }

    @PostMapping("/write")
    public String write2(@ModelAttribute BoardDto boardDto){

    boardService.insertBoard2(boardDto);

        return "redirect:boardList";  //글쓰기 성공하면 boardList 매핑 실행
    }

    @GetMapping("/boardList")
    public String boardList(Model model){
        // 전체 글 목록을 가져와서 boardList.html로 보낸다

        List<BoardDto> boardList = boardService.list();

        model.addAttribute("boardList", boardList);

        for(BoardDto boardDto : boardList){
            System.out.println("제목 : "+boardDto.getTitle());
            System.out.println("작성자 : "+boardDto.getWriter());
        }


        return "boardList"; // boardList.html (thymeleaf)
    }


}
