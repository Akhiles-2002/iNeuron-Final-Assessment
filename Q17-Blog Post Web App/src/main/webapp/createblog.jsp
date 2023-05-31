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
}

label {
	font-size: 50px;
	font-weight: bold;
	margin-left: 100px;
	padding-top: 50px;
	color: white;
	font-family: 'Lobster', cursive;
}

.innerdiv {
	background-color: #2a2e2d;
	height: 550px;
	width: 700px;
	float: left;
	opacity: 0.8;
	margin-top: 20px;
	margin-left: 450px;
	text-align: center;
	border-bottom-left-radius: 50px;
	border-bottom-right-radius: 50px;
}

form {
	display: inline-block;
	margin-top: 10px;
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


	<div
		style="background-image: url('blog.png'); width: 100%; height: 650px; background-size: cover; background-position: center;">
		<div class="innerdiv">
			<h1
				style="background-color: black; color: white; margin: 0px; padding: 0px;">Create
				Blog</h1>
			<form action="createblog" method="post">
				<table cellpadding="5px">
					<tr>
						<th style="text-align: left; font-size: 20px; color: white;">Title</th>
					</tr>
					<tr>
						<td><input type="text" name="title" placeholder="e.g title"
							size="85" style="height: 30px;" /></td>
					</tr>
					<tr>
						<th style="text-align: left; font-size: 20px; color: white;">Description</th>
					</tr>
					<tr>
						<td><textarea rows="4" cols="80" name="description"
								placeholder="e.g description" size="30"></textarea></td>
					</tr>
					<tr>
						<th style="text-align: left; font-size: 20px; color: white;">Content</th>
					</tr>
					<tr>
						<td><textarea rows="9" cols="80" name="content"
								placeholder="e.g content" size="30"></textarea></td>
					</tr>
					<tr>
						<td><input type="submit" value="POST"
							style="width: 150px; height: 35px; color: white; background-color: black;" />
						<td>
					</tr>
				</table>
			</form>
			<c:choose>
				<c:when test="${result eq 'success'}">
					<p style="color: green; font-size: 28px; font-weight: bold;">**Blog
						Post Successful</p>
				</c:when>
			</c:choose>
		</div>
	</div>

</body>
</html>