
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>El Buen Sabor - Login</title>
        <link rel="stylesheet" href="">
        <!--Import Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
        <link href="css/materialize.min.css" rel="stylesheet" type="text/css"/>

        <style>
            p,
            a,
            label {
                font-family: 'Roboto', sans-serif;
            }
        </style>
    </head>
    <body>
        <div class="row">
            <div class="container center">
                <div class="row">
                    <div class="col s7">
                        <div class="container center">
                            <div class="responsive-h4" style="margin-top: 80px;">
                                <h4 class="free-flow">Sign In</h4>
                                <p>Enter your information below</p>
                            </div>
                            <div class="row">
                                <div class="input-field col s12">
                                    <i class="material-icons prefix">person</i>
                                    <input id="NICKNAME" type="text" class="validate">
                                    <label>Usuario</label>
                                </div>
                            </div>
                            <div class="row">
                                <div class="input-field col s12">
                                    <i class="material-icons prefix">more_horiz</i>
                                    <input id="PASSWORD" type="password" class="validate">
                                    <label for="password">Password</label>
                                </div>
                            </div>
                            <div class="row">
                                <a id="INGRESAR" class="waves-effect waves-light btn-large" style="width: 100%;">Login</a>
                            </div><br>
                           
                        </div>
                    </div>
                    <div class="col s5">
                        <img class="" src="images/login1.jpg" alt="">
                    </div>
                </div>
            </div>
        </div>
        <script src="js/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script src="js/materialize.min.js" type="text/javascript"></script>
        <script src="js/login.js" type="text/javascript"></script>
    </body>
</html>
