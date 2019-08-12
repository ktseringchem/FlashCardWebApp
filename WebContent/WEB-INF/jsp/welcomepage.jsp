<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<c:url value="/resources/css/style-welcomepage.css"
	var="stylewelcomepageCSS" />
<link rel="stylesheet" href="${stylewelcomepageCSS }">

<!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
    integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous" />

<style type="text/css">
.grid-container {
	display: grid;
	grid-template-columns: 240px 1fr;
	grid-template-rows: 50px 1fr 50px;
	grid-template-areas: "sidenav header" "sidenav main" "sidenav footer";
	height: 100vh;
}

.header {
	grid-area: header;
	background-color: #648ca6;
}

.sidenav {
	grid-area: sidenav;
	background-color: #394263;
}

.main {
	grid-area: main;
	background-color: #8fd4d9;
}

.footer {
	grid-area: footer;
	background-color: #648ca6;
}

.header, .footer {
	display: flex;
	align-items: center;
	justify-content: space-between;
	padding: 0 16px;
	background-color: #648ca6;
}

.sidenav {
	display: flex; /* Will be hidden on mobile */
	flex-direction: column;
	grid-area: sidenav;
	background-color: #394263;
}

.sidenav__list {
	padding: 0;
	margin-top: 85px;
	list-style-type: none;
}

.sidenav__list-item a{
	padding: 20px 20px 20px 40px;
	color: #ddd;
}

.sidenav__list-item:hover {
	background-color: rgba(255, 255, 255, 0.2);
	cursor: pointer;
}

.main-header {
	display: flex;
	justify-content: space-between;
	margin: 20px;
	padding: 20px;
	height: 150px;
	/* Force our height since we don't have actual content yet */
	background-color: #e3e4e6;
	color: slategray;
}

.main-overview {
	display: grid;
	grid-template-columns: repeat(auto-fit, minmax(265px, 1fr));
	/* Where the magic happens */
	grid-auto-rows: 94px;
	grid-gap: 20px;
	margin: 20px;
}

.overviewcard {
	display: flex;
	align-items: center;
	justify-content: space-between;
	padding: 20px;
	background-color: #d3d3;
}

.main-cards {
	column-count: 2;
	column-gap: 20px;
	margin: 20px;
}

.card {
	display: flex;
	flex-direction: column;
	align-items: center;
	width: 100%;
	background-color: #82bef6;
	margin-bottom: 20px;
	-webkit-column-break-inside: avoid;
	padding: 24px;
	box-sizing: border-box;
}
/* Force varying heights to simulate dynamic content */
.card:first-child {
	height: 485px;
}

.card:nth-child(2) {
	height: 200px;
}

.card:nth-child(3) {
	height: 265px;
}

.grid-container {
	display: grid;
	grid-template-columns: 1fr; /* Side nav is hidden on mobile */
	grid-template-rows: 50px 1fr 50px;
	grid-template-areas: 'header' 'main' 'footer';
	height: 100vh;
}

.sidenav {
	display: none;
	grid-area: sidenav;
	background-color: #394263;
}

.main-cards {
	column-count: 1;
	column-gap: 20px;
	margin: 20px;
}

/* Non-mobile styles, 750px breakpoint */
@media only screen and (min-width: 46.875em) {
	/* Show the sidenav */
	.grid-container {
		grid-template-columns: 240px 1fr;
		/* Show the side nav for non-mobile screens */
		grid-template-areas: "sidenav header" "sidenav main" "sidenav footer";
	}
	.sidenav {
		display: flex;
		flex-direction: column;
	}
}
/* Medium-sized screen breakpoint (tablet, 1050px) */
@media only screen and (min-width: 65.625em) {
	/* Break out main cards into two columns */
	.main-cards {
		column-count: 2;
	}
}

/* Hamburger menu icon, stays fixed on mobile for any possible scrolling */
.menu-icon {
	position: fixed;
	display: flex;
	top: 5px;
	left: 10px;
	align-items: center;
	justify-content: center;
	border-radius: 50%;
	z-index: 1;
	cursor: pointer;
	padding: 12px;
	background-color: #DADAE3;
}

