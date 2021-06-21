<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
	<title>Renew Transaction</title>
	<link rel = "stylesheet" type = "text/css" href = "web.css">
	
</head>
<body>

	<h2><center>Do Transactions with your Prevous Beneficiaries Easily</center></h2>
	
	<%
		String id = request.getParameter("id");
		String accnot = request.getParameter("accnot");
		String namet = request.getParameter("namet");
		String tramount = request.getParameter("tramount");
		String nameb = request.getParameter("nameb");
		String accnob = request.getParameter("accnob");
	%>

	<form action = "updateTransaction" method = "post">
	
	Record ID <input type= "text" name = "rid" value = "<%= id%>" readonly><br>
	Transferee Account No <input type= "text" name = "tacno" value = "<%= accnot%>" readonly><br>
	Transferee Name <input type= "text" name = "tname" value = "<%= namet%>" readonly><br>
	Amount <input type= "text" name = "amount" value = "<%= tramount%>"><br>
	Beneficiary Name <input type= "text" name = "bname" value = "<%= nameb%>" readonly><br>
	Beneficiary Account No <input type= "text" name = "bacno" value = "<%= accnob%>" readonly><br>
	
	<input type = "submit" name = "submit" value = "Update Transaction" class = "button button1"><br>
	</form>
	
</body>
</html>