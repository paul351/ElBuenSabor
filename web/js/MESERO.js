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
    //$('#data-table-row-grouping').dataTable();
});

$("#nuevo_crear").click(function () {
    console.log("uwu");
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
//    $.get("Usuario", {OPC: 4}, function (data) {
//        var alama = JSON.parse(data);
//        console.log(alama);
//        $.each(alama, function (index, ala) {
//            $("#combobox option:last").after(
//                    "<option value='" + ala.id_producto + "'>" + ala.nombre + "</option>");
//        });
////        $('#comboboxito').material_select();
//    });
	$.get("Usuario",{OPC: 4},function(data) {
		var prod = JSON.parse(data);
		console.log(prod);
		$.each(prod,function(index, pro) {
			$("#combobox option:last").after(
				"<option value='"+pro.id_producto+"'>"+pro.nombre+"</option>");
		});
		$('#combobox2').material_select();
	});
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