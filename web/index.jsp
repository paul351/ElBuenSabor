
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>El Buen Sabor</title>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Pacifico" rel="stylesheet"> 
        <link href="https://fonts.googleapis.com/css?family=Yanone+Kaffeesatz" rel="stylesheet"> 
        <link href="css/materialize.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
        <style>
            body {background-color:#555;}
            .navbar-fixed {position: absolute;z-index:999999999;border:none;}
            h1{
                font-family: 'Pacifico', cursive;
                font-size:100px;
            }
        </style>
    </head>
    <body>

        <div class="navbar-fixed z-depth-0" >
            <nav class="transparent z-depth-0" >

                <a href="#!" class="brand-logo" > <img src="images/logo.png" alt="" style="width:80px;height:80px;"/></a>

                <ul class="right hide-on-med-and-down ">
                    <li><a href="index.jsp" style="font-family: 'Yanone Kaffeesatz', sans-serif;font-size: 25px;">Inicio</a></li>
                    <li><a href="badges.html" style="font-family: 'Yanone Kaffeesatz', sans-serif;font-size: 25px;">Sobre Nosotros</a></li>

                    <li><a href="./carta.jsp" style="font-family: 'Yanone Kaffeesatz', sans-serif;font-size: 25px;">Carta</a></li>
                    <li><a href="badges.html" style="font-family: 'Yanone Kaffeesatz', sans-serif;font-size: 25px;font-weight:black;">Locales</a></li>
                    <a class="waves-light btn-large cyan pulse" href="login.jsp">Iniciar Sesion</a>
                </ul>

            </nav>
        </div>

        <section class="slider" style="max-height:1100px;">
            <ul class="slides" style="max-height: 1100px;">
                <li>
                    <img src="./images/slider2.jpg">
                    <!-- random image -->
                    <div class="caption left-align">

                        <h1>Promociones para nuestros clientes</h1>
                        <h5 class="light grey-text text-lighten-3">Muchas promociones por la compra de nuestros platos </h5>
                        <a class="waves-effect light-blue darken-1 btn-large"><i class="material-icons right">cloud</i>Proximamente</a>
                    </div>


                </li>

                <li>
                    <img src="./images/slider2.jpg">
                    <!-- random image -->
                    <div class="caption rigth-align">
                        <h1>Promociones para nuestros clientes</h1>
                        <h5 class="light grey-text text-lighten-3">Lorem ipsum dolor sit amet, consectetur.</h5>
                        <a class="waves-effect light-blue darken-1 btn-large"><i class="material-icons right">cloud</i>Ver mas</a>
                    </div>


                </li>
                <li>
                    <img src="./images/slider3.jpg">
                    <!-- random image -->
                    <div class="caption center-align">
                        <h1>Reconocidos por la marca Peru</h1>
                        <h5 class="light grey-text text-lighten-3"></h5>
                        <div class="container">
                            <a class="waves-effect light-blue darken-1 btn-large"><i class="material-icons right">cloud</i>Ver mas</a>
                        </div>
                    </div>
                </li>
                <li>
                    <img src="./images/slider4.jpg">
                    <!-- random image -->
                    <div class="caption center-align">
                        <h1>Sistema de atención novedoso</h1>
                        <h5 class="light grey-text text-lighten-3">Tratamos a nuestros clientes como nuestros hermanos </h5>
                        <a class="waves-effect light-blue darken-1 btn-large"><i class="material-icons right">cloud</i>Ver mas</a>
                    </div>
                </li>
            </ul>
        </section>


        <div class="section animate">
            <div class="middle">

                <img src="images/chaufa.jpg" alt=""/>

            </div>
            <div class="left title">
                <div class="content">
                    <h2>Servicios</h2>
                    <p>El buen sabor es una restaurante peruano que se dedica al servicio de comida , específicamente comida criolla y chifa , actualmente no cuenta con un sistemas de pedidos y es por eso que se decidió implementar uno allí para así poder reducir el tiempo de espera y automatizar ese proceso.</p>
                </div>
            </div>
            <div class="right tiles">
                <img src="https://images.unsplash.com/photo-1460400408855-36abd76648b9?dpr=2&auto=format&crop=entropy&fit=crop&w=250&h=250&q=80" />
                <img src="https://images.unsplash.com/photo-1460400408855-36abd76648b9?dpr=2&auto=format&crop=entropy&fit=crop&w=250&h=250&q=80" />
                <img src="https://images.unsplash.com/photo-1460400408855-36abd76648b9?dpr=2&auto=format&crop=entropy&fit=crop&w=250&h=250&q=80" />
                <img src="https://images.unsplash.com/photo-1460400408855-36abd76648b9?dpr=2&auto=format&crop=entropy&fit=crop&w=250&h=250&q=80" />
            </div>
        </div>
        <nav class=" blue-grey darken-3"></nav>
        <div class="row">
            <div class="col s12 m4 ">
                <div class="card-panel grey lighten-5 z-depth-1">
                    <div class="row valign-wrapper">
                        <div class="col s2">
                            <img src="images/persona1.jpg" alt="" class="circle responsive-img">
                            <!-- notice the "circle" class -->
                        </div>
                        <div class="col s10">
                            <span class="black-text">
                                Lorem ipsum dolor sit amet, consectetur adipisicing elit. Eos beatae, voluptatum reiciendis dolorum itaque, quod est consectetur dolore officia animi cupiditate aut. Id laudantium vero suscipit, minus nam ducimus placeat.
                            </span>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col s12 m4 ">
                <div class="card-panel grey lighten-5 z-depth-1">
                    <div class="row valign-wrapper">
                        <div class="col s2">
                            <img src="images/persona2.jpg" alt="" class="circle responsive-img">
                            <!-- notice the "circle" class -->
                        </div>
                        <div class="col s10">
                            <span class="black-text">

                                <p> Mi nombre  es Pablo Alcca Ancoo y soy el administradoy y jefe de la empresa el buen Sabor,tengo reconocimientos en el arte culinario ,tambien estuve presente en Mistura donde ocupe el 12 lugar.
                                </p>
                            </span>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col s12 m4 ">
                <div class="card-panel grey lighten-5 z-depth-1">
                    <div class="row valign-wrapper">
                        <div class="col s2">
                            <img src="images/persona2.jpg" alt="" class="circle responsive-img">
                            <!-- notice the "circle" class -->
                        </div>
                        <div class="col s10">
                            <span class="black-text">
                                Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptas, expedita a, quas repellat consequatur praesentium quidem enim cupiditate. Voluptas a ipsa praesentium deleniti voluptate ex pariatur alias vero nulla tempora.
                            </span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script src="js/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script src="js/materialize.min.js" type="text/javascript"></script>
        <script src="js/script.js" type="text/javascript"></script>
    </body>
</html>
