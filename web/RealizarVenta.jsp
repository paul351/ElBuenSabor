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
        </div>
    <div class="container ">
        <table class="highlight" id="tablita">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>NOMBRE</th>
                    <th>APELLIDO</th>
                    <th>DNI</th>
                    <th>FECHA</th>
                    <th>MAS</th>
                </tr>
            </thead>

            <tbody>

                

            </tbody>
        </table>
    </div>

        
        <div id="contenedor">
            
        </div>
    <!-- Modal Structure -->
    <div id="modal1" class="modal">


        <div class="container" >
            <h3 style="margin-top: 30px;">DetalleVenta</h3>
            <table class="highlight" id="reyna">
                <thead>
                    <tr>
                        <th>Nombre</th>
                        <th>Cantidad</th>
                        <th>Precio</th>
                        <th>Subtotal</th>
                    </tr>
                </thead>

                <tbody>
                    
                </tbody>
            </table>
            

            <div class="row">
                <div class="input-field col s9">
                                  

                </div>
                <div class="input-field col s1">
                    <label>Total:</label>
                </div>
                <div class="input-field col s2">
                    <input id="total" type="text" class="validate" disabled="true">
                </div>
            </div>

            
            <div class="modal-footer">



                <a href="#!" id="aceptarpedido"  class=" modal-action modal-close waves-effect waves-green   btn waves-effect waves-light" 
                   onclick="maincra();">Aceptar</a>
                <a href="#!" class=" modal-action modal-close waves-effect waves-green   btn waves-effect waves-light">Cancelar</a>
            </div>
        </div>
    </div>
        
        
        
        
        <%@include file="WEB-INF/template/footer.jspf" %>
        <script src="js/pedido.js" type="text/javascript"></script>
        <script>
        $(document).ready(function() {
            $('.modal').modal();
        });
        </script>
    </body>
</html>
