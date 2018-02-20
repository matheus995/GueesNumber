<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="entities.Game"%>
<%-- <%@ page session="false"%> --%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Guess Game</title>
<!-- <link rel="stylesheet" href="css/global.css" /> -->
</head>
<%
Game g = new Game();
g = (Game) request.getAttribute("game");
%>
<body>
	<fieldset id="fieldset_jogo">
		<legend>JOGO GUESS NUMBER</legend>
		<form action="GuessGame" method="post">
			<div class="campo">
				Digite um número entre
				<%=g.getNumDicaMenor()%>
				e
				<%=g.getNumDicaMaior() %><label for="number"></label> <input
					type="number" id="numero" name="numero" />
			</div>

			<div class="campo">
				<input type="submit" value="Tentar!" />
			</div>
		</form>
	</fieldset>
</body>
</html>