<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
.button {
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}

#divStyle {
  position: absolute;
  width: 300px;
  height: 300px;
  top: 50%;
  left: 50%;
  margin: -100px 0 0 -100px;

}

.button1 {background-color: #4CAF50;} /* Green */
.button2 {background-color: #008CBA;} /* Blue */
</style>
<body>
	<div id="divStyle">
		<button class="button button1" type="button" onclick="location.href = '<%=request.getContextPath() %>/register-customer'">Are you a Customer?</button>
		<button class="button button2" type="button" onclick="location.href = '<%=request.getContextPath() %>/register'">Are you an Admin?&nbsp&nbsp&nbsp&nbsp</button>
	</div>
	
</body>
</html>