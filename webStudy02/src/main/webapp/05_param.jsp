<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="param.js"></script>
</head>
<body>
	<form action="ParamServlet" method="get" name="frm">
		<label for=id>아이디 :</label>
		<input type="text" name=id id=id><br>
		나 &nbsp;&nbsp;이 : <input type="text" name=age ><br>
		비밀번호 : <input type="password" name=pwd ><br>
		내용 : <textarea rows="3" cols="20"></textarea>
		<input type="submit" value="get 전송" onclick="return check()">
	</form>
	<form action="ParamServlet" method="post" name="frm">
		아이디 : <input type="text" name=id><br>
		나 &nbsp;&nbsp;이 : <input type="text" name=age ><br>
		<input type="submit" value="post 전송" onclick="return check()">
	</form>
</body>
</html>