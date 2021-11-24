<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Check Out or Return</title>
		<link href="${contextPath}/css/bootstrap-4.0.0-dist/css/bootstrap.css" rel="stylesheet" type="text/css" />
		<script type="text/javascript" src="${contextPath}/css/bootstrap-4.0.0-dist/js/bootstrap.js"></script>
	</head>
	<body>
		<div class="container">
			<h1>Add book:</h1>
			<div class="card">
				<div class="card-body">
				<form action="<%=request.getContextPath()%>/bookactions" method="post">
					<div class="form-group row">
						<label for="bookName" class="col-sm-2 col-form-label">Book Name</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="name" placeholder="Search Book">
						</div>
						<label for="authorName" class="col-sm-2 col-form-label">Author</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="author" placeholder="Search Book">
						</div>
						<div class="col-sm-7">
							<input type="checkbox" id="scales" name="scales" checked>
 				 			<label for="scales">Check In/Out</label>
 				 		</div>
					</div>

					<button type="submit" class="btn btn-primary">Submit</button>
				</form>
				</div>
			</div>
		</div>
	</body>
</html>