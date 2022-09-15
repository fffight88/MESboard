package kr.co.dstraders.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.dstraders.board.dao.BoardDAO;

public class BoardReviseFormController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		int boardNo = Integer.parseInt(request.getParameter("no"));
		
		BoardDAO dao = new BoardDAO();
		
		request.setAttribute("board", dao.selectByNo(boardNo));
		
		return "/jsp/board/reviseForm.jsp";
	}

}
