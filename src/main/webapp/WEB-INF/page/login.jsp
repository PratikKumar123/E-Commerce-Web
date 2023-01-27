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


<link rel="stylesheet" href="<c:url value="/resource/css/login.css"/>">
</head>
<body>
	<%@ include file="navbar.jsp"%>

	<div class=" container pt-5 mt-5">
		<div class="global-container">
			<div class="card login-form">
				<div class="card-body">
					<h1 class="card-title text-center">Login Here</h1>
					<div class="card-text">
						<form action="dologin" method="post">
							<div class="form-group">
								<label for="exampleInputEmail1"> Enter Email address </label> <input
									type="email" name="email" class="form-control form-control-sm"
									id="exampleInputEmail1" aria-describedby="emailHelp">
							</div>
							<div class="form-group">
								<label for="exampleInputPassword1">Enter Password </label> <a
									href="#" style="float: right; font-size: 12px;"> Forgot
									password? </a> <input type="password" name="password"
									class="form-control form-control-sm" id="exampleInputPassword1">
							</div>
							<button type="submit" class="btn btn-primary btn-block">
								Sign in</button>

							<div class="sign-up">
								Don't have an account? <a href="register"> Create One </a>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
		<%@ include file="footer.jsp"%>
</body>
</html>