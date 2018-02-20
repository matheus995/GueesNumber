<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
<%@ page session="false" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tela de Login</title>
<link rel="stylesheet" href="css/global.css"/>
</head>
<body>
	<fieldset id="fieldset_login">
		<legend>Login do Sistema</legend>
		<form action="Logar" method="post">
			<div class="campo">
				E-mail: <label for="emails"></label> <input type="text" id="email"
					name="email" />
			</div>

			<div class="campo">
				Senha: <label for="senha"></label> <input type="password" id="senha"
					name="senha" />
			</div>

			<div class="campo">
				<input type="submit" value="Logar" />
			</div>
		</form>
		<form method="post" action="CadastroPosLogin.jsp">
			<div class="campo">
				<input type="submit" value="Cadastro" />
			</div>
		</form>
	</fieldset>
</body>
</html>