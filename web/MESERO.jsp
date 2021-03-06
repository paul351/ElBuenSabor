

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>El Buen Sabor - Mesero</title>
        <%@include file="WEB-INF/template/header.jspf" %>      
    </head>
    <body>
        <nav>
            <div class="nav-wrapper">
                <a href="#" class="brand-logo center waves-effect">EL BUEN SABOR</a>
                <ul id="nav-mobile" class="left hide-on-med-and-down">
                    <li><a id="crear_user" class="waves-effect waves-light btn-large tooltipped" data-position="bottom" data-tooltip="Crear Usuario"><i class="material-icons">add_circle_outline</i></a></li>
                    <li><a id="crear_pedi" class="waves-effect waves-light btn-large tooltipped" data-position="bottom" data-tooltip="Crear Pedido"><i class="material-icons">shopping_cart</i></a></li>
                </ul>
                <ul id="nav-mobile" class="right hide-on-med-and-down">
                    <li><a href="index.jsp" class="waves-effect waves-light btn-large tooltipped" data-position="bottom" data-tooltip="Cerrar Sesión"><i class="material-icons">exit_to_app</i></a></li>
                </ul>
            </div>
        </nav>
        <div id="contenedor">
        </div>
        <div id="modal1" class="modal">
            <div class="modal-content">
                <h4>CREAR PEDIDO</h4>
                <div id="cont_modal">
                    <div class="input-field col s12">
                        <input id="dni_c" type="text" class="validate">
                        <label for="dni_c">DNI</label>
                    </div>
                    <div class="input-field col s12">
                        <table id="data-table-row-grouping" class="display" cellspacing="0" width="100%">
                            <thead>
                                <tr>
                                    <th>PRODUCTO</th>
                                    <th>CANTIDAD</th>
                                </tr>
                            </thead>
                            <tbody id="data_xd"></tbody>
                        </table>
                    </div>
                </div>
                <a id="nuevo_crear" class="modal-close btn waves-effect waves-light">Crear Pedido
                    <i class="material-icons"></i>
                </a>
            </div>
        </div>
        <%@include file="WEB-INF/template/footer.jspf" %>
        <script src="js/reniec-sunat-js.min.js" type="text/javascript"></script>
        <script src="js/MESERO.js" type="text/javascript"></script>   
    </body>
</html>