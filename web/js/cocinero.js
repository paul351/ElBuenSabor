
$(document).ready(function () {
     LISDE();
    $('.tooltipped').tooltip();
    
    $("#contenedor").load('lista_chef.jsp');
    listarChef();
   
});

$("#listar_pedido").click(function () {

    $("#contenedor").load('lista_chef.jsp');


});

$("#contenedor").on("click", "#listar_pedido", function () {

});


 var id=0;
function listarChef() {
    $.get("cc", {"opc": 1}, function (data) {
        var x = JSON.parse(data);

        $("#tabla tbody tr").remove();
        for (var i = 0; i < x.length; i++) {
            $("#tabla").append("<tr><td>" + x[i].ID_PEDIDO + "</td><td>" + x[i].DNI + "</td><td><a id='open' onclick ='LISDE("+x[i].ID_PEDIDO+")' class='btn-floating waves-effect waves-light light-blue accent-4 btn modal-trigger' href='#modal1'><i class='material-icons'>assignment_returned</i></a></td></tr>");
        }
    });

}


function LISDE(x){
    $('.modal').modal();
    id=x;
    $.get("cc", {"id":x,"opc":2}, function (data) {

        var x = JSON.parse(data);

        $("#tablamodal tbody tr").remove();
        for (var i = 0; i < x.length; i++) {
            $("#tablamodal").append("<tr><td>" + x[i].NOMBRE+"</td><td>" + x[i].CANTIDAD+"</td><td></td></tr>");
            
        }
        
    });
}
  function cambiar(){
      alert(id);
        alert("sadfghj");
    $.get("cc", {"id":id,"opc":3}, function () {
        listarChef();
    });
    
}
$( "#aceptarpedido" ).click(function() {

        
        
        
        
  
         
});
