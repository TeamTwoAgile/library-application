<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${contextPath}/css/bootstrap-4.0.0-dist/css/bootstrap.css"
	rel="stylesheet" type="text/css" />
<script type="text/javascript"
	src="${contextPath}/css/bootstrap-4.0.0-dist/js/bootstrap.js"></script>
</head>
<body>
	<div class="container">
		<h1>Add book:</h1>
		<div class="card">
			<div class="card-body">
				<form action="<%=request.getContextPath()%>/addBook" method="post">

					<div class="form-group row">
						<label for="bookName" class="col-sm-2 col-form-label">Book
							Name</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="name"
								placeholder="Enter book name">
						</div>
					</div>

					<div class="form-group row">
						<label for="author" class="col-sm-2 col-form-label">Author
						</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="author"
								placeholder="Enter author name">
						</div>
					</div>

					<div class=" form-group row">
						<label for="type" class="col-sm-2 col-form-label">Type </label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="type"
								placeholder="Enter book type">
						</div>
					</div>
					<c:if test="${msg!=null}">
						<div class=" form-group row">
							<label for="type" class="col-sm-2 col-form-label"></label>
							<div class="col-sm-7" style="color:blue">${msg}</div>
						</div>
					</c:if>

					<button type="submit" class="btn btn-primary">Submit</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>