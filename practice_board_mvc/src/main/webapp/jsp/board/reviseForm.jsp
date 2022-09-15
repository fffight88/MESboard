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
	<h2>글 수정하기</h2>
	<form action="${ pageContext.request.contextPath }/board/revise.do?no=${ board.no }" method="post">
		<table border="1" style="width:80%">
			<tr>
				<th width="25%">제목</th>
				<td>
					<input type="text" width="50" name="title" style="width:100%; border: 0;" 
					 value=${ board.title }>
				</td>
			</tr>
			<tr>
				<th width="25%">작성자</th>
				<td>
					<input type="text" size="50" name="writer" style="width:100%; border: 0;" readonly
					 value=${ board.writer }>
				</td>
			</tr>
			<tr>
				<th width="25%">내용</th>
				<td>
					<textarea rows="7" cols="50" name="content" style="resize:none; width:100%; border: 0;">${ board.content }</textarea>  
				</td>
			</tr>
		</table>
		<br>
		<input type="submit" value="수정하기">
	</form>
	</div>
</body>
</html>