package kr.co.dstraders.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.dstraders.board.dao.BoardDAO;
import kr.co.dstraders.comment.vo.CommentVO;

public class BoardCommentController implements Controller{
	
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		
		CommentVO comment = new CommentVO();
		comment.setBoardNo(Integer.parseInt(request.getParameter("no")));
		comment.setBoardWriter(request.getParameter("writer"));
		comment.setCommenter(request.getParameter("${currentUser.name }"));
		comment.setComm(request.getParameter("comm"));
		
		BoardDAO dao = new BoardDAO();
		
		System.out.println(comment);
		
		dao.insertComment(comment);
		
		return "/jsp/board/comment.jsp";
				
	}

}
