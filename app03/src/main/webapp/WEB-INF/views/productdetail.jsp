<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h1 style="color:red; text-align:center;">SFSPL</h1>
	<h2 style="color:black; text-align:center;">Product Details</h2>
	<br><br>
	
	<table style="margin-left: auto; margin-right: auto; background-color: gray;" border="1">
		<tr>
			<td>Product Id</td>
			<td>${product.pid}</td>
		</tr>
		<tr>
			<td>Product Name</td>
			<td>${product.pname}</td>
		</tr>
		<tr>
			<td>Product Cost</td>
			<td>${product.pcost}</td>
		</tr>
	</table>	
	<br><br>
	
	<h3 style="text-align: center;">
		<a href="./">| Welcome Page |</a>
	</h3>
	
</body>
</html>