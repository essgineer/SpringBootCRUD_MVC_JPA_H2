<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomePage</title>
</head>
<body>
<h1>Welcome!</h1>
 
<b>Add a Customer.</b>
     <form action="addCustomer">
    
         <label for="id">Id&emsp;:</label>
    	 <input type="text" name="id" placeholder="Enter id"><br>
    	 <label for="name">Name: </label>
    	 
   	 	 <input type="text" name="name" placeholder="Enter name"><br>
    	 <input type="submit"><br>
    	 
     </form>
 <br />    
 <b>Get a customer.</b>
       <form action="getCustomer">
         <label for="id">Id&emsp;: </label>
    	 <input type="text" name="id" placeholder="Enter id"><br>
    	 <input type="submit"><br>
       </form>
<br />
<b>Update a Customer</b>
     <form action="updateCustomer"> 
     <label for="id">Id&emsp;:</label>
    	 <input type="text" name="id" placeholder="Enter id"><br>
    	
    	  <label for="name">Name: </label>
   	 	 <input type="text" name="name" placeholder="Enter name"><br>
    	 <input type="submit"><br>
     </form>
 <br /> 
 <b>Delete a Customer.</b>    
     <form action="deleteCustomer">
     <label for="id">Id&emsp;:</label>
    	 <input type="text" name="id" placeholder="Enter id"><br>
    	 <input type="submit"><br>
       </form>
       
       <br /> <br /> 

</body>
</html>