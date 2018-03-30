<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>

<body>

<%-- <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
    	<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
      	</button>
      <a class="navbar-brand" href="#">Shopping cart</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li class="dropdown">
      
      <c:forEach items="${categories}" var="category">
      	<a class="dropdown-toggle" data-toggle="dropdown" href="#"><span class="caret"> ${category.category_name} </span></a>
        
        <c:forEach items="${category.products}" var="product">
        <ul class="dropdown-menu">
          <li><a href="product/get?id=${product.id}">${product.name}</a></li>
        </c:forEach>
          
        </ul>
      </c:forEach>
  </div>
</nav> --%>
  
<div class="container">
	<ul class="nav nav-pills" role="tablist">
		<c:forEach items="${categories}" var="category">
			<li class="dropdown">
				<a class="dropdown-toggle" data-toggle="dropdown" href="#"><span class="caret"> ${category.category_name} </span></a>
				
				<ul class="dropdown-menu" role="menu">
					<c:forEach items="${category.products}" var="product">
						<li>
							<a href="manage_product/get/${product.code}">${product.name}</a>
						</li>
					</c:forEach>
				</ul>
			</li>
		</c:forEach>
	</ul>
</div>  
  
</body>
</html>