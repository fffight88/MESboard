package kr.co.dstraders.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.dstraders.board.controller.Controller;
import kr.co.dstraders.member.dao.MemberDAO;
import kr.co.dstraders.member.vo.MemberVO;

public class LoginController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("utf-8");
		
		MemberVO member = new MemberVO();
		member.setId(request.getParameter("id"));
		member.setPassword(request.getParameter("password"));
		
		MemberVO currentUser = null;
		MemberDAO dao = new MemberDAO();
		currentUser = dao.login(member);
		
		String msg = null;
		String url = null;
		
		if (currentUser.getId() != null) {
			msg = "로그인에 성공했습니다.";
			url = "/board/list.do";
		} else {
			msg = "아이디 또는 패스워드가 잘못되었습니다.";
			url = "/login/loginForm.do";
		}
		
		HttpSession session = request.getSession();
		session.setAttribute("currentUser", currentUser);
		
		request.setAttribute("msg", msg);
		request.setAttribute("url", url);
		
		return "/jsp/login/login.jsp";
	}

}
