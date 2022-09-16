package kr.co.dstraders;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.dstraders.board.controller.BoardCommentController;
import kr.co.dstraders.board.controller.BoardCommentFormController;
import kr.co.dstraders.board.controller.BoardDeleteController;
import kr.co.dstraders.board.controller.BoardDetailController;
import kr.co.dstraders.board.controller.BoardListController;
import kr.co.dstraders.board.controller.BoardReviseController;
import kr.co.dstraders.board.controller.BoardReviseFormController;
import kr.co.dstraders.board.controller.BoardWriteController;
import kr.co.dstraders.board.controller.BoardWriteFormController;
import kr.co.dstraders.board.controller.Controller;
import kr.co.dstraders.member.controller.JoinController;
import kr.co.dstraders.member.controller.JoinFormController;
import kr.co.dstraders.member.controller.LoginController;
import kr.co.dstraders.member.controller.LoginFormController;
import kr.co.dstraders.member.controller.LogoutController;

@WebServlet("*.do")
public class DispatcherServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String context = request.getContextPath();
		String uri = request.getRequestURI();
		uri = uri.substring(context.length());
		
		String callPage = null;
		Controller control = null;
		
		try {
			switch (uri) {
			case "/board/list.do":
				control = new BoardListController();
				break;
			case "/board/writeForm.do":
				control = new BoardWriteFormController();
				break;
			case "/board/write.do":
				control = new BoardWriteController();
				break;
			case "/board/detail.do":
				control = new BoardDetailController();
				break;
			case "/board/delete.do":
				control = new BoardDeleteController();
				break;
			case "/board/reviseForm.do":
				control = new BoardReviseFormController();
				break;
			case "/board/revise.do":
				control = new BoardReviseController();
				break;
			case "/login/loginForm.do":
				control = new LoginFormController();
				break;
			case "/login/login.do":
				control = new LoginController();
				break;
			case "/login/logout.do":
				control = new LogoutController();
				break;
			case "/login/joinForm.do":
				control = new JoinFormController();
				break;
			case "/login/join.do":
				control = new JoinController();
				break;
			case "/board/commentForm.do":
				control = new BoardCommentFormController();
				break;
			case "/board/comment.do":
				control = new BoardCommentController();
				break;
			}
			
			if (control != null) {
				callPage = control.handleRequest(request,response);
				if (callPage.startsWith("redirect:")) {
					callPage = callPage.substring("redirect:".length());
					response.sendRedirect(context + "/login/loginForm.do");
//					System.out.println(context + callPage);
				} else {
					RequestDispatcher dispatcher = request.getRequestDispatcher(callPage);
					dispatcher.forward(request, response);
				}	
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
}
