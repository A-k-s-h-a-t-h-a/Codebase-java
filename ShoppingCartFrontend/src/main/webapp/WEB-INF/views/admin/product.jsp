<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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

	Product Managemenet

	<form action="/product/save/" method="post" enctype="multipart/form-data">
		<table>
			<tr>
				<td>ID</td>
				<td><input type="text" name='code' value="${product.code}" required></td>
			</tr>

			<tr>
				<td>Name</td>
				<td><input type="text" name='name' value="${product.name}" required></td>
			</tr>

			<tr>
				<td>Price</td>
				<td><input type="text" name='price' value="${product.price}" required></td>
			</tr>
			
			<tr>
				<td>Stock</td>
				<td><input type="text" name='stock' value="${product.stock}" required></td>
			</tr>

			<tr>
				<td>Select Category</td>
				<td>
					<select name="categoryid">
						<c:forEach var="category" items="${categories}">
							<option value="${category.category_id }"> ${category.name} </option>
						</c:forEach>
					</select>
				</td>
			</tr>
			
			<tr>
				<td>Select Supplier</td>
				<td>
					<select name="supplierid">
						<c:forEach var="supplier" items="${suppliers}">
							<option value="${supplier.supplier_id }"> ${supplier.name} </option>
						</c:forEach>
					</select>
				</td>
			</tr>

			<tr>
				<td>
					<input type="file" name="file">
				</td>
			</tr>
			
			<tr>
				<input type="submit" value='Create Product'>
			</tr>

		</table>
	</form>
	
	${productsuccess}
	${producterror}
	${uploadmsg}
	
	<div>
		<table border="2" bgcolor="skyblue">
				<tr><h4>
					<td>Product ID</td>
					<td>Product Name</td>
					<td>Product Price</td>
					<td>Product Stock</td>
					<td>Action</td></h4>
				</tr>
				<c:forEach var="product" items="${products}">
					<tr>
						<td>${product.code} </td>
						<td>${product.name} </td>
						<td>${product.price} </td>
						<td>${product.stock} </td>
						<td>${product.cat_id} </td>
						<td>${product.sup_id} </td>
						<td><a href="product/delete/?id=${product.code}">Delete</a>
						<td><a href="product/edit/?id=${product.code}">Edit</a>
					</tr>
				</c:forEach>
		</table>
	</div>
</body>
</html>