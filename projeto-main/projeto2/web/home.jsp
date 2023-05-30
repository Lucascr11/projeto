<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TipsPoint</title>
        <link rel="icone" href="img/icone.png"/>
        <link rel="stylesheet" href="css/style.css"/>
    </head>
    <body>
        <table>
            <thead>
            </thead>
            <tbody>
              <%
                    TransporteDAO tdao = new TransporteDAO();
                    for(Transporte item : tdao.listTransporte()){
                    %>
                <tr>
                    <td><%= item.getCodPosts() %></td>
                    <td><%= item.getConteudo()%></td>
                    <td>
                        <a href="Update posts?cod=<%= item.getCodPosts() %>">✏</a>
                    </td>
                    <td>
                        <a onclick="confirmaDelete(<%= item.getCodPosts() %>)">🚫</a>
                    </td>
                </tr>
              <%
                    }
                    %>
            </tbody>
        </table>
            <hr>
            <button onclick="newpost.jsp">Novo post</button>
    </body>
</html>
