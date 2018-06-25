<%-- 
    Document   : RealizarVenta
    Created on : 25/06/2018, 07:35:17 AM
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <%@include file="WEB-INF/template/header.jspf" %> 
    </head>
    <body>
        <div class="container">
        <h3>Registrar Venta</h3>
        <div class="row">
        <div class="input-field col s6">
            <input id="last_name" type="text" class="validate">
            <label for="last_name">Ingrese DNI</label>
        </div>
        </div>
    </div>


    <div class="container ">
        <table class="highlight">
            <thead>
                <tr>
                    <th>Nombre</th>
                    <th>Fecha</th>
                    <th>Loco</th>
                    <th>Loco</th>
                    <th>Maincra</th>
                </tr>
            </thead>

            <tbody>

                <tr>
                    <td>Alvin</td>
                    <td>asd</td>
                    <th>Locos</th>
                    <td>asd</td>
                    <td><button data-target="modal1" class="btn-floating btn-large waves-effect waves-light red modal-trigger">
                        
                        
                        <i class="material-icons">remove_red_eye</i>
                        
                    </button></td>

                </tr>

            </tbody>
        </table>
    </div>

    <!-- Modal Structure -->
    <div id="modal1" class="modal">


        <div class="container" >
            <h3 style="margin-top: 30px;">Holu :,v</h3>
            <table class="highlight">
                <thead>
                    <tr>
                        <th>Nombre</th>
                        <th>Precio</th>
                        <th>Cantidad</th>
                    </tr>
                </thead>

                <tbody>
                    <tr>
                        <td>Alvin</td>
                        <td>Eclair</td>
                        <td>$0.87</td>
                    </tr>
                    <tr>
                        <td>Alan</td>
                        <td>Jellybean</td>
                        <td>$3.76</td>
                    </tr>
                    <tr>
                        <td>Jonathan</td>
                        <td>Lollipop</td>
                        <td>$7.00</td>
                    </tr>
                </tbody>
            </table>








            <div class="modal-footer">



                <a href="#!" class=" modal-action modal-close waves-effect waves-green   btn waves-effect waves-light">Aceptar</a>
                <a href="#!" class=" modal-action modal-close waves-effect waves-green   btn waves-effect waves-light">Cancelar</a>
            </div>
        </div>
    </div>
        
        
        
        
        <%@include file="WEB-INF/template/footer.jspf" %>
         <script>
        $(document).ready(function() {
            $('.modal').modal();
        });

    </script>
    </body>
</html>
