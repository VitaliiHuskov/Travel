<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>User Registration</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link
	href="https://fonts.googleapis.com/css?family=Muli:300,400,600,700"
	rel="stylesheet">

<link rel="stylesheet" href="css/open-iconic-bootstrap.min.css">
<link rel="stylesheet" href="css/animate.css">

<link rel="stylesheet" href="css/owl.carousel.min.css">
<link rel="stylesheet" href="css/owl.theme.default.min.css">
<link rel="stylesheet" href="css/magnific-popup.css">

<link rel="stylesheet" href="css/aos.css">

<link rel="stylesheet" href="css/ionicons.min.css">

<link rel="stylesheet" href="css/bootstrap-datepicker.css">
<link rel="stylesheet" href="css/jquery.timepicker.css">


<link rel="stylesheet" href="css/flaticon.css">
<link rel="stylesheet" href="css/icomoon.css">
<link rel="stylesheet" href="css/style.css">
</head>
<body>

	<nav
		class="navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light"
		id="ftco-navbar">
	<div class="container">
		<a class="navbar-brand" href="index.html">Travel For You</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#ftco-nav" aria-controls="ftco-nav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="oi oi-menu"></span> Menu
		</button>

		<div class="collapse navbar-collapse" id="ftco-nav">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item"><a href="index.html" class="nav-link">Home</a></li>
				<li class="nav-item"><a href="tours.html" class="nav-link">Tours</a></li>
				<li class="nav-item"><a href="hotels.html" class="nav-link">Hotels</a></li>
				<li class="nav-item"><a href="services.html" class="nav-link">Services</a></li>
				<li class="nav-item"><a href="blog.html" class="nav-link">Blog</a></li>
				<li class="nav-item"><a href="login.jsp" class="nav-link">Login</a></li>
				<li class="nav-item active"><a href="userReg.jsp"
					class="nav-link">Registration</a></li>
			</ul>
		</div>
	</div>
	</nav>
	<!-- END nav -->

	<section class="home-slider owl-carousel">
	<div class="slider-item"
		style="background-image: url('images/bg_5.jpg');">
		<div class="container">
			<div class="row slider-text align-items-center">
				<div class="col-md-6" style="margin: 0px auto">
					<h2 class="h4 mb-4" style="text-align: center">
						<font color="white">Registration</font>
					</h2>
					<form action="userReg" method="post">
						<div class="form-group">
							<input type="text" class="form-control" name="firstName"
								placeholder="Your Name">
						</div>
						<div class="form-group">
							<input type="text" class="form-control" name="lastName"
								placeholder="Your Surname">
						</div>
						<div class="form-group">
							<input type="text" class="form-control" name="login"
								placeholder="Your Login">
						</div>
						<div class="form-group">
							<input type="password" class="form-control" name="password"
								placeholder="Password">
						</div>
						<div class="form-group">
							<input type="password" class="form-control"
								placeholder="Confirm Password">
						</div>
						<div class="form-group">
							<input type="email" class="form-control" name="email"
								placeholder="Your Email">
						</div>
						<div class="form-group">
							<input type="date" class="form-control" name="dateOfBirth" id="date">
						</div>
						<div class="form-group">
							<input type="submit" value="Submit"
								class="btn btn-primary py-3 px-5"
								style="margin: 0px auto; display: block">
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	</section>
	<!-- END slider -->
	<footer class="ftco-footer ftco-bg-dark ftco-section">
	<div class="container">
		<div class="row mb-5">
			<div class="col-md">
				<div class="ftco-footer-widget mb-4">
					<h2 class="ftco-heading-2">Voyage Fellow Tourist</h2>
					<p>Far far away, behind the word mountains, far from the
						countries Vokalia and Consonantia, there live the blind texts.</p>
				</div>
			</div>
			<div class="col-md">
				<div class="ftco-footer-widget mb-4">
					<h2 class="ftco-heading-2">Book Now</h2>
					<ul class="list-unstyled">
						<li><a href="#" class="py-2 d-block">Flight</a></li>
						<li><a href="#" class="py-2 d-block">Hotels</a></li>
						<li><a href="#" class="py-2 d-block">Tour</a></li>
						<li><a href="#" class="py-2 d-block">Car Rent</a></li>
						<li><a href="#" class="py-2 d-block">Beach &amp; Resorts</a></li>
						<li><a href="#" class="py-2 d-block">Mountains</a></li>
						<li><a href="#" class="py-2 d-block">Cruises</a></li>
					</ul>
				</div>
			</div>
			<div class="col-md">
				<div class="ftco-footer-widget mb-4">
					<h2 class="ftco-heading-2">Top Deals</h2>
					<ul class="list-unstyled">
						<li><a href="#" class="py-2 d-block">Luxe Hotel</a></li>
						<li><a href="#" class="py-2 d-block">Venice Tours</a></li>
						<li><a href="#" class="py-2 d-block">Deluxe Hotels</a></li>
						<li><a href="#" class="py-2 d-block">Boracay Beach &amp;
								Resorts</a></li>
						<li><a href="#" class="py-2 d-block">Beach &amp; Resorts</a></li>
						<li><a href="#" class="py-2 d-block">Fuente Villa</a></li>
						<li><a href="#" class="py-2 d-block">Japan Tours</a></li>
						<li><a href="#" class="py-2 d-block">Philippines Tours</a></li>
					</ul>
				</div>
			</div>
			<div class="col-md">
				<div class="ftco-footer-widget mb-4">
					<h2 class="ftco-heading-2">Contact Information</h2>
					<ul class="list-unstyled">
						<li><a href="#" class="py-2 d-block">198 West 21th
								Street, Suite 721 New York NY 10016</a></li>
						<li><a href="#" class="py-2 d-block">+ 1235 2355 98</a></li>
						<li><a href="#" class="py-2 d-block">info@yoursite.com</a></li>
						<li><a href="#" class="py-2 d-block">email@email.com</a></li>
					</ul>
				</div>
			</div>
			<div class="col-md">
				<div class="ftco-footer-widget mb-4">
					<ul
						class="ftco-footer-social list-unstyled float-md-right float-lft">
						<li class="ftco-animate"><a href="#"><span
								class="icon-twitter"></span></a></li>
						<li class="ftco-animate"><a href="#"><span
								class="icon-facebook"></span></a></li>
						<li class="ftco-animate"><a href="#"><span
								class="icon-instagram"></span></a></li>
					</ul>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12 text-center">

				<p>
					<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
					Copyright &copy;
					<script>
						document.write(new Date().getFullYear());
					</script>
					All rights reserved | This template is made with <i
						class="icon-heart" aria-hidden="true"></i> by <a
						href="https://colorlib.com" target="_blank">Colorlib</a>
					<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
				</p>
			</div>
		</div>
	</div>
	</footer>



	<!-- loader -->
	<div id="ftco-loader" class="show fullscreen">
		<svg class="circular" width="48px" height="48px"> <circle
			class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4"
			stroke="#eeeeee" /> <circle class="path" cx="24" cy="24" r="22"
			fill="none" stroke-width="4" stroke-miterlimit="10" stroke="#F96D00" /></svg>
	</div>


	<script src="js/jquery.min.js"></script>
	<script src="js/jquery-migrate-3.0.1.min.js"></script>
	<script src="js/popper.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.easing.1.3.js"></script>
	<script src="js/jquery.waypoints.min.js"></script>
	<script src="js/jquery.stellar.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/jquery.magnific-popup.min.js"></script>
	<script src="js/aos.js"></script>
	<script src="js/jquery.animateNumber.min.js"></script>
	<script src="js/bootstrap-datepicker.js"></script>
	<script src="js/jquery.timepicker.min.js"></script>
	<script
		src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false"></script>
	<script src="js/google-map.js"></script>
	<script src="js/main.js"></script>


</body>
</html>
