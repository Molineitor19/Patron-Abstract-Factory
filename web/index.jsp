<%-- 
    Document   : index
    Created on : 16 sept 2025, 11:51:07
    Author     : Nelson Molina Ramos
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="css/estilos.css">

    <title>Selecciona tu personaje</title>
</head>
<body>
    <h1>Elige un personaje</h1>
    <form action="PersonajeServlet" method="post">
        <select name="raza" required>
            <option value="ELFO">Elfo</option>
            <option value="ENANO">Enano</option>
            <option value="HUMANO">Humano</option>
            <option value="ORCO">Orco</option>
        </select>
        <button type="submit">Ver personaje</button>
    </form>
</body>
</html>
