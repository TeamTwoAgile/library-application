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
	
	
	<div class="container">
		<h1>Register Administrator:</h1>
		<div class="card">
			<div class="card-body">
				<form action="<%=request.getContextPath()%>/register" method="post">

					<div class="form-group row">
						<label for="username" class="col-sm-2 col-form-label">User
							Name</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="username"
								placeholder="Enter user name">
						</div>
					</div>

					<div class="form-group row">
						<label for="password" class="col-sm-2 col-form-label">password
						</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="password"
								placeholder="Enter password">
						</div>
					</div>

					<div class=" form-group row">
						<label for="email" class="col-sm-2 col-form-label">email</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="email"
								placeholder="Enter email">
						</div>
					</div>
					
					<input type="hidden" name=userType value="admin">

					<button type="submit" class="btn btn-primary">Submit</button>
				</form>
			</div>
		</div>
	</div>
	
</body>
</html>