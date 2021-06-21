<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
	<title>Enter Details</title>
	<link rel = "stylesheet" type = "text/css" href = "web.css">
	
</head>
<body>

	<h2><center>View Previous Records</center></h2>

<div class = "container">

	<form action = "previousrecord" method = "post">
		Transferee Account Number <input type = "text" name = "transacc" placeholder = "Enter Your Account Number"><br>
		Beneficiary Account Number <input type = "text" name = "benefacc" placeholder = "Enter Your Beneficiary Account Number"><br>
		
		<input type = "submit" name = "previousrec" value = "View Previous Records" class = "button button1">
		
	</form>
</div>
	
</body>
</html>