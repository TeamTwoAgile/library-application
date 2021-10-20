<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
  <h1>Customer Register Form</h1>
  <form action="<%= request.getContextPath() %>/register-customer" method="post">
   <table style="with: 80%">
   <tr>
     <td>Title</td>
     <td><input type="text" name="title" /></td>
    </tr>
    <tr>
     <td>First Name</td>
     <td><input type="text" name="firstName" /></td>
    </tr>
    <tr>
     <td>Last Name</td>
     <td><input type="text" name="lastName" /></td>
    </tr>
    <tr>
     <td>Sex</td>
     <td><input type="text" name="sex" /></td>
    </tr>
        <tr>
     <td>Address</td>
     <td><input type="text" name="address" /></td>
    </tr>
    <tr>
     <td>Contact</td>
     <td><input type="text" name="contact" /></td>
    </tr>
    <tr>
     <td>Date of Birth</td>
     <td><input type="text" name="dob" /></td>
    </tr>
     <tr>
     <td>Card Details</td>
     <td><input type="text" name="cardDetails" /></td>
    </tr>
    <tr>
     <td>UserName</td>
     <td><input type="text" name="username" /></td>
    </tr>
    <tr>
     <td>Password</td>
     <td><input type="password" name="password" /></td>
    </tr>
   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>
</body>
</html>