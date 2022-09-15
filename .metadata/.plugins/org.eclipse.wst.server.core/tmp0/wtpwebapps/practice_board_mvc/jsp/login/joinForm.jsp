<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function checkForm(){
		if(document.joinForm.id.value == ''){
			alert('사용할 아이디를 입력하세요.')
			document.joinForm.id.focus()
			return false
		}
		
		if(document.joinForm.password.value == ''){
			alert('사용할 패스워드를 입력하세요.')
			document.joinForm.password.focus()
			return false
		}
		
		if(document.joinForm.name.value == ''){
			alert('사용할 닉네임을 입력하세요.')
			document.joinForm.name.focus()
			return false
		}
		return true
	}
</script>
</head>
<body>
<div align="center">
	<h2>회원가입</h2>
	<hr>
	<br>
	<form action="${ pageContext.request.contextPath }/login/join.do" method="post" name="joinForm"
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
			<tr>
				<th>NAME</th>
				<td><input type="text" width="50" name="name" style="width:100%; border: 0;" ></td>
			</tr>
		</table>
		<br>
		<input type="submit" value="회원가입">
		<input type="button" value="취소" onclick="location.href='${ pageContext.request.contextPath }/jsp/index.jsp'">
	</form>
</div>
</body>
</html>