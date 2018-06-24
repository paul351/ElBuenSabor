<%-- 
    Document   : ADMINISTRADOR
    Created on : 21/06/2018, 07:00:26 PM
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administrador</title>
        <%@include file="WEB-INF/template/header.jspf" %>      
    </head>
    <body class="has-fixed-sidenav">
        
      <div class="navbar-fixed">
          <nav class="navbar cyan darken-1">
          <div class="nav-wrapper"><a href="#!" class="brand-logo grey-text text-darken-4"></a>
            <ul id="nav-mobile" class="right">
              <li class="hide-on-med-and-down"><a href="#!" data-target="dropdown1" class="dropdown-trigger waves-effect"><i class="material-icons">notifications</i></a></li>
              <li><a href="#!" data-target="chat-dropdown" class="dropdown-trigger waves-effect"><i class="material-icons">settings</i></a></li>
            </ul><a href="#!" data-target="sidenav-left" class="sidenav-trigger left"><i class="material-icons black-text">menu</i></a>
            <ul id="nav-mobile" class="left">
                
                <div class="container">
                <li><a href="#!" data-target="chat-dropdown" class="dropdown-trigger waves-effect"><h4>
                 ELBUENSABOR
                 </h4></a></li>
                 </div>
            </ul>    
          </div>
          </nav>
      </div>
                 
        <ul id="sidenav-left" class="sidenav sidenav-fixed " style="width:250px;margin-top: 64px;">
         
        
         
            <ul class="collapsible collapsible-accordion" style="margin-top:50px;">
              
                 <li class="bold waves-effect waves-light waves-button-input" style="width: 100%;"><a class="collapsible-header">Mantenimiento<i class="material-icons left">party_mode</i><i class="material-icons right">chevron_right</i></a>
              <div class="collapsible-body">
                  <ul>
                  <li><a href="/pages/admin-dashboard" class="waves-effect ">Roles<i class="material-icons">web</i></a></li>
                  <li><a href="/pages/admin-fixed-chart" class="waves-effect">Productos<i class="material-icons">list</i></a></li>
                  <li><a href="/pages/admin-grid" class="waves-effect">Opciones<i class="material-icons">dashboard</i></a></li>
                  <li><a href="/pages/admin-chat" class="waves-effect">Diseños<i class="material-icons">chat</i></a></li>
                </ul>
              </div>
               </li>
               
                <li class="bold waves-effect waves-light" style="width: 100%;"><a class="collapsible-header">Seguridad<i class="material-icons left">visibility_off</i><i class="material-icons right">chevron_right</i></a>
              <div class="collapsible-body">
                <ul>
                  <li><a href="" class="waves-effect ">Cambiar Usuario y Password<i class="material-icons">list</i></a></li>
                  <li><a href="" class="waves-effect">Agregar Nuevo Usuario<i class="material-icons">dashboard</i></a></li>             
                </ul>
              </div>
               </li>
               
                <li class="bold waves-effect waves-light" style="width: 100%;"><a class="collapsible-header">Reportes<i class="material-icons left">assessment</i><i class="material-icons right">chevron_right</i></a>
              <div class="collapsible-body">
                <ul>
                  <li><a href="" class="waves-effect ">lorem<i class="material-icons">web</i></a></li>
                  <li><a href="" class="waves-effect">lorem<i class="material-icons">list</i></a></li>
                  <li><a href="" class="waves-effect">lorem<i class="material-icons">dashboard</i></a></li>
                  <li><a href="" class="waves-effect">lorem<i class="material-icons">chat</i></a></li>
                </ul>
              </div>
               </li>
               
                
               
                <li class="bold waves-effect waves-light" style="width: 100%;"><a class="collapsible-header">Pedidos<i class="material-icons left">add_shopping_cart</i><i class="material-icons right">chevron_right</i></a>
              <div class="collapsible-body">
                <ul>
                  <li><a href="" class="waves-effect ">lorem<i class="material-icons">web</i></a></li>
                  <li><a href="" class="waves-effect">lorem<i class="material-icons">list</i></a></li>
                  
                </ul>
              </div>
               </li>
               
               
               <li class="bold waves-effect " style="width: 100%;"><a class="collapsible-header">Cerrar Cesion<i class="material-icons chevron">chevron_left</i></a>
              <div class="collapsible-body">
                
              </div>
               </li>
          </ul>   
      </ul>  
        
        
        
       
      <div class="container" style="margin-left:250px;border:2px #000 solid;" >
         <h1>Maincra</h1>      
      </div>
        
        
        
        
        <%@include file="WEB-INF/template/footer.jspf" %>
        
        <script>
            $(document).ready(function(){
            $('.collapsible').collapsible();
            });
            
            
        </script>       
    </body>
</html>
