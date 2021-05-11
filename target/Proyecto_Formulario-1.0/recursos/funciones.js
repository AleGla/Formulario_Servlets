function validarForma(forma){
    var usuario = forma.usuario;
    if(usuario.value == "" || usuario.value == "Escribir usuario"){
        alert("Debe proporcionar un nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;
    }
    
    var password = forma.password;
    if(password.value == "" || password.value < 3){
        alert("Debe proporcionar un password al menos de 3 caracteres");
        password.focus();
        password.select();
        return false;
    }
    
    var tecnologias = forma.tecnologia;
    var checkSeleccionado = false;
    
    for(var i=0;i<tecnologias.length;i++){
        if(tecnologias[i].checked){
            checkSeleccionado=true;
        }
    }
    
    if(checkSeleccionado===false){
        alert("Debe Seleccionar una tecnologia");
        return false;
    }
    
    var generos = forma.genero;
    var radioSeleccionado=false;
    
    for(var i=0;i<generos.length;i++){
        if(generos[i].checked){
            radioSeleccionado=true;
        }
    }
    
    if(radioSeleccionado===false){
        alert("Debe seleccionar un genero");
        return false;
    }
    
    var ocupacion = forma.ocupacion;
    
    if(ocupacion.value === ""){
        alert("Debes seleccionar una ocupacion");
        return false;
    }
    
    //formulario valido
    
    alert("Formulario Valido, enviando datos al servidor");
    return true;
}

