<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Landing page</title>

<!-- background image -->
<c:url value="/resources/img/bg-banner03.jpg" var="bgbanner03JPG" />

<!-- custom css -->
<link href="<c:url value="/resources/css/style-landingpage.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/style-index.css" />"
	rel="stylesheet">
<!-- in line style for background -->
<style type="text/css">
	.hero {
		background: url(${bgbanner03JPG}) no-repeat fixed;
		background-size: cover;
		background-position: center center;
		position: relative;
		height: 100vh;
	}
	.hero-overlay {
	background-color: RGBA(0, 0, 0, 0.48);
	min-height: 100vh;
	}
</style>

</head>

<body>

	<!-- Navigation -->
	<nav class="logo">
		<h4>the nav</h4>
		<ul class="nav-links">
			<li><a href="toLoginPage.html">Login</a></li>
			<li><a href="#">Study</a></li>
			<li><a href="#">quize</a></li>
			<li><a href="#">score</a></li>
		</ul>
		<div class="burger">
			<div class="line1"></div>
			<div class="line2"></div>
			<div class="line3"></div>
		</div>
	</nav>

	<div class="hero">
		<div class="hero-overlay">
			
				<img alt="flashcards"
					src="<c:url value="/resources/img/flashcards.png" />">
			<div style="font-size: 30px; color: white;">Study with flashcards</div>
		</div>
	</div>

</body>
</html>