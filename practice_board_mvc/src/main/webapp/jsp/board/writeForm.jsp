<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
<title>MES 개발자과정 통합게시판</title>
</head>
<body>
<c:choose>
<c:when test = "${ currentUser.id != null }">	
	<div align="center">
	<h2>새글 등록</h2>
	<form action="${ pageContext.request.contextPath }/board/write.do" method="post" name="form">
		<table border="1" style="width:80%">
			<tr>
				<th width="25%">제목</th>
				<td>
					<input type="text" width="50" name="title" style="width:100%; border: 0;" required>
				</td>
			</tr>
			<tr>
				<th width="25%">작성자</th>
				<td>
					<input type="text" size="50" name="writer" style="width:100%; border: 0;" readonly
					 	value="${ currentUser.name }">
				</td>
			</tr>
			<tr>
				<th width="25%">내용</th>
				<td>
					<textarea rows="7" cols="50" name="content" style="resize:none; width:100%; border: 0;" required></textarea>
				</td>
			</tr>
		</table>
		<br>
		<input type="submit" value="등록">
	</form>
	</div>
</c:when>
<c:otherwise>
	<script>
		alert('로그인 후 글을 등록해 주세요.')
		location.href='${ pageContext.request.contextPath }' + '/login/loginForm.do'
	</script>
</c:otherwise>
</c:choose>
</body>
</html>