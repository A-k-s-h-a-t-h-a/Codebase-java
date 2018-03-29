<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	Supplier Managemenet

	<form action="supplier/save/" method="post">
		<table>
			<tr>
				<td>ID</td>
				<td><input type="text" name='id' required></td>
			</tr>

			<tr>
				<td>Name</td>
				<td><input type="text" name='name' required></td>
			</tr>

			<tr>
				<td>Address</td>
				<td><input type="text" name='address' required></td>
			</tr>

			<tr>
				<input type="submit" value='Create Supplier'>
			</tr>

		</table>
	</form>
	
	${suppliersuccess}
	${suppliererror}
	
	<div>
		<table border="2" bgcolor="skyblue">
				<tr><h4>
					<td>Supplier ID</td>
					<td>Supplier Name</td>
					<td>Supplier Address</td>
					<td>Action</td></h4>
				</tr>
				<c:forEach var="supplier" items="${suppliers}">
					<tr>
						<td>${supplier.supplier_id} </td>
						<td>${supplier.name} </td>
						<td>${supplier.address} </td>
						<td><a href="supplier/delete/?id=${supplier.supplier_id}">Delete</a>
						<td><a href="supplier/edit/?id=${supplier.supplier_id}">Edit</a>
					</tr>
				</c:forEach>
		</table>
	</div>
	
</body>
</html>