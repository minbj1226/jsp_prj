<%@page import="kr.co.sist.user.member.WebMemberSerivce"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%
String id=request.getParameter("id"); //ajaxParamForm에서 입력한 id를 추출

WebMemberSerivce wms=WebMemberSerivce.getInstance();
boolean flag=wms.searchId(id); //사용 가능 true;

//입력된 아이디가 사용중인지 결과를 받아와서 JSONObject에 넣고 응답
JSONObject jsonObj=new JSONObject();
jsonObj.put("idResult", flag);
out.print(jsonObj.toJSONString());
%>