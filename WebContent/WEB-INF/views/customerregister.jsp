<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Library Application form for customers</title>
<style>
 table,th,td
 {
  background-color:lightblue;
  border: 2px solid gray;
 }
</style>
</head>
  <body>
<div style="background-color:lightyellow;
  margin: 0 auto;
  width: 850px;
  border: 4px solid gray;
  align= "center">
  <h1>Customer Registration Form</h1>
  <form action="<%= request.getContextPath() %>/register-customer" method="post">
   <table style="background-color:red;
    width: 80%;
    border: 1px solid green;
    align= "center">
   <tr>   
     <td>Title
     <select>
     <option value = "male">Mr</option>
     <option value = "female">Mrs</option>
      <option value = "title1">Choose not to say</option>
       </select>
       </td>
    </tr>
    <tr>
     <td>
     First Name    
     </td>
     <td><input type="text" name="firstName" /></td>    
    </tr>
    <tr>
     <td>Last Name</td>
          <td><input type="text" name="lastName" /></td>
    </tr>
    <tr>
     <td>
     <h2 style = "font-size:120%; color: green">
     Sex
     </h2>
      <select>
      <option value = "male">Male</option>
      <option value = "female">Female</option>
      <option value = "ana">anonymous</option>
       </select>
     </td>
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
     <td>
     <h2 style = "font-type: bold; font-size:150%; color: red">
     Card Details
     </h2>
      <h2 style = "font-type:italic; font-size:120%; color: orange">
     <form> 
     <table {border:3px solid #c00} style="with: 30%">
     <tr>
     <td>Name as shown on card</td>
     <td><input type="text" name="Name" /></td>
    </tr>
      <tr>   
     <td>
     <h4 style = "font-type:italic; font-size:150%; color: blue">
     Card Type
     <select>
     <option value = "visa">Visa</option>
     <option value = "master">Master</option>
       </select>
       </h4>
       </td>
    </tr>
    <tr>
     <td>Number</td>
     <td><input type="text" name="cardNumber" /></td>
    </tr>
    <tr>
     <td>Expiry date</td>
     <td><input type="text" name="expDate" /></td>
    </tr>
    <tr>
     <td>CRV</td>
     <td><input type="text" name="crv" /></td>
    </tr>
       </table>
  </form>
  </h2>
  </td>
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