package kr.co.dstraders.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.dstraders.board.controller.Controller;

public class LoginFormController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		return "/jsp/login/loginForm.jsp";
	}
}
