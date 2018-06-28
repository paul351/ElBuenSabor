
$(document).ready(function () {
    $('.tooltipped').tooltip();
    $('.modal').modal();
    $("#contenedor").load('lista_chef.jsp');
    listarChef();
});

$("#listar_pedido").click(function () {

    $("#contenedor").load('lista_chef.jsp');


});

$("#contenedor").on("click", "#listar_pedido", function () {

});
function listarChef() {



    $.get("cc", {"opc": 1}, function (data) {

        var x = JSON.parse(data);

        $("#tabla tbody tr").remove();
        for (var i = 0; i < x.length; i++) {
            $("#tabla").append("<tr><td>" + x[i].ID_PEDIDO + "</td><td>" + x[i].DNI + "</td><td><a id='open' class='btn-floating waves-effect waves-light light-blue accent-4 btn modal-trigger' href='#modal1'><i class='material-icons'>assignment_returned</i></a></td></tr>");
        }


    });

    /*function listarmodal(x){
     $.get("hc",{"opc":2,"id":x},function (data) {
     var x = JSON.parse(data);
     $("#edit_nomrol").val(x.nomrol);
     $("#edit_idrol").val(x.idr);
     });
     $("#myModal2").modal('show');*/

}
function listarmodal() {

    $("#modalchef").modal();

}

$("#tabla").on("click", "#open", function () {
    $("#modal1").openModal();
});