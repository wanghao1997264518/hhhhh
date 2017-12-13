<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="regController" method="post">
		用户名:<input type="text" name="userName"/><br/>
		年龄: <input type="text" name="age"/><br/>
		密码: <input type="password" name="password"/><br/>
		<input type="submit" value="注册"/>
	</form>
	<hr>
	<!-- 转化日期类型格式化 -->
	<form action="regController2" method="post">
		用户名:<input type="text" name="userName"/><br/>
		年龄: <input type="text" name="age"/><br/>
		密码: <input type="password" name="password"/><br/>
		确认密码:<input type="password" name="repwd"/><br/>
		出生年月:<input type="text" name="date"/>
		<input type="submit" value="注册"/>
	</form>
	<hr>
	<!-- 关联数组 -->
	<form action="regController3" method="post">
		用户名:<input type="text" name="userName"/><br/>
		年龄: <input type="text" name="age"/><br/>
		密码: <input type="password" name="password"/><br/>
		爱好: <input type="checkbox" name="hobbys" value="sleep"/>睡觉&nbsp;&nbsp;
			<input type="checkbox" name="hobbys" value="game"/>游戏&nbsp;&nbsp;
			<input type="checkbox" name="hobbys" value="eat"/>吃<br/>
		<input type="submit" value="注册"/>
	</form>
	<hr>
	<!-- 关联单个对象 -->
	<form action="regController4" method="post">
		用户名:<input type="text" name="userName"/><br/>
		年龄: <input type="text" name="age"/><br/>
		密码: <input type="password" name="password"/><br/>
		爱好: <input type="checkbox" name="hobbys" value="sleep"/>睡觉&nbsp;&nbsp;
			<input type="checkbox" name="hobbys" value="game"/>游戏&nbsp;&nbsp;
			<input type="checkbox" name="hobbys" value="eat"/>吃<br/>
		联系电话:
		<input type="text" name="contact.mphone"/><br/>
		电子邮箱:<input type="text" name="contact.email"/><br/>
		<input type="submit" value="注册"/>
	</form>
	<hr/>
	<!-- 关联集合对象 -->
	<form action="regController5" method="post">
		用户名:<input type="text" name="userName"/><br/>
		年龄: <input type="text" name="age"/><br/>
		密码: <input type="password" name="password"/><br/>
		爱好: <input type="checkbox" name="hobbys" value="sleep"/>睡觉&nbsp;&nbsp;
			<input type="checkbox" name="hobbys" value="game"/>游戏&nbsp;&nbsp;
			<input type="checkbox" name="hobbys" value="eat"/>吃<br/>
		联系电话1: <input type="text" name="contacts[0].mphone"/><br/>
		电子邮箱1: <input type="text" name="contacts[0].email"/><br/>
		联系电话2: <input type="text" name="contacts[1].mphone"/><br/>
		电子邮箱2: <input type="text" name="contacts[1].email"/><br/>
		联系电话3: <input type="text" name="contacts[2].mphone"/><br/>
		电子邮箱4: <input type="text" name="contacts[2].email"/><br/>
		<input type="submit" value="注册"/>
	</form>
	
	<hr/>
	<!-- 数据验证 -->
	<form action="regValidateController" method="post">
		用户名:<input type="text" name="userName" value="${user.userName }"/>
		<font color="red" size="3">
			${errMsgs["nameError"] }
		</font>
		<br/>
		年龄: <input type="text" name="age" value="${user.age }"/><br/>
		密码: <input type="password" name="password"/>
		<font color="red" size="3">
			${errMsgs["pwdError"] }
		</font>
		<br/>
		<input type="submit" value="注册"/>
	</form>
</body>
</html>