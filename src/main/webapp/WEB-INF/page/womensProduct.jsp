<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<link rel="stylesheet" href="<c:url value="/resource/css/men.css"/>">
</head>
<body>
	<%@ include file="navbar.jsp"%>

	<div class="container " style="margin-top: 8rem;">

		<div class="row">
			<div class="col-sm-6 col-md-4">
				<div class="card" style="width: 300px">
					<img class="card-img-top" src="<c:url value="${product1.wurl }"/>"
						alt="Card image" style="width: 100%; height: 280px">
					<div class="card-body">
						<h3 class="card-title">${product1.wname }</h3>
						<p class="card-text">${product1.wdec }</p>
						<h4>Price  &#8377; ${product1.wprice }</h4>
						<a href="#" class="btn btn-primary">Go to know more</a>
					</div>
				</div>
			</div>
			<div class="col-sm-6 col-md-4">
				<div class="card" style="width: 300px">
					<img class="card-img-top" src="<c:url value="${product2.wurl }"/>"
						alt="Card image" style="width: 100%; height: 280px">
					<div class="card-body">
						<h3 class="card-title">${product2.wname }</h3>
						<p class="card-text">${product2.wdec }</p>
						<h4>Price  &#8377;${product2.wprice }</h4>
						<a href="#" class="btn btn-primary">Go to know more</a>
					</div>
				</div>
			</div>

			<div class="col-sm-6 mt-4 col-md-4">
				<div class="card" style="width: 300px">
					<img class="card-img-top" src="<c:url value="${product3.wurl }"/>"
						alt="Card image" style="width: 100%; height: 280px">
					<div class="card-body">
						<h3 class="card-title">${product3.wname }</h3>
						<p class="card-text">${product3.wdec }</p>
						<h4>Price  &#8377;${product3.wprice }</h4>
						<a href="#" class="btn btn-primary">Go to know more</a>
					</div>
				</div>
			</div>
			<div class="col-sm-6  mt-4 col-md-4">
				<div class="card" style="width: 300px">
					<img class="card-img-top" src="<c:url value="${product4.wurl }"/>"
						alt="Card image" style="width: 100%; height: 280px">
					<div class="card-body">
						<h3 class="card-title">${product4.wname }</h3>
						<p class="card-text">${product4.wdec }</p>
						<h4>Price  &#8377;${product4.wprice }</h4>
						<a href="#" class="btn btn-primary">Go to know more</a>
					</div>
				</div>
			</div>

			<div class="col-sm-6  mt-4 col-md-4">
				<div class="card" style="width: 300px">
					<img class="card-img-top" src="<c:url value="${product5.wurl }"/>"
						alt="Card image" style="width: 100%; height: 280px">
					<div class="card-body">
						<h3 class="card-title">${product5.wname }</h3>
						<p class="card-text">${product5.wdec }</p>
						<h4>Price  &#8377;${product5.wprice }</h4>
						<a href="#" class="btn btn-primary">Go to know more</a>
					</div>
				</div>
			</div>

			<div class="col-sm-6  mt-4 col-md-4">
				<div class="card" style="width: 300px">
					<img class="card-img-top" src="<c:url value="${product6.wurl }"/>"
						alt="Card image" style="width: 100%; height: 280px">
					<div class="card-body">
						<h3 class="card-title">${product6.wname }</h3>
						<p class="card-text">${product6.wdec }</p>
						<h4 >Price  &#8377;${product6.wprice }</h4>
						<a href="#" class="btn btn-primary">Go to know more</a>
					</div>
				</div>
			</div>

			<div class="col-sm-6  mt-4 col-md-4">
				<div class="card" style="width: 300px">
					<img class="card-img-top" src="<c:url value="${product7.wurl }"/>"
						alt="Card image" style="width: 100%; height: 280px">
					<div class="card-body">
						<h3 class="card-title">${product7.wname }</h3>
						<p class="card-text">${product7.wdec }</p>
						<h4 >Price  &#8377;${product7.wprice }</h4>
						<a href="#" class="btn btn-primary">Go to know more</a>
					</div>
				</div>
			</div>

		</div>

	</div>


	<%@ include file="footer.jsp"%>
















	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>