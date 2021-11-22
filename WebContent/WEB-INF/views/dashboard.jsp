<%@page import="com.library.bean.Book"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

tr:nth-child(even) {
  background-color: #D6EEEE;
}

th, td {
  padding-top: 10px;
  padding-bottom: 10px;
  padding-left: 30px;
  padding-right: 40px;
}
	
</style>
</head>
<body>
	<% List<Book> listOfBooks = (List<Book>)request.getAttribute("booksList"); %>
	   <table align="center" style="width: 100%">
	   <tr>
	   		<th>Sr No</th>
			<th>Book Name</th>
			<th>Author</th>
			<th>Type</th>	
			<th>Available</th>		
	   </tr>
	   	<%  int count = 1;
	   		for(Book book : listOfBooks){%>
				<tr>
					<td align="center"><%=count++ %></td>
					<td align="center"><%=book.getName() %></td>
					<td align="center"><%=book.getAuthor() %></td>
					<td align="center"><%=book.getType() %></td>
					<td align="center">Yes</td>				
				</tr>  
	   	<%}%>
	   	
	   	</table>
	
</body>
</html>