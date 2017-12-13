<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- http://localhost:8080/springmvc/helloContrller.action?action=hello -->
	<a href="helloContrller.action?action=hello">helloController</a><br>
	<a href="helloContrller.action?action=test">testController</a>
	<hr>
	<a href="testController">annotation</a><br/>
	<a href="testReturnStr">testReturn</a><br/>4
	<a href="testRedirect">testRedirect</a><br/>
	<a href="testPrefixAndSuffix">testPrefixAndSuffix</a><br/>
	<a href="testForward">testForward</a><br/>
	<a href="testModelAndView">testModelAndView</a><br/>
	<a href="register.jsp">对象参数</a><br/>
	<hr>
	<a href="restfulController/123/find">restful</a>
	<hr>
	<a href="usejsonController">JSON</a>
	<a href="usegsonController">GSON</a>
	<a href="usefastsonController">FASTSON</a>
	<hr>
	<a href="fileupload.jsp">fileUpload</a>
</body>
</html>