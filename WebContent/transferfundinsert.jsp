<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
	<title>New Transaction</title>
	<link rel = "stylesheet" type = "text/css" href = "web.css">
	
</head>
<body>

	<h2><center>Fund Transfer</center></h2>
	
	<form action = "transaction" method = "post">
		Transferee Account no <input type = "text" name = "tacno"><br>
		Transferee Name <input type = "text" name = "tname"><br>
		Transfering Amount Rs. <input type = "text" name = "amount"><br>
		Beneficiary Name <input type = "text" name = "bname"><br>
		Beneficiary Account no <input type = "text" name = "bacno"><br>
		
		<input type = "submit" name = "submit" value = "Submit Transaction" class = "button button1">
		
	</form>
	
	<center>
	<h2>Check Your Previous Transactions Here</h2>
	<form action="previousrec.jsp">
		<input type = "submit" name = "next" value = "View Previous Transactions" class = "button button1">
	</form>
	</center>
	
</body>
</html>