<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="	
		sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta http-equiv="Pragma" content="no-cache">
		<meta http-equiv="Cache-Control" content="no-cache">
		<meta http-equiv="Expires" content="Sat, 01 Dec 2001 00:00:00 GMT">
		
		<title>Bank Patagonia</title>		 
		<link href="static/css/style.css" rel="stylesheet">
</head>
<body>
<script src="static/js/bootstrap.min.js"></script>
<div role="navigation" >	
	<div class="navbar navbar-inverse">
		<a href="#" class="navbar-brand">CreditCard</a>
		<div class="navbar-collapse collapse">
		<ul>
			<li><a href="#" class="navbar-brand"> Save CreditCard</a></li>
			<li><a href="#" class="navbar-brand">List CreditCard</a></li>
		</ul>
		</div>
	</div>
</div>
<div class="container invisible-at-first" id="homeDiv">
	<div class="jumbotron text-center">
		<h1>	welcome to Patagonian Bank</h1>
	</div>

</div>

<div class="container text-center invisible-at-first" id="taskDiv">
		<h3>	My Tasks</h3>
		<hr>
		<div class="table-responsive">
		<table class="table table-striped table-bordered text-left">
			<thead>
				<tr>
					<th>Card Number</th>
					<th>Brand</th>
					<th>Card Holder</th>
					<th>Expiration Date</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="card" items="${cards}">
				<tr>
					<td>${card.cardNumber}</td>
					<td>${card.brand}</td>
					<td>${card.cardHolder}</td>
					<td>${card.expirationDate}</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>		
		</div>		
	</div>
	
	<div class="container text-center">
		<h3>Manage Cards</h3>
		<form class="form-horizontal" method="POST" action="new-card">
		<div class="form-group">
		
			<label class="control-label col-md-3">Card Number</label>
			
			<div class="col-md-5">			
			<input type="text"  class="form-control" name="name"  value="${card.cardNumber}" />
			</div>
		</div>
		</form>
	</div>

</body>
</html>







