<%-- 
    Document   : menu
    Created on : 07/06/2015, 11:07:37 AM
    Author     : WIEXME
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <jsp:useBean id="usuario" scope="request" class="java.lang.String" />
    <jsp:useBean id="dato" scope="request" class="java.lang.String" />
    <jsp:useBean id="idUsuario" scope="session" class="java.lang.String" />
    <jsp:useBean id="user" scope="request" class="ejemplo03.modelo.bean.Usuario" />
    <%
        if(idUsuario.equals("")){
            response.sendRedirect("error.jsp");
        }
    %>
    <body>
        <h1>Bienvebido Usuario: <%=usuario%></h1>
        <br><br>
        <%=dato%>
        <br><br>
        ID Session: <%=idUsuario%>
        <br><br>
        -------------------------<br>
        NOMBRE:<%=user.getNombre()%><br>
        EDAD:<%=user.getEdad()%><br>
        ESTADO:<%=user.getEstado()%><br>
        -------------------------<br>
        <br><br>
        [<a href="cerrar"> Cerrar Session</a>]
    </body>
</html>
