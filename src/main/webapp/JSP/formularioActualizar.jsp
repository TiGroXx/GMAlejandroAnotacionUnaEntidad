<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:directive.page pageEncoding="UTF-8" contentType="text/html" />

<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar</title>
        <link rel="stylesheet" type="text/css" href="${estilo}" />
    </head>
    <body>

        <div id="principal">
            <h2>Actualizaci&oacute;n de datos</h2>
        <form method="post" action="conclusion?op=update">
            <table>
                <tr>
                    <td>Código</td>
                    <td><input type="text" name="id" value="${profesor.id}" readonly="readonly" /></td>
                </tr>
                <tr>
                    <td>Nombre</td>
                    <td><input type="text" name="nombre" value="${profesor.nombre}" /></td>
                </tr>
                <tr>
                    <td>Apellido 1</td>
                    <td><input type="text" name="ape1" value="${profesor.ape1}" /></td>
                </tr>
                <tr>
                    <td>Apellido 2</td>
                    <td><input type="text" name="ape2" value="${profesor.ape2}" /></td>
                </tr>
                <tr>
                    
                    <td colspan="2"><input type="submit" name="enviar" value="Enviar" class="boton" /></td>
                </tr>
            </table>
        </form>
        </div>


    </body>
</html>