<%@page import="java.util.Collections"%>
<%@page import="com.flashcardapp.entities.FlashCards"%>
<%@page import="java.util.List"%>
<%@page import="com.flashcardapp.service.CardServices"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">

<title>Welcome page</title>

<link rel="stylesheet"
	href="<c:url value="/resources/css/style-userProfile.css" />">
<base>

</head>

<body>

	<div id="container">
		<div id="start">Start Quiz!</div>
		<div id="quiz" style="display: none">
			<div id="question"></div>
			<div id="qImg"></div>
			<div id="choices">
				<div class="choice" id="A" onclick="checkAnswer('A')"></div>
				<div class="choice" id="B" onclick="checkAnswer('B')"></div>
				<div class="choice" id="C" onclick="checkAnswer('C')"></div>
			</div>
			<div id="timer">
				<div id="counter"></div>
				<div id="btimeGauge"></div>
				<div id="timeGauge"></div>
			</div>
			<div id="progress"></div>
		</div>
		<div id="scoreContainer" style="display: none"></div>
	</div>

	<script type="text/javascript">
//create our questions
let questions = [
	<%CardServices cService = new CardServices();
			List<FlashCards> flashcardlist = cService.getAllFlashCard();

			int i = 1;
			for (FlashCards fc : flashcardlist.subList(0, 7)) {
				List<String> fc_list = cService.fiveRandomCard();
				fc_list.add(fc.getBack());
				Collections.shuffle(fc_list);
				int correctANS = fc_list.indexOf(fc.getBack());
				System.out.println(correctANS);%>
    {
        question : "Define <%=fc.getFront()%>",
        imgSrc : "img/html.png",
        choiceA : "Correct",
        choiceB : "Wrong",
        choiceC : "Wrong",
        correct : "A"
    },
    <%i++;
			}%>
];

</script>
	<script type="text/javascript"
		src="<c:url value="/resources/script/js-userProfile.js" />"></script>

</body>

</html>