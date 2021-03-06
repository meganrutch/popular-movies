<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Flickr Movie Website</title>
</head>
<style>
#movieBox {
	float: left
}

#movieBox #popup {
	display: none;
	position: absolute;
	width: 200px;
	background-color: grey;
}

#movieBox:hover #popup {
	display: block;
}
</style>

<body>
	<header> Popular Movie Page </header>
	<c:forEach var="movie" items="${popularMovies}">
		<figure id="movieBox">
			<img
				src="https://thumbs.dreamstime.com/b/movie-illustration-logo-vector-design-film-178252125.jpg"
				style="width: 200px; height: 200px; border: 2px solid #000; background-color: blue">
			<figcaption>
				<center>${movie.getTitle()}</center>
			</figcaption>
			<div id="popup">${movie.getSummary()}</div>
		</figure>
	</c:forEach>
	<!--  <figure id="movieBox">
		<img
			src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSqS6A3xRyIZxUzlChgAGLWjRXehBONy5rKAEbJMi-3KetNl1kS-Zogd3HTa4oQoa0SKok&usqp=CAU"
			style="width: 200px; height: 200px; border: 2px solid #000; background-color: blue">
		<figcaption>
			<center>${popularMovies.get(0).getTitle()}</center>
		</figcaption>
		<div id="popup">${popularMovies.get(0).getSummary()}</div>
	</figure>
	<figure id="movieBox">
		<img src="https://m.media-amazon.com/images/I/6198vp6P7nL._SY445_.jpg"
			style="width: 200px; height: 200px; border: 2px solid #000; background-color: blue">
		<figcaption>
			<center>The Goonies</center>
		</figcaption>
		<div id="popup">This is movie descripton popup</div>
	</figure>
	<figure id="movieBox">
		<img
			src="https://m.media-amazon.com/images/M/MV5BZDhlYjk1YzQtZjA2NC00N2E4LTgxMjAtYzFhYWNhNjRlNzBmXkEyXkFqcGdeQXVyNjQ2MjQ5NzM@._V1_.jpg"
			style="width: 200px; height: 200px; border: 2px solid #000; background-color: blue">
		<figcaption>
			<center>Gnomeo and Juliet</center>
		</figcaption>
		<div id="popup">This is movie descripton popup</div>
	</figure>
	<figure id="movieBox">
		<img
			src="https://m.media-amazon.com/images/M/MV5BM2MyNjYxNmUtYTAwNi00MTYxLWJmNWYtYzZlODY3ZTk3OTFlXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_.jpg"
			style="width: 200px; height: 200px; border: 2px solid #000; background-color: blue">
		<figcaption>
			<center>The Godfather</center>
		</figcaption>
		<div id="popup">This is movie descripton popup</div>
	</figure>
	<figure id="movieBox">
		<img
			src="https://m.media-amazon.com/images/M/MV5BM2MyNjYxNmUtYTAwNi00MTYxLWJmNWYtYzZlODY3ZTk3OTFlXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_.jpg"
			style="width: 200px; height: 200px; border: 2px solid #000; background-color: blue">
		<figcaption>
			<center>The Godfather</center>
		</figcaption>
		<div id="popup">This is movie descripton popup</div>
	</figure>
-->



</body>
</html>