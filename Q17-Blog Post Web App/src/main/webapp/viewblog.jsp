<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Lobster&display=swap"
	rel="stylesheet">

<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Lobster&family=Pangolin&display=swap"
	rel="stylesheet">
<style>
.trfont {
	font-size: 20px;
}

a {
	text-decoration: none;
	font-weight: bold;
	color: white;
}

body {
	margin: 0px;
	padding: 0px;
	background-image: url("b1.png");
	background-size: cover;
	background-position: center;
	background-repeat: no-repeat;
}

label {
	font-size: 50px;
	font-weight: bold;
	margin-left: 100px;
	padding-top: 50px;
	color: white;
	font-family: 'Lobster', cursive;
}

.divoneinner {
	height: 250px;
	width: 80%;
	background-color: lightblue;
	border-radius: 50px;
	margin-top: 10px;
	margin-left: 150px;
}

a:hover {
	color: white;
	text-decoration: underline;
}
</style>
</head>
<body>
	<div style="background-color: blue; height: 90px; width: 100%;">
		<label>BlogPost.Com</label>
		<table align="right" cellpadding="30px">
			<tr class="trfont">
				<td><a href="landing.jsp">Home</a></td>
				<td><a href="./viewblog">View Blogs</a></td>
				<td><a href="createblog.jsp">Write Blog</a></td>
				<td><a href="#">About</a></td>
			</tr>
		</table>
	</div>

	<c:forEach items="${allBlogs}" var="items">
		<div class="divoneinner">
			<div style="padding-left: 20px; padding-top: 10px;">
				<h1 style="font-family: 'Pangolin', cursive; color: white;">${items.blogTitle }</h1>
				<h3 style="font-family: 'Pangolin', cursive;">${items.blogDesc }</h3>
				<p style="font-family: 'Pangolin', cursive; font-weight: bold;">${items.blogContent }</p>
			</div>
		</div>
	</c:forEach>

</body>
</html>