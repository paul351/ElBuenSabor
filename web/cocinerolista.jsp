<%-- 
    Document   : cocinerolista
    Created on : 25/06/2018, 12:38:15 AM
    Author     : Paul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <table class="responsive-table" id="tabla">
        <thead>
          <tr>
              <th>Posicion</th>
              <th>Cliente DNI</th>
              <th>Accion</th>
          </tr>
        </thead>
        </table>
        </div>
        
        <!-- MODAL  -->
        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog modal-sm" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Lista de Pedidos</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">×</span>
                    </button>
                </div>
                <div class="modal-body">
                    <div class="container">
            <table class="responsive-table" id="tabla">
        <thead>
          <tr>
              <th>Posicion</th>
              <th>Cliente DNI</th>
              <th>Accion</th>
          </tr>
        </thead>
        </table>
        </div>
        <div class="container">
            <table class="responsive-table" id="tablamodal">
        <thead>
          <tr>
              <th>Posicion</th>
              <th>Cliente DNI</th>
              <th>Accion</th>
          </tr>
        </thead>
        </table>
        </div>
        
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary" id="saverol">Save Rol</button>
                </div>
            </div>
        </div>
    </div>
        <script src="js/cocinero.js" type="text/javascript"></script>
    </body>
</html>
