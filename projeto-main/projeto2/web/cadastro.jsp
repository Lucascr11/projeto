<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar</title>
        <link rel="icone" href="imj/icone.png"/>
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <h1>Cadastrar</h1>
        <hr>
        <h2>Novo cadastro</h2>
        <form action="LoginController" method="post">
            <input type="varchar" nome="" placeholder="Nome de úsuario" required>
            <br><br>
            
            <input type="text" name="senha" placeholder="Senha" min="1" required>
            <br><br>
            
            <br><br>
            <input type="submit" value="Cadastrar">
            
        </form>
        
        <br><hr>
        <a href="home.jsp">Página inicial</a>
    </body>
</html>