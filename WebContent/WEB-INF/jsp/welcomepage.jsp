<%@page import="com.flashcardapp.entities.FlashCards"%>
<%@page import="java.util.List"%>
<%@page import="com.flashcardapp.service.CardServices"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
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
	
<link rel="stylesheet" href="<c:url value="/resources/css/style-welcomepage.css"/>" />
<script type="text/javascript" src="<c:url value="/resources/script/js-welcomepage.js"/>"></script>
</head>

<body>
	<!-- Navigation -->
	<nav
		class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark fixed-top">
		<div class="container">
			<a class="navbar-brand" href="index.html">Start Bootstrap</a>
			<button class="navbar-toggler navbar-toggler-right" type="button"
				data-toggle="collapse" data-target="#navbarResponsive"
				aria-controls="navbarResponsive" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item"><a class="nav-link" href="about.html">About</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="services.html">Services</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="contact.html">Contact</a>
					</li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#"
						id="navbarDropdownPortfolio" data-toggle="dropdown"
						aria-haspopup="true" aria-expanded="false"> Portfolio </a>
						<div class="dropdown-menu dropdown-menu-right"
							aria-labelledby="navbarDropdownPortfolio">
							<a class="dropdown-item" href="portfolio-1-col.html">1 Column
								Portfolio</a> <a class="dropdown-item" href="portfolio-2-col.html">2
								Column Portfolio</a> <a class="dropdown-item"
								href="portfolio-3-col.html">3 Column Portfolio</a> <a
								class="dropdown-item" href="portfolio-4-col.html">4 Column
								Portfolio</a> <a class="dropdown-item" href="portfolio-item.html">Single
								Portfolio Item</a>
						</div></li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdownBlog"
						data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
							Blog </a>
						<div class="dropdown-menu dropdown-menu-right"
							aria-labelledby="navbarDropdownBlog">
							<a class="dropdown-item" href="blog-home-1.html">Blog Home 1</a>
							<a class="dropdown-item" href="blog-home-2.html">Blog Home 2</a>
							<a class="dropdown-item" href="blog-post.html">Blog Post</a>
						</div></li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdownBlog"
						data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
							Other Pages </a>
						<div class="dropdown-menu dropdown-menu-right"
							aria-labelledby="navbarDropdownBlog">
							<a class="dropdown-item" href="full-width.html">Full Width
								Page</a> <a class="dropdown-item" href="sidebar.html">Sidebar
								Page</a> <a class="dropdown-item" href="faq.html">FAQ</a> <a
								class="dropdown-item" href="404.html">404</a> <a
								class="dropdown-item" href="pricing.html">Pricing Table</a>
						</div></li>
				</ul>
			</div>
		</div>
	</nav>

	<header>
		<div id="carouselExampleIndicators" class="carousel slide"
			data-ride="carousel">
			<ol class="carousel-indicators">
				<li data-target="#carouselExampleIndicators" data-slide-to="0"
					class="active"></li>
				<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
				<li data-target="#carouselExampleIndicators" data-slide-to="2">
				<li data-target="#carouselExampleIndicators" data-slide-to="3"></li>
			</ol>
			<div class="carousel-inner" role="listbox">
				<!-- Slide One - Set the background image for this slide in the line below -->
				<%
					CardServices cService = new CardServices();
					List<FlashCards> flashcardlist = cService.getAllFlashCard();

					int i = 0;
					for (FlashCards fc : flashcardlist.subList(0, 30)) {
						String active = "";
						if(i<1)
						{
							active = "active";
						}
				%>
				<div class="carousel-item <%=active %>"
					style="background-image: url('http://placehold.it/1900x1080')">
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

	<!-- Page Content -->
	<div class="container">
		<div class="container">

			<h1 class="my-4">Welcome ${fullname}</h1>
		</div>

		<!-- create card form -->
		<div class="row createcard">
			<div class="col-lg-12 mb-12" id="addCardForm">
				<form action="createcard">
					<p style="display:;display: block; color: green;">flash card has been
						created refresh to load new cards</p>
					<p style="display: block; color: red;">Flash card has not been
						created, contact your system adminstrator</p>
					<label for="fname">First Name</label> 
					<input type="text" id="fname"
						name="frontcard" placeholder="Front Card"> 
						<label
						for="lname">Last Name</label> <input type="text" id="lname"
						name="backcard" placeholder="Back Card"> 
						<label
						for="country">Country</label> 
						<select id="country" name="country">
						<option value="australia">Australia</option>
					</select> <input type="submit" value="Submit">
				</form>
			</div>
			<!-- /.row -->
			
			<!-- Edit card section  -->
			<div class="row editcard">
			<div class="col-lg-12 mb-12" id="changeCardForm">
				<h3>Edit your cards here</h3>
				<form action="editcard">
					<p style="display:;display: block; color: green;">flash card has been
						created refresh to load new cards</p>
					<p style="display: block; color: red;">Flash card has not been
						created, contact your system adminstrator</p>
					<label for="fname">Front Information</label> 
					<input type="text" id="fname"
						name="frontcard" placeholder="Front Card"> 
						<label
						for="lname">Back Information</label> <input type="text" id="lname"
						name="backcard" placeholder="Back Card"> 
						<label
						for="country">Subject</label> 
						<select id="country" name="country">
						<option value="australia">Australia</option>
					</select> <input type="submit" value="Submit">
				</form>
			</div>
			<!-- /.row -->

			<!-- Portfolio Section -->
			<h2>Portfolio Heading</h2>

			<div class="row">
				<div class="col-lg-3 col-sm-6 portfolio-item">
					<div class="card h-100">
						<p style="font-size: 24px;"><%=flashcardlist.size() %></p>
							</input>
							<div class="card-body">
								<h4 class="card-title">
									<a href="#">Project One</a>
								</h4>
								<p class="card-text">Lorem ipsum dolor sit amet, consectetur
									adipisicing elit. Amet numquam aspernatur eum quasi sapiente
									nesciunt? Voluptatibus sit, repellat sequi itaque deserunt,
									dolores in, nesciunt, illum tempora ex quae? Nihil, dolorem!</p>
							</div>
					</div>
				</div>
				<div class="col-lg-3 col-sm-6 portfolio-item">
					<div class="card h-100">
						<a href="#"><img class="card-img-top"
							src="http://placehold.it/700x400" alt="" /></a>
						<div class="card-body">
							<h4 class="card-title">
								<a href="#">Project Two</a>
							</h4>
							<p class="card-text">Lorem ipsum dolor sit amet, consectetur
								adipiscing elit. Nam viverra euismod odio, gravida pellentesque
								urna varius vitae.</p>
						</div>
					</div>
				</div>
				<div class="col-lg-3 col-sm-6 portfolio-item">
					<div class="card h-100">
						<a href="#"><img class="card-img-top"
							src="http://placehold.it/700x400" alt="" /></a>
						<div class="card-body">
							<h4 class="card-title">
								<a href="#">Project Three</a>
							</h4>
							<p class="card-text">Lorem ipsum dolor sit amet, consectetur
								adipisicing elit. Quos quisquam, error quod sed cumque, odio
								distinctio velit nostrum temporibus necessitatibus et facere
								atque iure perspiciatis mollitia recusandae vero vel quam!</p>
						</div>
					</div>
				</div>
				<div class="col-lg-3 col-sm-6 portfolio-item">
					<div class="card h-100">
						<a href="#"><img class="card-img-top"
							src="http://placehold.it/700x400" alt="" /></a>
						<div class="card-body">
							<h4 class="card-title">
								<a href="#">Project Three</a>
							</h4>
							<p class="card-text">Lorem ipsum dolor sit amet, consectetur
								adipisicing elit. Quos quisquam, error quod sed cumque, odio
								distinctio velit nostrum temporibus necessitatibus et facere
								atque iure perspiciatis mollitia recusandae vero vel quam!</p>
						</div>
					</div>
				</div>
			</div>

			<hr />

			<!-- Call to Action Section -->
			<div class="row mb-4">
				<div class="col-md-8">
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
						Molestias, expedita, saepe, vero rerum deleniti beatae veniam
						harum neque nemo praesentium cum alias asperiores commodi.</p>
				</div>
				<div class="col-md-4">
					<a class="btn btn-lg btn-secondary btn-block" href="#">Call to
						Action</a>
				</div>
			</div>
		</div>
		<!-- /.container -->

		<!-- Footer -->
		<footer class="py-5 bg-dark">
			<div class="container">
				<p class="m-0 text-center text-white">Copyright &copy; Your
					Website 2019</p>
			</div>
			<!-- /.container -->
		</footer>

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