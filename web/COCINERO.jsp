
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ElBuenSabor - Cocinero</title>
        <%@include file="WEB-INF/template/header.jspf" %>      
    </head>
    <body>
        <nav>
            <div class="nav-wrapper">
                <a href="#" class="brand-logo center waves-effect">EL BUEN SABOR</a>
                <ul id="nav-mobile" class="left hide-on-med-and-down">
                    <li><a  id="listar_pedido" class="waves-effect waves-light btn-large tooltipped" data-position="bottom" data-tooltip="Listar Pedido"><i class="material-icons">add_circle_outline</i></a></li>
                </ul>
                <ul id="nav-mobile" class="right hide-on-med-and-down">
                    <li><a href="index.jsp" class="waves-effect waves-light btn-large tooltipped" data-position="bottom" data-tooltip="Cerrar Sesión"><i class="material-icons">exit_to_app</i></a></li>
                </ul>
            </div>
        </nav>
        <div id="contenedor">
        </div>
        <%@include file="WEB-INF/template/footer.jspf" %>
        <script src="js/cocinero.js" type="text/javascript"></script>
              
    </body>
</html>
