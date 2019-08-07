<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>login/registration page</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<c:url value="/resources/img/bg-banner03.jpg" var="bgbanner03JPG" />
<link rel="stylesheet"
	href="<c:url value="/resources/css/style-login.css"/>">
<link rel="stylesheet"
	href="<c:url value="/resources/css/style-study.css"/>">

<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js?ver=3.0.1"></script>
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
	<!-- Navigation -->
	<nav class="logo">
		<h4>the nav</h4>
		<ul class="nav-links">
			<li><a href="LandingPage">Landing</a></li>
			<li><a href="LoginPage">Login</a></li>
			<li><a href="WelcomePage">Home</a></li>
			<li><a href="StudyPage">Study</a></li>
			<li><a href="QuizPage">Quiz</a></li>
			<li><a href="Logout">Logout</a></li>
		</ul>
		<div class="burger">
			<div class="line1"></div>
			<div class="line2"></div>
			<div class="line3"></div>
		</div>
	</nav>
	<div class="hero">
		<div class="hero-overlay">
			<div class="login-page" Style="padding: 8% 0 0;">
				<div class="form">
					<form:form method="POST" action="Register" class="register-form"
						modelAttribute="userKey">

						<form:input type="text" path="cname" placeholder="Enter Full Name"
							id="cname" />
						<form:errors path="cname" style="color:red;"/>

						<form:input type="password" path="password" placeholder="password" />
						<form:errors path="password" style="color:red;" />

						<form:input type="email" path="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"
							placeholder="Enter email address" id="email" />
						<form:errors path="email" />
						<input type="submit" value="create" />
						<p class="message">
							Already registered? <a href="#">Sign In</a>
						</p>
					</form:form>
					<form action="Login" method="POST" class="login-form"> <!-- pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" -->
						<input type="text" name="uname" placeholder="username is your email" /> 
						<input type="password" name="upasswd" placeholder="password" />
						<button>login</button>
						
						<p style="display: none; display: ${inCorrectReg}; color: red">
							you were not registered</p>
						<p style="display: none; display: ${CorrectReg}; color: green;">You
							are registered, please try logging in</p>
						<p style="display: none; display: ${WrongCred}; color: red;">Wrong
							credential, please try registering</p>
						<p class="message">
							Not registered? <a href="#">Create an account</a>
						</p>
					</form>
				</div>
			</div>
		</div>
	</div>
	<script>
		$(".message a").click(function() {
			$("form").animate({
				height : "toggle",
				opacity : "toggle"
			}, "slow");
		});
	</script>

</body>

</html>