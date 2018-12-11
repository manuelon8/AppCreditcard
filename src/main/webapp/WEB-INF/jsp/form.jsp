<%@taglib prefix="form"  uri="http://www.springframework.org/tags/form" %> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"  %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta  charset="UTF-8"/>
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    </head>
    <body>

        <div class="container justify-content-center"  >            
            <div class="row">              
                <p>
                <ol class="breadcrumb">
                    <li><a href="<c:url value="/"  />"       class="btn btn-success"><span class="glyphicon glyphicon-plus">   Inicio</span></a></li>
                    <li><a href="<c:url value="/all-card"  />"   class="btn btn-success"> <span class="glyphicon glyphicon-plus">  Listado de Tarjetas</span></a></li>
                    <li><a href="<c:url value="/mode-new" />"         class="btn btn-success"><span class="glyphicon glyphicon-plus">   Agregar Tarjeta</span></a></li>
                    <li><a href="<c:url value="/mode-newpay" />"        class="btn btn-success"><span class="glyphicon glyphicon-plus">Nuevo Pago</span></a></li>
                    <li><a href="<c:url value="/mode-getcard" />"        class="btn btn-success"><span class="glyphicon glyphicon-plus">Consultar Tarjeta</span></a></li>
                </ol>
                </p>
            </div>
               
            
           <div class="row">
             <form:errors path="*" element="div" ccsClass="alert alert-danger" />
             <hr/>
             <br>	
           </div>  
            
        </div>
        <c:choose>
            <c:when test="${mode == 'MODE_HOME'}">
                <div class="container text-center">
                      <p> <h1>	Bienvenido al Banco Patagonia</h1></p>
                </div>
            </c:when>
     
 
        	<c:when test="${mode == 'MODE_CARD'}">
        	<div class="container text-center invisible-at-first" id="taskDiv">
			<h3>My Tasks</h3>
			<hr>
		<div class="table-responsive">
		<table class="table table-striped table-bordered text-left">
			<thead>
				<tr>
					<th>Numero de tarjeta</th>
					<th>Marca</th>
					<th>Card Holder</th>
					<th>Fecha de vencimiento</th>
					<th>Eliminar</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="card" items="${cards}">
				<tr>
					<td>${card.cardNumber}</td>
					<td>${card.brand}</td>
					<td>${card.cardHolder}</td>
					<td>${card.expirationDate}</td>
					<td><a href="delete-card?id=${card.cardNumber}"/> </td>
				</tr>
			</c:forEach>
			</tbody>
		</table>		
		</div>		
	</div>
        	</c:when>
        	
        	<c:when test="${mode == 'MODE_NEW'}">
       <div class="container text-center invisible-at-first"  id="taskNew">
				<h3>Agregar Nueva Tarjeta</h3>
		
		<form class="form-horizontal" method="POST" action="new-card">
		<div class="form-group" align="center" >		
			<label class="control-label col-md-3">Numero de Tarjeta</label>
			<div class="col-md-5">			
			<input type="text"  class="form-control" name="cardNumber"  value="${card.cardNumber}" />
			</div>
			<label class="control-label col-md-3">Marca de Tarjeta</label>
			<div class="col-md-5">			
			<input type="text"  class="form-control" name="brand"  value="${card.brand}" />
			</div>
			<label class="control-label col-md-3">Card Holder</label>
			<div class="col-md-5">			
			<input type="text"  class="form-control" name="cardHolder"  value="${card.cardHolder}" />
			</div>
			<label class="control-label col-md-3">Fecha de Vencimiento</label>
			<div class="col-md-5">			
			<input type="text"  class="form-control" name="expirationDate"  value="${card.expirationDate}" />
			</div>
			<br>
			<div class="btn-group-lg">
		  		<button type="submit"  class="btn btn-primary">Agregar </button>
		  		<button type="button" class="btn btn-primary">Borrar</button>		   
			</div>
		</div>
		</form>
	</div>
        	</c:when>
        	<c:when test="${mode == 'MODE_NEWPAY'}">
       <div class="container text-center invisible-at-first"  id="taskNew">
				<h3>Ingresar Datos</h3>
		<form class="form-horizontal" method="POST" action="new-card">
		<div class="form-group" align="center" >		
			 
			<div class="col-md-5">			
			<input type="text"  class="form-control" name="name"  value="${card.cardNumber}" />
			</div>
			<label class="control-label col-md-3">Marca de Tarjeta</label>
			<div class="col-md-5">			
			<input type="text"  class="form-control" name="name"  value="${card.cardNumber}" />
			</div>
			<label class="control-label col-md-3">Card Holder</label>
			<div class="col-md-5">			
			<input type="text"  class="form-control" name="name"  value="${card.cardNumber}" />
			</div>
			<label class="control-label col-md-3">Monto</label>
			<div class="col-md-5">			
			<input type="text"  class="form-control" name="name"  value="${card.cardNumber}" />
			</div>
		</div>
		</form>
	</div>
        	</c:when>
        	 <c:when test="${mode == 'MODE_CHECKCARD'}">
       <div class="container text-center invisible-at-first"  id="taskNew">
				<h3>Ingresar Numero</h3>
				
		<form class="form-horizontal" method="POST" action="get-card">
		<div class="form-group" align="center" >		
			<label class="control-label col-md-3">Numero de Tarjeta</label>
			<div class="col-md-5">			
			<input type="text"  class="form-control" name="name"  value="${card.cardNumber}" />
			</div>
			<br>
			<div class="btn-group-lg">
		  		<button type="submit"  class="btn btn-primary">Agregar </button>
		  		<button type="button" class="btn btn-primary">Borrar</button>		   
			</div>		 
		</div>
		</form>
		
	</div>
        	</c:when>
        	
        	
        	
        	<c:when test="${mode == 'MODE_UPDATE'}"></c:when>
        	<c:when test="${mode == 'MODE_DELETE'}"></c:when>
        </c:choose>
       
        
    </body>
</html>
