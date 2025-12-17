<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//POST방식일때의 한글 처리 (Get 방식에서는 영향을 주지 않는다.)
request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
<strong><%= request.getMethod() %></strong> 방식 요청.<br>
<%
//web parameter의 이름이 같다면 배열처리
String[] lang=request.getParameterValues("language");
//Form Control이 하나 일지라도 getParameterValues로 받을 수 있다
String[] license=request.getParameterValues("license");
%>

<strong>선택 언어</strong>
<%
//try{
if(lang != null) {
	for(int i=0; i<lang.length; i++){
%>
	<%= lang[i] %>
	<% 
	}//end for
}else{
//catch(NullPointerException ne) {
%>관심언어가 없을 때<%
}//end else
%>
<br>
<strong>자격증</strong>
<%
for(int i=0; i<license.length; i++) {
%>		
	<%= license[i] %>
	<% if(license[0].trim().isEmpty()&&license.length==1) {
	%> 자격증이 없습니다 <% 
		}//end if
	}//end for
%>
</div>
</body>
</html>