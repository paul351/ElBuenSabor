$(document). ready(function (){
    listarProducto();
    
});
var   total=0;
var id=0;
  
function listarProducto(){
    $.get("pc",{"opc":6},function (data) {
        var x = JSON.parse(data);
        
          $("#tablita tbody tr").remove(); 
        for(var i = 0;i<x.length;i++){
            $("#tablita").append("<tr><td>" +x[i].ID_PEDIDO+ "</td><td>" +x[i].NOMBRE+"</td><td>"+x[i].APELLIDO+"</td><td>"+x[i].DNI+"</td><td>"+x[i].FECHA+"</td><td><button data-target='modal1' class='btn-floating btn-large waves-effect waves-light red modal-trigger' onclick='LISDE(" + x[i].ID_PEDIDO + ")'><i class='material-icons'>remove_red_eye</i></button></td></tr>");
        }
    });
    
}

 
function LISDE(x){
    alert("Esto es x : "+x);
     
     id=x;
    $('.modal').modal();
    alert(x);
    $.get("pc",{"id":x,"opc":7},function (data) {
        var a = JSON.parse(data);
        
         $("#reyna tbody tr").remove(); 
         for(var i = 0;i<a.length;i++){
         $("#reyna").append("<tr><td>" +a[i].NOMBRE+ "</td><td>" +a[i].CANTIDAD+"</td><td>"+a[i].PRECIO+ "</td><td>"+a[i].CANTIDAD*a[i].PRECIO+"</td></tr>");
         total=total+(a[i].CANTIDAD*a[i].PRECIO);
         }      
         $("#total").val(total);   
         
             
         
    }); 
    
  
    
}



 function maincra(){
    alert(id);
   
    alert("sadfghj");
    $.get("cc", {"id":id,"opc":4}, function () {
        listarProducto()
    });M.toast({html: 'REgistro correcto'});
     total=0;
}