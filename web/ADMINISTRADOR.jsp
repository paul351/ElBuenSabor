<%-- 
    Document   : CAJA
    Created on : 25/06/2018, 01:08:08 AM
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
      <body class="has-fixed-sidenav">
        
      <div class="navbar-fixed">
          
          <nav class="navbar cyan darken-1">
          <div class="nav-wrapper"><a href="#!" class="brand-logo grey-text text-darken-4"></a>
            <ul id="nav-mobile" class="right">
               
                  
                  <li>
                      
                      
                      <input value="" type="text" id="nombre">
                  </li>
                  
       
              <li><a href="#!" data-target="chat-dropdown" class="dropdown-trigger waves-effect"><i class="material-icons">settings</i></a></li>
            </ul><a href="#!" data-target="sidenav-left" class="sidenav-trigger left"><i class="material-icons black-text">menu</i></a>
            <ul id="nav-mobile" class="left">
                
             
                <li><a href="#!" data-target="chat-dropdown" class="dropdown-trigger waves-effect"><i class="material-icons left">account_circle</i>ADMINISTRADOR</a></li>
               
            </ul>    
          </div>
          </nav>
      </div>
                 
        <ul id="sidenav-left" class="sidenav sidenav-fixed " style="width:50px;margin-top: 64px;">
         
        
         
          <ul class="collapsible collapsible-accordion " >
              
                  <li class="bold waves-effect waves-light waves-button-input" style="width: 100%;"><a class="collapsible-header tooltipped" onclick="url( 'producto.jsp' );"
                                                                                                       data-position="right" data-tooltip="Gestion Producto"><i class="material-icons left">add_box</i></a>
             
                  </li>
                      
           
                  <li class="bold waves-effect waves-light waves-button-input" style="width: 100%;"><a class="collapsible-header tooltipped" onclick="url( 'RealizarVenta.jsp' );"
                                                                                                       data-position="right" data-tooltip="Gestion Persona"><i class="material-icons left">accessibility</i></a>

                  </li>
                  <li class="bold waves-effect waves-light waves-button-input" style="width: 100%;"><a class="collapsible-header tooltipped" onclick="url( 'RealizarVenta.jsp' );"
                                                                                                       data-position="right" data-tooltip="Function Ventas"><i class="material-icons left">assistant</i></a>

                  </li>
                  <li class="bold waves-effect waves-light waves-button-input" style="width: 100%;"><a class="collapsible-header tooltipped" onclick="url( 'RealizarVenta.jsp' );"
                                                                                                       data-position="right" data-tooltip="Realizar Venta"><i class="material-icons left">book</i></a>

                  </li>
                  <li class="bold waves-effect waves-light waves-button-input" style="width: 100%;"><a class="collapsible-header tooltipped" onclick="url( 'RealizarVenta.jsp' );"
                                                                                                       data-position="right" data-tooltip="Realizar Venta"><i class="material-icons left">card_travel</i></a>

                  </li>
        
               
               
             <li class="bold waves-effect " style="width: 100%;"><a class="collapsible-header tooltipped" data-position="bottom" data-tooltip="Cerrar Sesión"><i class="material-icons chevron">chevron_left</i></a>
              <div class="collapsible-body">
                
              </div>
             </li>
          </ul>   
      </ul>  
        
        
        
       
      
       

          <iframe src="" height="1000px;" width="100%" id="a" style="border:none; "></iframe>

         
      
        
        <%@include file="WEB-INF/template/footer.jspf" %>
        <script>
             $(document).ready(function () {
                $('.tooltipped').tooltip();
                $(".button-collapse").sideNav();
            });
            function url( cUrl )
{
	var a = document.getElementById( 'a' );
	a.src = cUrl;
}
            
            
        </script>
    </body>
</html>
