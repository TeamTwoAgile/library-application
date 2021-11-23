<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="${contextPath}/css/bootstrap-4.0.0-dist/css/bootstrap.css"
	rel="stylesheet" type="text/css" />
<script type="text/javascript"
	src="${contextPath}/css/bootstrap-4.0.0-dist/js/bootstrap.js"></script>
</head>
<body>
	<%-- <div align="center">
		<h1>Administrator Register Form</h1>
		<form action="<%= request.getContextPath() %>/register" method="post">
			<table style="with: 80%">
				<tr>
					<td>UserName</td>
					<td><input type="text" name="username" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td>Name</td>
					<td><input type="text" name="name" /></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" name="email" /></td>
				</tr>
				<tr>
			</table>
			<input type="submit" value="Submit" />
		</form>
	</div> --%>


	<div class="container" style="margin-top: 200px">
		<div class="row justify-content-center">
			<h1>Register Administrator:</h1>
		</div>
		<div class="card">
			<div class="card-body">
				<form action="<%=request.getContextPath()%>/register" method="post">

					<div class="form-group row">
						<label for="username" class="col-sm-2 col-form-label">User
							Name:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name=username
								placeholder="Enter user name">
						</div>
					</div>

					<div class="form-group row">
						<label for="author" class="col-sm-2 col-form-label">Password:
						</label>
						<div class="col-sm-7">
							<input type="password" class="form-control" name="password"
								placeholder="Enter password">
						</div>
					</div>

					<input type="hidden" name=userType value="admin">
					
					<div class="form-group row">
						<label for="author" class="col-sm-2 col-form-label">Phone:
						</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="phone"
								placeholder="Enter Phone number">
						</div>
					</div>
					
					<div class="form-group row">
						<label for="author" class="col-sm-2 col-form-label">Address:
						</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="address"
								placeholder="Enter address">
						</div>
					</div>
					


					<div class="form-group row">
						<label for="author" class="col-sm-2 col-form-label">Email:
						</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="email"
								placeholder="Enter email">
						</div>
					</div>
					

					<c:if test="${msg!=null}">
						<div class=" form-group row">
							<label for="type" class="col-sm-2 col-form-label"></label>
							<div class="col-sm-7" style="color: blue">${msg}</div>
						</div>
					</c:if>

					<div class="container">
						<div class="row">
							<div class="col text-center">
								<button class="btn btn-primary" type="submit">Submit</button>
							</div>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
	<a href = "<%=request.getContextPath() %>/adminlogin"><h2>(Already Have An Account?)</h2></a>
</body>
<style>
.col-sm-7 {
	-webkit-box-flex: 0;
	-ms-flex: 0 0 73%;
	flex: 0 0 73%;
	max-width: 73%;
}
</style>
</html>