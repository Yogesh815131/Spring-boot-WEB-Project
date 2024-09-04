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
	<h2 style="color:black; text-align:center;">Welcome To Product Inventory System</h2>
	<br><br>
	
	<form method="post" action="update">
		<table style="margin-right: auto; margin-left: auto;">
			<tr>
				<td>Product Id</td>
				<td><input type="text" name="pid" value="${product.pid}" readonly="readonly"></td>
			</tr>
			<tr>
				<td>Product Name</td>
				<td><input type="text" name="pname" value="${product.pname}"></td>
			</tr>
			<tr>
				<td>Product Cost</td>
				<td><input type="text" name="pcost" value="${product.pcost}"></td>
			</tr>
			<tr>
				<td><input type="submit" value="UPDATE"></td>
			</tr>
		</table>
	</form>
	<h3 style="text-align: center;">
		<a href="./>| Welcome Page |</a>
	</h3>
</body>
</html>