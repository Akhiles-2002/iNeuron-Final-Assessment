<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome User</title>
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
	margin-left: 120px;
	padding-top: 50px;
	color: white;
	font-family: 'Lobster', cursive;
}

.innerdiv {
	background-color: #2a2e2d;
	height: 200px;
	width: 500px;
	float: left;
	opacity: 0.8;
	margin-top: 90px;
	margin-left: 500px;
	text-align: center;
	padding-top: 50px;
	border-radius: 50px;
}

a:hover {
	color: white;
	text-decoration: underline;
}
</style>
</head>
<body>
	<div style="background-color: purple; height: 90px; width: 100%;">
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
		style="background-image: url('b1.png'); width: 100%; height: 650px; background-size: cover; background-position: center;">
		<div class="innerdiv">
			<h1>Subscribe News Letter</h1>
			<form action="subscription" method="post">
				<input type="email" name="emailid" placeholder="e.g rohan@gmail.com"
					size="30" style="height: 30px;" /> <input type="submit"
					value="SUBSCRIBE"
					style="height: 35px; color: white; background-color: black;" />
			</form>
			<c:choose>
				<c:when test="${subscription eq 'success'}">
					<p style="color: green; font-size: 28px; font-weight: bold;">News
						letter Subscribed</p>
				</c:when>
			</c:choose>
		</div>
	</div>

</body>
</html>