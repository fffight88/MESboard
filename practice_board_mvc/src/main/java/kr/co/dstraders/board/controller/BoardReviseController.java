package kr.co.dstraders.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.dstraders.board.dao.BoardDAO;
import kr.co.dstraders.board.vo.BoardVO;

public class BoardReviseController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	
		request.setCharacterEncoding("utf-8");
		
		BoardVO board = new BoardVO();
		board.setNo(Integer.parseInt(request.getParameter("no")));
		board.setTitle(request.getParameter("title"));
		board.setContent(request.getParameter("content"));
		
		BoardDAO dao = new BoardDAO();
		dao.reviseByNo(board);
				
		return "/jsp/board/revise.jsp";
	}
}