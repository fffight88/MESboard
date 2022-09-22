<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>댓글쓰기</title>
<script>
	function checkForm(){
		if(document.commentForm.content.value == ''){
			alert('내용을 입력하세요.')
			document.commentForm.content.focus()
			return false
		}		
		return true
	}
</script>
</head>
<body>
<div align="center">
	<h2>댓글쓰기</h2>
	<hr>
	<br>
	<form action="${ pageContext.request.contextPath }/board/comment.do" method="post" name="commentForm"
		  onsubmit="return checkForm()">
		<table border=1>
			<tr>
				<th width="25%">댓글러</th>
				<td>
					<input type="text" size="50" name="commenter" style="width:99%; border: 0;" readonly
					 	value="${ currentUser.name }">
				</td>
			</tr>
			<tr>
				<th width="25%">내용</th>
				<td>
					<textarea rows="7" cols="50" name="comm" style="resize:none; width:99%; border: 0;" required></textarea>
				</td>
			</tr>
		</table>
		<br>
		<input type="submit" value="댓글등록">
		<input type="button" value="취소" onclick="history.go(-1)">
	</form>
</div>
</body>
</html>