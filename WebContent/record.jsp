<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

	<title>Transaction History</title>
	<link rel = "stylesheet" type = "text/css" href = "web.css">
	
</head>
<body>

	<h2><center>Transaction Records</center></h2>
	
	<table>

	<c:forEach var = "prev" items = "${prevDetails}">
	
	<c:set var = "id" value = "${prev.rocord_id}"/>
	<c:set var = "accnot" value = "${prev.transferee_accno}"/>
	<c:set var = "namet" value = "${prev.transferee_name}"/>
	<c:set var = "tramount" value = "${prev.amount}"/>
	<c:set var = "nameb" value = "${prev.beneficiary_name}"/>
	<c:set var = "accnob" value = "${prev.beneficiary_accno}"/>
	
	
	<tr>
		<td>Record ID  </td>
		<td>${prev.rocord_id}</td>
	</tr>
	<tr>
		<td>Transferee Account No</td>
		<td>${prev.transferee_accno}</td>
	</tr>
	<tr>
		<td>Transferee Name</td>
		<td>${prev.transferee_name}</td>
	</tr>
	<tr>
		<td>Amount</td>
		<td>${prev.amount}</td>
	</tr>
	<tr>
		<td>Beneficiary Name</td>
		<td>${prev.beneficiary_name}</td>
	</tr>
	<tr>
		<td>Beneficiary Account No</td>
		<td>${prev.beneficiary_accno}</td>
	</tr>
	
	
	</c:forEach>
	</table>
	
	
	<c:url value = "transactionupdate.jsp" var = "tupdate">
	
		<c:param name= "id" value = "${id}"/>
		<c:param name= "accnot" value = "${accnot}"/>
		<c:param name= "namet" value = "${namet}"/>
		<c:param name= "tramount" value = "${tramount}"/>
		<c:param name= "nameb" value = "${nameb}"/>
		<c:param name= "accnob" value = "${accnob}"/>
		
	</c:url>
	
	<center>
	<a href = "${tupdate}">
	<input type = "button" name = "update" value = "Update Transaction" class = "button button1">
	</a>
	</center>
	
	<br>
	<c:url value = "deletetransaction .jsp" var = "transdelete">
	
		<c:param name="id" value = "${id}"/>
		<c:param name="accnot" value = "${accnot}"/>
		<c:param name="namet" value = "${namet}"/>
		<c:param name = "tramount" value = "${tramount}"/>
		<c:param name="nameb" value = "${nameb}"/>
		<c:param name="accnob" value = "${accnob}"/>	
	
	</c:url>
	
	<center>
	<a href = "${transdelete}">
	<input type = "button" name = "delete" value = "Delete Transaction History" class = "button button1">
	</a>
	</center>
	
</body>