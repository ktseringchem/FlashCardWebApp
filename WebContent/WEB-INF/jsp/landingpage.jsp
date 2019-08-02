<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="com.flashcardapp.entities.FlashCards"%>
<%@page import="com.flashcardapp.entities.Flashcarduser"%>
<%@page import="java.util.List"%>
<%@page import="com.flashcardapp.service.CardServices"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">


<title>landing page</title>

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<title>Welcome page</title>

<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round|Open+Sans">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">
	
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<!-- <script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> -->

<!-- Custom styles -->
<script type="text/javascript"
	src="<c:url value="/resources/script/js-landingpage.js" />"></script>
<link href="<c:url value="/resources/css/style-landingpage.css" />"
	rel="stylesheet">
<c:url value="/resources/img/bg-banner03.jpg" var="bgbanner03JPG" />

</head>


<body>
	<!-- Navigation -->
	<nav class="logo">
		<h4>the nav</h4>
		<ul class="nav-links">
			<li><a href="HomePage">Home</a></li>
			<li><a href="#">quize</a></li>
			<li><a href="#">score</a></li>
		</ul>
		<div class="burger">
			<div class="line1"></div>
			<div class="line2"></div>
			<div class="line3"></div>
		</div>
	</nav>


	<header>
		<div id="carouselExampleIndicators" class="carousel slide"
			data-ride="carousel">
			<ol class="carousel-indicators">
				<li data-target="#carouselExampleIndicators" data-slide-to="0"
					class="active"></li>
				<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
				<li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
				<li data-target="#carouselExampleIndicators" data-slide-to="3"></li>
			</ol>
			<div class="carousel-inner" role="listbox"
				style="background: url(${bgbanner03JPG}) no-repeat fixed; background-size: cover;">
				<%
					Flashcarduser fc_user = (Flashcarduser) session.getAttribute("sFlashcarduser");
					List<FlashCards> fcs = (List<FlashCards>) session.getAttribute("sFlashCards");
					int i = 0;
					for (FlashCards fc : fcs.subList(0, 10)) {
						String active = "";
						if (i < 1) {
							active = "active";
						}
				%>
				<!-- Slide One - Set the background image for this slide in the line below -->
				<div class="carousel-item <%=active%>">
					<div class="carousel-caption d-none d-md-block">
						<div class="flip-card">
							<div class="flip-card-inner">
								<div class="flip-card-front">
									<p class="card-text"><%=fc.getFront()%></p>
								</div>
								<div class="flip-card-back">
									<p class="card-text"><%=fc.getBack()%></p>
								</div>
							</div>
						</div>
					</div>
				</div>
				<%
					i++;
					}
				%>
			</div>
			<a class="carousel-control-prev" href="#carouselExampleIndicators"
				role="button" data-slide="prev"> <span
				class="carousel-control-prev-icon" aria-hidden="true"></span> <span
				class="sr-only">Previous</span>
			</a> <a class="carousel-control-next" href="#carouselExampleIndicators"
				role="button" data-slide="next"> <span
				class="carousel-control-next-icon" aria-hidden="true"></span> <span
				class="sr-only">Next</span>
			</a>
		</div>
	</header>
	<h1>Welcome <%=fc_user.getCname()%></h1>
	<div class="container">
		<div class="table-wrapper">
			<div class="table-title">
				<div class="row">
					<div class="col-sm-8">
						<h2>
							Flash Card <b>Details</b>
						</h2>
					</div>
					<div class="col-sm-4">
						<button type="button" class="btn btn-info add-new">
							<i class="fa fa-plus"></i> Add New
						</button>
					</div>
				</div>
			</div>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>Front Information</th>
						<th>back Information</th>
						<th>subject</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
					<%
						for (FlashCards fc : fcs) {
					%>
					<tr>
						<td><%=fc.getFront()%></td>
						<td><%=fc.getBack()%></td>
						<td><%=fc.getFlashcard_id()%></td>
						<td>
							<a class="add" title="Add" data-toggle="tooltip"> 
								<i class="material-icons">&#xE03B;</i>
							</a> 
							<a class="edit" title="Edit" data-toggle="tooltip"> 
								<i class="material-icons">&#xE254;</i>
							</a> 
							<a class="delete" title="Delete" data-toggle="tooltip"> 
								<i  onClick="onDelete(this);" id="<%=fc.getFlashcard_id()%>" class="material-icons">&#xE872;</i>
							<%-- onClick="onDelete(this);" id="<%=fc.getFlashcard_id()%>" --%>
							</a>
						</td>
					</tr>
					<%
						}
					%>
				</tbody>
			</table>
		</div>
	</div>

	<!-- for table  -->
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>

</body>

</html>



