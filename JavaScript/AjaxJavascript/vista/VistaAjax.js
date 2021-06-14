"use strict";
class VistaAjax extends ControladorAjax{
    /**
     * Constructor por defecto
     */
    constructor(){
        super();
    }
}

const ajax=new VistaAjax();
document.getElementById("titulo").innerHTML=ajax.saludo();
document.getElementById("demo").innerHTML=ajax.llamarArchivo();