$(document).ready(function () {
    $('.tooltipped').tooltip();
    $('.modal').modal();
    $('select').formSelect();
    $("#contenedor").load('crear_usuario.jsp');
});

var tecactusApi = new TecactusApi("siwTZYkJwUbf9hRwmzLeZ4bi6tnh5hGLVY4RR3jr");

$("#crear_user").click(function () {
    $("#contenedor").load('crear_usuario.jsp');
});

$("#crear_pedi").click(function () {
    $("#contenedor").load('crear_pedido.jsp');
    $.get("Usuario", {OPC: 3}, function (DATA) {
        var LOGIN = JSON.parse(DATA);
        console.log(LOGIN);
        var s = '';
        var emp = LOGIN[0];
        for (var i = 0; i < LOGIN.length; i++) {
            s += '<tr>';
            s += '<td>' + LOGIN[i].ID_PEDIDO + '</td>';
            s += '<td>' + LOGIN[i].DNI + '</td>';
            s += '<td><a id="open" class="btn-floating waves-effect waves-light light-blue accent-4 btn modal-trigger" href="#modal2" name="' + LOGIN[i].ID_PEDIDO + '">';
            s += '<i class="material-icons right">remove_red_eye</i></a>';
            s += '</tr>';
        }
        $("#table_contenido").empty();
        $("#table_contenido").append(createTable());
        $("#data").empty();
        $("#data").append(s);
    });
});

var reg;

$("#nuevo_crear").click(function () {
    console.log(reg);
    var neim = "#check" + reg;
    var allVals = [];
    for (i = 1; i <= reg; i++) {
        if ($(neim + ' :checked')) {
            allVals.push($(neim).attr("name"));
        }
    }
    console.log(allVals);
    $.get("Usuario", {OPC: 3}, function (DATA) {
//        var LOGIN = JSON.parse(DATA);
//        console.log(LOGIN);
//        var s = '';
//        var emp = LOGIN[0];
//        for (var i = 0; i < LOGIN.length; i++) {
//            s += '<tr>';
//            s += '<td>' + LOGIN[i].ID_PEDIDO + '</td>';
//            s += '<td>' + LOGIN[i].DNI + '</td>';
//            s += '<td><a id="open" class="btn-floating waves-effect waves-light light-blue accent-4 btn modal-trigger" href="#modal2" name="' + LOGIN[i].ID_PEDIDO + '">';
//            s += '<i class="material-icons right">remove_red_eye</i></a>';
//            s += '</tr>';
//        }
//        $("#table_contenido").empty();
//        $("#table_contenido").append(createTable());
//        $("#data").empty();
//        $("#data").append(s);
    });
    //$('#data-table-row-grouping').dataTable();
});

function crearhtml() {
    $("#contenedor").load('crear_pedido.jsp');
}

$("#contenedor").on("click", "#nuevo", function () {
    $.get("Usuario", {OPC: 4}, function (data) {
        var prod = JSON.parse(data);
        var j = '';
        var num = 1;
        console.log(prod);
        $.each(prod, function (index, pro) {
            j += '<tr>';
            j += '<td><p><label><input id="check' + num + '" name="' + pro.id_producto + '" type="checkbox" class="filled-in lolo"/><span>' + pro.nombre + '</span></label></p></td>';
            j += '<td><input id="input' + num + '" name="' + num + '" type="text" class="validate realidad"></td>';
            j += '</tr>';
            console.log(num);
            reg = num;
            num = num + 1;
        });
        $("#data_xd").empty();
        $("#data_xd").append(j);
    });
});

$("#data_xd").on("keyup", ".realidad", function () {
    var ksi = $(this).attr("name");
    var siquesi = "#check" + ksi;
    var can = $(this).val();
    console.log(siquesi, can);
    $(siquesi).attr("title", can);
});

$("#table_contenido").on("click", "#open", function () {
    $("#modal").openModal();
});

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

function createTable() {
    var s = '<table id="data-table-row-grouping" class="display centered" cellspacing="0" width="100%">';
    s += '<thead>';
    s += '<tr>';
    s += '<th>POSICIÓN</th>';
    s += '<th>DNI</th>';
    s += '<th>OPERACIÓN</th>';
    s += '</tr>';
    s += '</thead>';
    s += '<tbody id="data"></tbody>';
    s += '</table>';
    return s;
}
;