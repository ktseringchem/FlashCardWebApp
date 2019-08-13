<%@page import="java.util.Collections"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="com.flashcardapp.entities.FlashCards"%>
<%@page import="com.flashcardapp.entities.Flashcarduser"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Random"%>
<%@page import="com.flashcardapp.service.CardServices"%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">

<title>Welcome page</title>

<!-- Bootstrap CSS -->
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">

<!-- custum CSS -->
<link href="<c:url value="/resources/css/style-quiz.css" />"
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
			<li><a href="QuizPage">quiz</a></li>
			<li><a href="Logout">Logout</a></li>
		</ul>
		<div class="burger">
			<div class="line1"></div>
			<div class="line2"></div>
			<div class="line3"></div>
		</div>
	</nav>

	<%
		CardServices cService = new CardServices();
		List<FlashCards> flashcardlist = cService.getAllFlashCard();

		int i = 1;
		for (FlashCards fc : flashcardlist.subList(0, 7)) {
			List<String> fc_list = cService.fiveRandomCard();
			fc_list.add(fc.getBack());
			Collections.shuffle(fc_list);
			int correctANS = fc_list.indexOf(fc.getBack());
			
	%>
	<div class="container-fluid bg-info" id="" style="">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h3>
						<span class="label label-warning" id="qid"><%=i%></span> Define
						<%=fc.getFront()%>
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
						<input type="hidden" id="correctANS" value="<%=correctANS%>" />
						
						<label class="element-animation1 btn btn-lg btn-primary btn-block">
							<span class="btn-label"> <i class="glyphicon glyphicon-chevron-right"></i></span> 
							<input type="radio" name="q_answer" value="0"> 
							1. <%=fc_list.get(0)%>
						</label> 
						
						
						<label class="element-animation2 btn btn-lg btn-primary btn-block">
							<span class="btn-label"> <i class="glyphicon glyphicon-chevron-right"></i></span> 
							<input type="radio" name="q_answer" value="1"> 
							2. <%=fc_list.get(1)%>
						</label> 
						
						<label
							class="element-animation3 btn btn-lg btn-primary btn-block">
							<span class="btn-label"> <i
								class="glyphicon glyphicon-chevron-right"></i>
						</span> <input type="radio" name="q_answer" value="2"> 3. <%=fc_list.get(2)%>
						</label> 
						
						<label
							class="element-animation4 btn btn-lg btn-primary btn-block">
							<span class="btn-label"> <i
								class="glyphicon glyphicon-chevron-right"></i>
						</span> <input type="radio" name="q_answer" value="3"> 4. <%=fc_list.get(3)%>
						</label> 
						
						<label
							class="element-animation5 btn btn-lg btn-primary btn-block">
							<span class="btn-label"> <i
								class="glyphicon glyphicon-chevron-right"></i>
						</span> <input type="radio" name="q_answer" value="4"> 5.
							<%=fc_list.get(4)%>
						</label>
					</div>
				</div>
				<div id="answerhouse" class="modal-footer text-muted">
					<span id="answer"></span>
				</div>
			</div>
		</div>
	</div>
	<%
		i++;
		}
	%>

<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

<script type="text/javascript"
	src="<c:url value="/resources/script/js-quiz.js" />"></script>
</body>

</html>