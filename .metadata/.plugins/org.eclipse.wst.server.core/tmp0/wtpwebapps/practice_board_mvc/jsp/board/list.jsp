<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MES 개발자과정 통합게시판</title>
</head>
<body>
<c:choose>
	<c:when test="${ currentUser.id != null }">
		<div align="right">
			<form action="${ pageContext.request.contextPath }/login/logout.do">
				${ currentUser.name }님, 환영합니다!
				<input type="submit" value="로그아웃">
			</form>
		</div>
	</c:when>
	<c:otherwise>
		<div align="right">
			<form action="${ pageContext.request.contextPath }/login/loginForm.do">
				로그인 해 주세요!
				<input type="submit" value="로그인">
			</form>
		</div>
	</c:otherwise>
</c:choose>

<div align="center">
<h2>자유게시판</h2>
	<hr>
		<table border=1 style="width:80%" class="table table-striped">
			<tr>
				<th width="7%">번호</th>
				<th>제목</th>
				<th width="15%">작성자</th>
				<th width="20%">등록일</th>
			</tr>
			
			<c:forEach items="${ list }" var="board">
			<tr>
				<td align="center">${ board.no }</td>
				<td style="padding-left:10px"><a href="${ pageContext.request.contextPath}/board/detail.do?no=${ board.no }">${ board.title }</a></td>
				<td align="center">${ board.writer }</td>
				<td align="center">${ board.regDate }</td>
			</tr>
			</c:forEach>
		</table>
	
	<br>
	<button onclick="window.open(href='${ pageContext.request.contextPath }/board/writeForm.do','writeForm', 'width=700, height=500, toolbar=1, menubar=1'); return false;">새글 등록</button>
	
</div>
</body>
</html>