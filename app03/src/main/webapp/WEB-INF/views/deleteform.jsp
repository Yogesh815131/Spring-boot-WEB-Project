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
	<h2 style="color:black; text-align:center;">Product Delete Form</h2>
	<br><br>
	<form method="post" action="delete">		
		<table style="margin-left: auto; margin-right: auto;">
			<tr>
				<td>Product Id</td>
				<td><input type="text" name="pid" value="${product.pid}"></td>
			</tr>
			<tr>
				<td><input type="submit" value="DELETE"></td>
			</tr>
		</table>		
	</form>
</body>
</html>