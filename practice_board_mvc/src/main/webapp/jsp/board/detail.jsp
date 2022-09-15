<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MES 개발자과정 통합게시판</title>

</head>
<body>
<div align="center">
	<h2>상세페이지</h2>
		<table border="1" style="width:80%">
			<tr>
				<th width="25%">번호</th>
				<td>${ board.no }</td>
			</tr>
			<tr>
				<th width="25%">제목</th>
				<td>${ board.title }</td>
			</tr>
			<tr>
				<th width="25%">작성자</th>
				<td>${ board.writer }</td>
			</tr>
			<tr>
				<th width="25%">내용</th>
				<td>${ board.content }</td>
			</tr>
			<tr>
				<th width="25%">조회수</th>
				<td>${ board.viewCount }</td>
			</tr>
			<tr>
				<th width="25%">등록일</th>
				<td>${ board.regDate }</td>
			</tr>
		</table>
		<br>
		<button onclick="location.href='${pageContext.request.contextPath}/board/list.do'">목록</button>
		<c:if test="${ currentUser.name == board.writer }">
			<button onclick="location.href='${pageContext.request.contextPath}/board/reviseForm.do?no=${board.no}'">수정</button>
		</c:if>
		<c:if test="${ currentUser.name == board.writer || currentUser.type == 'A' }">
			<button onclick="location.href='${pageContext.request.contextPath}/board/delete.do?no=${board.no}'">삭제</button>
		</c:if>
</div>
</body>
</html>