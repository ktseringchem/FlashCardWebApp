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

<title>Welcome page</title>

<!-- Bootstrap CSS -->
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

<script type="text/javascript"
	src="<c:url value="/resources/script/js-study.js" />"></script>
<link href="<c:url value="/resources/css/style-study.css" />"
	rel="stylesheet">

</head>


<body>

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
	
	<div class="container-fluid bg-info">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h3>
						<span class="label label-warning" id="qid">2</span> THREE is
						CORRECT
					</h3>
				</div>
				<div class="modal-body">
					<div class="col-xs-3 col-xs-offset-5">
						<div id="loadbar" style="display: none;">
							<div class="blockG" id="rotateG_01"></div>
							<div class="blockG" id="rotateG_02"></div>
							<div class="blockG" id="rotateG_03"></div>
							<div class="blockG" id="rotateG_04"></div>
							<div class="blockG" id="rotateG_05"></div>
							<div class="blockG" id="rotateG_06"></div>
							<div class="blockG" id="rotateG_07"></div>
							<div class="blockG" id="rotateG_08"></div>
						</div>
					</div>

					<div class="quiz" id="quiz" data-toggle="buttons">
						<label class="element-animation1 btn btn-lg btn-primary btn-block">
							<span class="btn-label"> 
								<i class="glyphicon glyphicon-chevron-right"></i>
							</span> 
							<input type="radio" name="q_answer" value="1">
							1 One
						</label> 
						
						<label class="element-animation2 btn btn-lg btn-primary btn-block">
							<span class="btn-label">
								<i class="glyphicon glyphicon-chevron-right"></i>
							</span> 
							<input type="radio" name="q_answer" value="2">
							2 Two
						</label> 
						
						<label class="element-animation3 btn btn-lg btn-primary btn-block">
							<span class="btn-label"><i class="glyphicon glyphicon-chevron-right"></i></span> 
							<input type="radio" name="q_answer" value="3">3 Three
							</label> 
						<label
							class="element-animation4 btn btn-lg btn-primary btn-block"><span
							class="btn-label"><i
								class="glyphicon glyphicon-chevron-right"></i></span> <input
							type="radio" name="q_answer" value="4">4 Four</label>
					</div>
				</div>
				<div class="modal-footer text-muted">
					<span id="answer"></span>
				</div>
			</div>
		</div>
	</div>
</body>

</html>