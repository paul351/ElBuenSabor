$(document).ready(function () {
    listarProducto();
    $('.modal').modal();
});
function listarProducto() {
    var nom = $("#caja").val();
    $.get("pc", {"opc": 1}, function (data) {
        var x = JSON.parse(data);
        $("#tablita tbody tr").remove();
        for (var i = 0; i < x.length; i++) {
            $("#tablita").append("<tr><td>" + (i + 1) + "</td><td>" + x[i].id_producto + "</td><td>" + x[i].nombre + "</td><td>" + x[i].precio + "</td> <td><button data-target='modal1' onclick='editar(" + x[i].id_producto + ")' class='btn-floating btn-large waves-effect waves-light red modal-trigger'><i class='material-icons'>border_color</i></button></td> <td><button onclick='eliminar(" + x[i].id_producto + ")' class='btn-floating btn-large waves-effect waves-light red modal-trigger'><i class='material-icons'>delete_sweep</i></button></td></tr>");
        }
    });

}


function editar(x) {
    alert("adsad");
    $.get("pc", {"opc": 2, "id": x}, function (data) {
        var a = JSON.parse(data);
        $("#nombree").val(a.nombre);
        $("#precioo").val(a.precio);
    });

}
