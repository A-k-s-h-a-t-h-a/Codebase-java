<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
		  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
body {
	font-family: Arial, Helvetica, sans-serif;
}

form {
	border: 3px solid #f1f1f1;
}

input[type=text], input[type=password] {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
}

button {
	background-color: #4CAF50;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
}

button:hover {
	opacity: 0.8;
}

.cancelbtn {
	width: auto;
	padding: 10px 18px;
	background-color: #f44336;
}

.imgcontainer {
	text-align: center;
	margin: 24px 0 12px 0;
}

.container {
	padding: 16px;
}

span.psw {
	float: right;
	padding-top: 16px;
}
</style>
	</head>
<body>

	Category Managemenet

	 <form action="category/save/" method="post" >
		<table>
			<tr>
				
 				<c:if test="${!empty category.category_id}">			<%-- ? --%>
				<td><input type="hidden" name='category_id' value="${category.category_id}" /></td>
				</c:if>
				<c:if test="${empty category.category_id}">
				<td>ID</td>
				<td><input type="text" name='category_id' /></td>
				</c:if>
			</tr>

			<tr>
				<td>Name</td>
				<td><input type="text" name='name' value="${category.name}" /></td>
			</tr>

			<tr>
				<td>Description</td>
				<td><input type="text" name='description' value="${category.description}" /></td>
			</tr>

			<tr>
				<input type="submit" value='Submit Category'>
			</tr>

		</table>
	</form> 
	
	${categorysuccess}
	${categoryerror}
	
	<div>
		<table border="2" bgcolor="skyblue">
				<tr><h4>
					<td>Category ID</td>
					<td>Category Name</td>
					<td>Category Description</td>
					<td>Action</td></h4>
				</tr>
				<c:forEach var="category" items="${categories}">			<!-- list of categories from database attached to httpsession in homecontroller-->
					<tr>
						<td>${category.category_id} </td>
						<td>${category.name} </td>
						<td>${category.description} </td>
						<td><a href="category/delete/?id=${category.category_id}">Delete</a>
						<td><a href="category/edit/?id=${category.category_id}">Edit</a>
					</tr>
				</c:forEach>
		</table>
	</div>
	
	
</body>
</html>