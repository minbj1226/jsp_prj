<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
//업무 처리할 결과 > List(web parameter로 전달될 수 없다)
List<String> names=new ArrayList<String>();
names.add("루피");
names.add("쵸파");
names.add("샹디");
names.add("조로");

request.setAttribute("names", names); //scope객체에 데이터를 할당 > scope객체 사용해서 값 받기

String name="홍길동";
int age=20;
%>
<!-- parameter가 없는 경우 -->    
<%-- <jsp:forward page="forward_action_b.jsp"/> --%>

<!-- parameter가 있는 경우 -->
<jsp:forward page="forward_action_b.jsp">
<jsp:param value="<%= name %>" name="name"/>
<jsp:param value="<%= age %>" name="age"/>
</jsp:forward>