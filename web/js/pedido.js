$(document).ready(function (){
    listarProducto();
    $('.modal').modal();
});
function listarProducto(){
    $.get("pc",{"opc":6},function (data) {
        var x = JSON.parse(data);
        
          $("#tablita tbody tr").remove(); 
        for(var i = 0;i<x.length;i++){
            $("#tablita").append("<tr><td>"+(i+1)+"</td><td>" +x[i].NOMBRE+ "</td><td>" +x[i].APELLIDO+"</td><td>"+x[i].DNI+"</td><td>"+x[i].FECHA+"</td><td><button data-target='modal1' class='btn-floating btn-large waves-effect waves-light red modal-trigger'><i class='material-icons'>remove_red_eye</i></button></td></tr>");
        }
    });

}
