<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
body {
	background-color: lightblue;
}

table {
	text-align: center;
	border-collapse: collapse;
	margin: 0 auto;
	width: 70%;
}

/* Set alternating background colors for the rows */
tr:nth-child(even) {
	background-color: #f2f2f2;
}

/* Style the table headers */
th {
	background-color: #4CAF50;
	color: white;
	font-weight: bold;
	padding: 10px 8px;
	text-align: left;
	height: 20px;
}

h1 {
	text-align : center;
	color : blue;
}
</style>
<title>Search Page Result</title>
</head>
<body>
	<div class="first">
		<c:choose>
			<c:when test="${student ne null}">
				<h1>Student Details</h1>
				<table
					style="border: 1px solid black; cellpadding: 10px; text-align: center;">
					<tr>
						<th>Student ID</th>
						<td>${student.sid}</td>
					</tr>
					<tr>
						<th>Student Name</th>
						<td>${student.sname}</td>
					</tr>
					<tr>
						<th>Student Age</th>
						<td>${student.sage}</td>
					</tr>
					<tr>
						<th>Student Address</th>
						<td>${student.saddress}</td>
					</tr>
				</table>
				<br />
			</c:when>
			<c:otherwise>
				<h1 style="color: red; text-align: center">Record Not Found for
					Entered Id</h1>
			</c:otherwise>
		</c:choose>
	</div>
</body>
</html>