$(document).ready(function () {
    $('.tooltipped').tooltip();
    $("#contenedor").load('crear_usuario.jsp');
});

var tecactusApi = new TecactusApi("siwTZYkJwUbf9hRwmzLeZ4bi6tnh5hGLVY4RR3jr");

$("#crear_user").click(function () {
    $("#contenedor").load('crear_usuario.jsp');
});

$("#crear_pedi").click(function () {
    $("#contenedor").load('crear_pedido.jsp');
});

function crearhtml () {
    $("#contenedor").load('crear_pedido.jsp');
};

$("#contenedor").on("click", "#cargar", function () {
    var dni = $("#dni").val();
    tecactusApi.Reniec.getDni(dni).then(function (response) {
        console.log("consulta correcta!");
        console.log(response.data);
        if (response.data !== "El DNI pertenece a un menor de edad.") {
            $("#name").val(response.data.nombres);
            $("#ap_paterno").val(response.data.apellido_paterno);
            $("#ap_materno").val(response.data.apellido_materno);
            $("#crear").removeAttr("disabled");
        } else {
            M.toast({html: 'El DNI pertenece a un menor de edad.'})
        }
    }).catch(function (response) {
        console.log("algo ocurrió");
        console.log("código de error: " + response.code);
        console.log("mensaje de respuesta: " + response.status);
        console.log(response.data);
    });
});

$("#contenedor").on("click", "#crear", function () {
    var dni = $("#dni").val();
    var name = $("#name").val();
    var ap_paterno = $("#ap_paterno").val();
    var ap_materno = $("#ap_materno").val();
    console.log(dni, name, ap_paterno, ap_materno);
    var lastname = ap_paterno + " " + ap_materno;
    $.get("Usuario", {OPC: 2, DNI: dni, NAME: name, LASTNAME: lastname}, function (DATA) {
        console.log(DATA);
        var toastHTML = '<span>Usuario creado. </span><a onclick="crearhtml()" class="btn-flat toast-action">REALIZAR PEDIDO</a>';
        M.toast({html: toastHTML});
    });
});