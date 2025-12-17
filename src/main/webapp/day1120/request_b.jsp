<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#get{color:#0000FF}
#post{color:#FF0000}
</style>
</head>
<body>

<br>
<a href="javascript:history.back()">뒤로</a>
<%
String requestColor="get";
if("POST".equals(request.getMethod())){
		requestColor="post";
}
%>
<br>!
<strong><span id="<%= requestColor %>"><%= request.getMethod() %></span></strong>방식의 요청
</body>
</html>