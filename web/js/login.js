$(document).ready(function () {
    M.updateTextFields();
});

$("#INGRESAR").click(function () {
    var NICKNAME = $("#NICKNAME").val();
    var PASSWORD = $("#PASSWORD").val();
    console.log(NICKNAME, PASSWORD);
    $.get("Usuario", {OPC: 1, NICKNAME: NICKNAME, PASSWORD: PASSWORD}, function (DATA) {
        var LOGIN = JSON.parse(DATA);
        console.log(LOGIN);
        if (LOGIN.rol === 1) {
            location = 'ADMINISTRADOR.jsp';
        } else if (LOGIN.rol === 2) {
            location = 'COCINERO.jsp';
        } else if (LOGIN.rol === 3) {
            location = 'MESERO.jsp';
        } else if (LOGIN.rol === 4) {
            location = 'CLIENTE.jsp';
        } else if(LOGIN.rol === 5){
            location = 'CAJA.jsp';
        } else{
            M.toast({html: 'Usuario Invalido'})
        }
    });
});