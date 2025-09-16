<%-- 
    Document   : resultado
    Created on : 16 sept 2025, 11:51:39
    Author     : Nelson Molina Ramos
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="css/estilos.css">

    <title>Resultado</title>
</head>
<body>
    <h1>Tu personaje: ${raza}</h1>

    <img src="${imagen}" alt="${raza}" width="200">

    <ul>
        <li><strong>Arma:</strong> ${arma}</li>
        <li><strong>Armadura:</strong> ${armadura}</li>
        <li><strong>Cuerpo:</strong> ${cuerpo}</li>
        <li><strong>Montura:</strong> ${montura}</li>
    </ul>

    <a href="index.jsp">Elegir otro personaje</a>
</body>
</html>
