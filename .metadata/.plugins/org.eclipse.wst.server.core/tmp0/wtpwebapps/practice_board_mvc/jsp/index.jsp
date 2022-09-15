<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MES 개발자과정 통합게시판</title>
</head>
<body>
	<div align="center">
		<h2>MES 개발자과정 통합게시판!</h2>
		<hr>
		<br>
		<a href='${ pageContext.request.contextPath }/board/list.do' onclick="window.open(this.href, 'list', 'width=700, height=500, toolbar=1, menubar=1'); return false;">통합게시판</a><br>
		<a href='${ pageContext.request.contextPath }/login/loginForm.do' onclick="window.open(this.href, 'writeForm', 'width=700, height=500, toolbar=1, menubar=1'); return false;">로그인</a><br>
		<a href='${ pageContext.request.contextPath }/login/joinForm.do' onclick="window.open(this.href, 'joinForm', 'width=700, height=500, toolbar=1, menubar=1'); return false;">회원가입</a><br>
	</div>
</body>
</html>