/* Make room for the menu icon on mobile */
.header__search {
	margin-left: 42px;
}

/* Mobile-first side nav styles */
.sidenav {
	grid-area: sidenav;
	display: flex;
	flex-direction: column;
	height: 100%;
	width: 240px;
	position: fixed;
	overflow-y: auto;
	box-shadow: 0 2px 2px 0 rgba(0, 0, 0, 0.16), 0 0 0 1px
		rgba(0, 0, 0, 0.08);
	z-index: 2; /* Needs to sit above the hamburger menu icon */
	background-color: #394263;
	transform: translateX(-245px);
	transition: all .6s ease-in-out;
}

/* The active class is toggled on hamburger and close icon clicks */
.sidenav.active {
	transform: translateX(0);
}

/* Only visible on mobile screens */
.sidenav__close-icon {
	position: absolute;
	visibility: visible;
	top: 8px;
	right: 12px;
	cursor: pointer;
	font-size: 20px;
	color: #ddd;
}

/* Non-mobile styles for side nav responsiveness, 750px breakpoint */
@media only screen and (min-width: 46.875em) {
	.sidenav {
		position: relative; /* Fixed position on mobile */
		transform: translateX(0);
	}
	.sidenav__close-icon {
		visibility: hidden;
	}
}
</style>
</head>

<body>
	<div class="grid-container">
		<div class="menu-icon">
			<i class="fas fa-bars"></i>
		</div>
		<header class="header">
			<div class="header__search">Search...</div>
			<div class="header__avatar">Your face</div>
		</header>

		<aside class="sidenav">
			<ul class="sidenav__list">
				<li class="sidenav__list-item"><a href="LandingPage">Landing</a></li>
				<li class="sidenav__list-item"><a href="LoginPage">Login</a></li>
				<li class="sidenav__list-item"><a href="WelcomePage">Home</a></li>
				<li class="sidenav__list-item"><a href="StudyPage">Study</a></li>
				<li class="sidenav__list-item"><a href="QuizPage">quize</a></li>
			</ul>
			<div class="sidenav__close-icon">
				<i class="fas fa-times"></i>
			</div>
		</aside>

		<main class="main">
		<div class="main-header">
			<div class="main-header__heading">Total Card</div>
			<div class="main-header__updates">${totalCards}</div>
		</div>

		<div class="main-overview">
			<div class="overviewcard">
				<div class="overviewcard__icon">Total Card</div>
				<div class="overviewcard__info">${totalCards}</div>
			</div>
			<div class="overviewcard">
				<div class="overviewcard__icon">Overview</div>
				<div class="overviewcard__info">Card</div>
			</div>
			<div class="overviewcard">
				<div class="overviewcard__icon">Overview</div>
				<div class="overviewcard__info">Card</div>
			</div>
			<div class="overviewcard">
				<div class="overviewcard__icon">Overview</div>
				<div class="overviewcard__info">Card</div>
			</div>
		</div>

		<div class="main-cards">
			<div class="card">Card</div>
			<div class="card">Card</div>
			<div class="card">Card</div>
		</div>
		</main>

		<footer class="footer">
			<div class="footer__copyright">&copy; 2018 MTH</div>
			<div class="footer__signature">Made with love by pure genius</div>
		</footer>

	</div>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script>
		const menuIconEl = $('.menu-icon');
		const sidenavEl = $('.sidenav');
		const sidenavCloseEl = $('.sidenav__close-icon');

		// Add and remove provided class names
		function toggleClassName(el, className) {
			if (el.hasClass(className)) {
				el.removeClass(className);
			} else {
				el.addClass(className);
			}
		}

		// Open the side nav on click
		menuIconEl.on('click', function() {
			toggleClassName(sidenavEl, 'active');
		});

		// Close the side nav on click
		sidenavCloseEl.on('click', function() {
			toggleClassName(sidenavEl, 'active');
		});
	</script>
</body>
</html>