<%--
  Created by IntelliJ IDEA.
  User: JAVI
  Date: 14/10/2016
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link rel="stylesheet" href="../estilos/login.css">
    <title>Frutas Harnina</title>
</head>
<body>

<% if (session.getAttribute("idSesion") == null) {
    session.setAttribute("idSesion", session.getId());
   }else if(session.getAttribute("idSesion")==session.getId()){
    System.out.println("Todo va bien");
   }
%>

<body>

<div class="container">
    <section id="content">
        <form action="">
            <h1>Iniciar Sesión</h1>
            <div>
                <input type="text" placeholder="Usuario" required="" id="username" />
            </div>
            <div>
                <input type="password" placeholder="Contraseña" required="" id="password" />
            </div>
            <div>
                <input type="submit" value="Iniciar Sesión" />
                <a href="../almacen/registrar.jsp">Registrar</a>
            </div>
        </form><!-- form -->
    </section><!-- content -->
</div>

</body>
</html>
