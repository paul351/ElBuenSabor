<%-- 
    Document   : GestionProducto
    Created on : 25/06/2018, 09:03:58 AM
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
            <h3>Gestionar Producto</h3>
            <div class="row">
                <div class="input-field col s6">
                    
                </div>
            </div>
        </div>


        <div class="container ">
            <table class="highlight" id="tablita">
                <thead>
                    <tr>
                        <th>#</th>
                        <th>ID</th>
                        <th>Nombre</th>
                        <th>Precio</th>
                        <th>Editar</th>
                        <th>Eliminar</th>
                    </tr>
                </thead>

                <tbody>

                    <tr>

                    </tr>

                </tbody>
            </table>
        </div>

        <!-- Modal Structure -->
        <div id="modal1" class="modal">



            <div class="container">
                <h3>Editar Producto</h3>
                <input id="nombree" type="text">
                <input id="precioo" type="text">
            </div>





            <div class="modal-footer">



                <a href="#!" class=" modal-action modal-close waves-effect waves-green   btn waves-effect waves-light">Aceptar</a>
                <a href="#!" class=" modal-action modal-close waves-effect waves-green   btn waves-effect waves-light">Cancelar</a>
            </div>
        </div>
    </div>




    <%@include file="WEB-INF/template/footer.jspf" %>
    <script>
        $(document).ready(function () {
            $('.modal').modal();
        });
    </script>

    <script src="js/producto.js" type="text/javascript"></script>

</body>
</html>
