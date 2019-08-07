<%@page import="com.flashcardapp.entities.Flashcarduser"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<!-- Bootstrap core CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<link rel="stylesheet"
	href="<c:url value= "/resources/css/style-welcomepage.css" />">
<script type="text/javascript"
	src="<c:url value="/resources/script/js-welcomepage.js"/>"></script>
<c:url value="/resources/img/bg-banner03.jpg" var="bgbanner03JPG" />

<style type="text/css">
.hero {
	background: url(${bgbanner03JPG}) no-repeat fixed;
	background-size: cover;
	background-position: center center;
	position: relative;
	height: 100vh;
}
</style>
</head>

<body>
	<%-- <%
		Flashcarduser fc_user = (Flashcarduser) session.getAttribute("sFlashcarduser");
	%> --%>

	<div class="hero">
		<div class="hero-overlay">
			<!-- Navigation -->
			<nav class="logo">
				<h4>the nav</h4>
				<ul class="nav-links">
					<li><a href="LoginPage">Login</a></li>
					<li><a href="WelcomePage">Home</a></li>
					<li><a href="StudyPage">Study</a></li>
					<li><a href="QuizPage">quize</a></li>
					<li><a href="Logout">Logout</a></li>
				</ul>
				<div class="burger">
					<div class="line1"></div>
					<div class="line2"></div>
					<div class="line3"></div>
				</div>
			</nav>
			<h1>
				Welcome
				${flashcarduser}</h1>
				<p>You id is ${id}</p>
		</div>
	</div>


	<!-- Bootstrap core JavaScript -->
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