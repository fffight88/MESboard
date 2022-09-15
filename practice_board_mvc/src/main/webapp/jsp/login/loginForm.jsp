<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<script>
	function checkForm(){
		if(document.loginForm.id.value == ''){
			alert('아이디를 입력하세요.')
			document.loginForm.id.focus()
			return false
		}
		
		if(document.loginForm.password.value == ''){
			alert('패스워드를 입력하세요.')
			document.loginForm.password.focus()
			return false
		}
		return true
	}
</script>
</head>
<body>
<div align="center">
	<h2>로그인</h2>
	<hr>
	<br>
	<form action="${ pageContext.request.contextPath }/login/login.do" method="post" name="loginForm"
		  onsubmit="return checkForm()">
		<table border=1>
			<tr>
				<th>ID</th>
				<td><input type="text" width="50" name="id" style="width:100%; border: 0;" ></td>
			</tr>
			<tr>
				<th>PASSWORD</th>
				<td><input type="password" width="50" name="password" style="width:100%; border: 0;" ></td>
			</tr>
		</table>
		<br>
		<input type="submit" value="로그인">
		<input type="button" value="회원가입" onclick="location.href='${ pageContext.request.contextPath }/login/joinForm.do'">
		<input type="button" value="게시판 메인" onclick="location.href='${ pageContext.request.contextPath }/board/list.do'">
	</form>
</div>
</body>
</html>