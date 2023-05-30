<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New post</title>
        <link rel="stylesheet" href="css/style.css"/>
        <link rel="icone" href="img/icone.png"/>
    </head>
    <body>
        <h1>Post</h1>
        <hr>
        <h2>Novo post</h2>
        <form action="PostsController" method="post">
            
            <input type="text" name="post" placeholder="Texto do post" required>
            <br><br>
       
            <input type="submit" value="Publicar">
            
        </form>
        
        <br><hr>
        <a href="home.jsp">Página inicial</a>
    </body>
</html>
