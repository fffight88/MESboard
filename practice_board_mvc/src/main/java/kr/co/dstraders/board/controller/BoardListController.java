package kr.co.dstraders.board.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.dstraders.board.dao.BoardDAO;
import kr.co.dstraders.board.vo.BoardVO;

public class BoardListController implements Controller{

	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		BoardDAO dao = new BoardDAO();
		List<BoardVO> list = dao.selectAll();
		
		request.setAttribute("list", list);

		return "/jsp/board/list.jsp";
		
	}
	
}
