
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <div class="container">
        <div class="row">
                    <div class="input-field col s4"></div>
                    <form class="col s4">
                        <div class="row">
                            <br>
                            <div class="input-field col s12">
                                <i class="material-icons prefix">art_track</i>
                                <input id="dni" type="text" class="validate">
                                <label for="dni">DNI</label>
                            </div>
                            <div class="input-field col s3"></div>
                            <div class="input-field col s6">
                                <a id="cargar" class="btn waves-effect waves-light">Cargar
                                    <i class="material-icons right">send</i>
                                </a>
                            </div>
                            <div class="input-field col s3"></div>
                            <div class="input-field col s12">
                                <a>Nombres</a>
                                <input id="name" disabled type="text">
                            </div>
                            <div class="input-field col s12">
                                <a>Apellido Paterno</a>
                                <input placeholder=" " id="ap_paterno" disabled type="text">
                            </div>
                            <div class="input-field col s12">
                                <a>Apellido Materno</a>
                                <input placeholder=" " id="ap_materno" disabled type="text">
                            </div>
                            <div class="input-field col s3"></div>
                            <div class="input-field col s6">
                                <a id="crear" class="btn waves-effect waves-light" disabled>Crear Usuario
                                    <i class="material-icons right">check_box</i>
                                </a>
                            </div>
                            <div class="input-field col s3"></div>
                        </div>
                    </form>
                    <div class="input-field col s4"></div>
                </div>
    </div>
</html>
