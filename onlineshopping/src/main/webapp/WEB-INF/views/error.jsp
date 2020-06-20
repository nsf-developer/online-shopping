<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min2.css" rel="stylesheet">

<!-- Bootstrap Litera Theme -->
<link href="${css}/bootstrap.readable.theme.css" rel="stylesheet">

<link href="${css}/dataTables.bootstrap4.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/myapp5.css" rel="stylesheet">

<title>Online Shopping - ${title}</title>

</head>

<body>

	<div class="wrapper">

		<nav class="navbar navbar-inverse" role="navigation">
			<div class="container">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
					<a class="navbar-brand" href="${contextRoot}/home">Home</a>
				</div>
			</div>
		</nav>

		<div class="content">
			<div class="container">
				<div class="row">
					<div class="col-xs-12">

						<div class="jumbotran">

							<h1>${errorTitle}</h1>
							<hr/>

							<blockquote style="word-wrap: break-word">
								${errorDescription}</blockquote>

						</div>

					</div>
				</div>
			</div>
		</div>

		<%@include file="./shared/footer.jsp"%>

	</div>

</body>

</html>
