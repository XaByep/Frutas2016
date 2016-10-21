<%@ page import="Poblacion.Municipio" %>
<%@ page import="Poblacion.MunicipioProceso" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="javafx.scene.control.Spinner" %>


<%--
  Created by IntelliJ IDEA.
  User: JAVI
  Date: 20/10/2016
  Time: 13:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>Registro</title>
    <link rel="stylesheet" href="../estilos/estiloRegistro.css">
</head>

<body>

<div id="form-main">
    <div id="form-div">
        <form class="form" id="form1">

            <p class="name">
                <input name="usuario" type="text"
                       class="validate[required,custom[onlyLetter],length[0,100]] feedback-input" placeholder="Usuario"
                       id="name"/>
            </p>
            <p class="email">
                <input name="paswd" type="text" class="validate[required,custom[paswd]] feedback-input" id="paswd"
                       placeholder="Contraseña"/>
            </p>

            <p class="name">
                <input name="name" type="text"
                       class="validate[required,custom[onlyLetter],length[0,100]] feedback-input" placeholder="Nombre"
                       id="nombre"/>
            </p>

            <p class="email">
                <input name="cif" type="text" class="validate[required,custom[cif]] feedback-input" id="cif"
                       placeholder="N.I.F/C.I.F"/>
            </p>

            <p class="email">
                <input name="direccion" type="text" class="validate[required,custom[direccion]] feedback-input"
                       id="direccion" placeholder="Dirección"/>
            </p>

            <p class="email">
                <input name="telefono" type="text" class="validate[required,custom[telefono]] feedback-input"
                       id="telefono" placeholder="Teléfono"/>
            </p>

            <p class="name">
                <%
                    ArrayList<Municipio> lista = new MunicipioProceso().listaMunicipiosArrayList();

                %>
                <select name="cp" class="validate[required,custom[onlyLetter],length[0,100]] feedback-input" id="cp">
                    <%for (Municipio municipio : lista) {%>
                    <option value="<%=municipio.getCodigoPostal()%>"><%=municipio%></option>

                    <%};%>
                </select>
            </p>

            <div class="submit">
                <input type="submit" value="Registrar" id="button-blue"/>
                <div class="ease"></div>
            </div>
        </form>
    </div>
</div>
</body>
</html>
