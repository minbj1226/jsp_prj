<%@page import="java.io.OutputStream"%>
<%@page import="java.io.File"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="application/octet-stream"
	pageEncoding="UTF-8"%>
<%
//응답 헤더를 변경(download.jsp에서 사용자가 선택한 파일명이 응답되도록 변경)
String fileName=request.getParameter("fileName");
String downFileName=fileName;

if(downFileName!=null) {
	downFileName=URLEncoder.encode(downFileName, "UTF-8");
}
response.setHeader("Content-Disposition", "attachment;fileName="+fileName);

File file=new File("C:/dev/workspace/jsp_prj/src/main/webapp/upload/"+fileName);

FileInputStream fis=new FileInputStream(file.getAbsolutePath());

OutputStream os=response.getOutputStream();

byte[] readData=new byte[512];

int readSize=0;

while( (readSize=fis.read(readData)) !=-1) {
	os.write(readData, 0, readSize); //읽어들인 데이터를 출력 스트림에 기록
}//end while
//출력스트림을 초기화
out.clear();
//응답헤더를 HTML을 출력할 수 있게 초기화
out=pageContext.pushBody();
%>