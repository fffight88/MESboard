package kr.co.dstraders.member.controller;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import kr.co.dstraders.board.controller.Controller;
import kr.co.dstraders.member.dao.MemberDAO;
import kr.co.dstraders.member.vo.MemberVO;

public class JoinController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("utf-8");
		
		MemberVO member = new MemberVO();
		member.setId(request.getParameter("id"));
		member.setPassword(request.getParameter("password"));
		member.setName(request.getParameter("name"));
		
		MemberDAO dao = new MemberDAO();
		Boolean joinFlag = dao.join(member);
		
		String msg = null;
		String url = null;
		
		if (joinFlag) {
			msg = "회원가입에 성공했습니다.";
			url = "/login/loginForm.do";
		} else {
			msg = "이미 존재하는 계정입니다.";
			url = "/login/joinForm.do";
		}
		
		request.setAttribute("msg", msg);
		request.setAttribute("url", url);
		
		return "/jsp/login/join.jsp";
	}
}
