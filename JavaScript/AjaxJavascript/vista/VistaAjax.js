"use strict";
class VistaAjax{
    /**
     * Constructor por defecto
     */
    constructor(){
        this.controladorAjax=new ControladorAjax();
        console.log(this.controladorAjax);
    }

    /**
     * Funcion que llama al Ajax desde el controlador
     */
    llamarAjax(){
        this.controladorAjax.llamarArchivo();
    }

    /**
     * Saludo inicial
     */
    saludo(){
        return this.controladorAjax.saludo();
    }
}

const ajax=new VistaAjax();
document.getElementById("demo").innerHTML=ajax.llamarAjax();