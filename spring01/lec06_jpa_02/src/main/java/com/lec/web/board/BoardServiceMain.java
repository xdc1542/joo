package com.lec.web.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
//		BoardService boardService = (BoardService) container.getBean("boardService");
		
//		BoardVO vo = new BoardVO();
//		vo.setTitle("mybatis와 스프링연동");
//		vo.setWriter("이누기");
//		vo.setContent("mybatis 내용입니다....");
//		boardService.insertBoard(vo);
//		
//		List<BoardVO> boardList = boardService.getBoardList(vo);
//		for(BoardVO board:boardList) {
//			System.out.println("---->"+ board.toString());
//		}
//
//		container.close();
	}

}