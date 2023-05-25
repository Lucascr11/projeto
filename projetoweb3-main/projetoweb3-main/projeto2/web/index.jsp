<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tipspoint</title>
        <link rel="icon" href="img/icone.png"/>
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
       <form action="LoginController" method = "post" id="form-login">           
            <table>
                    <tr>
                        <td width="20%">
                             <img src="img/icone.png" alt="Logotipo" width="200"/>
                            <br>
                            <input type="text" name="user" id="user" class="fields" placeholder="Nome de usuário" required>
                            <br><br>
                            <input type="password" name="pass" id="Pass" class="fields" placeholder="Senha" required>
                            <br><br>

                            <input type="submit" value="entrar"> <h1>cadastrar</h1>
                            <button onclick="window.location.href='cadastro.jsp'">Cadastrar</button>
                        </td>
                        <td  style="border-left: solid; width:80%; text-align: center;">
                            <img src="img/hollow knight.png" alt="" width="200"/>
                            <h1>TipsPoint</h1>
                        </td>
                    </tr>
            </table>
       </form>
    </body>
</html>
