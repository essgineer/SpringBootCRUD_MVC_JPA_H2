<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Welcome!
 <br />
 <br />
Add a Customer. Enter id then name:
     <form action="addCustomer">
    	 <input type="text" name="id"><br>
   	 	 <input type="text" name="name"><br>
    	 <input type="submit"><br>
     </form>
 <br />    
 Get a customer. Enter id then name:
       <form action="getCustomer">
    	 <input type="text" name="id"><br>
    	 <input type="submit"><br>
       </form>
<br />
Update a Customer. Enter id:
     <form action="updateCustomer">
    	 <input type="text" name="id"><br>
   	 	 <input type="text" name="name"><br>
    	 <input type="submit"><br>
     </form>
 <br /> 
 Delete a Customer. Enter id:   
     <form action="deleteCustomer">
    	 <input type="text" name="id"><br>
    	 <input type="submit"><br>
       </form>
</body>
</html>