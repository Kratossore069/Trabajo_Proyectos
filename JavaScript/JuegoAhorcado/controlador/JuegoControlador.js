"use strict";
class JuegoControlador{
    /**
     * Constructor por defecto
     */
    constructor(){
        this.modeloAjax=new JuegoModelo();
    }

    /**
     * Funcion que llama al storage de la pagina (controller)
     * @param {string} nombre de la sesion
     */
    llamarStorage(nombre){
        if(nombre==""){
            alert("El nombre no puede estar vacio");
        }
        this.modeloAjax.sessionStorage(nombre);
    }

    /**
     * Metodo que crea una cookie a partir de unos parametros (controller)
     * @param {string} nombreCookie titulo de la cookie
     * @param {string} valorCookie nombre en el titulo de la cookie
     * @param {number} diasExpirar dias para expirar la cookie
     */
    llamarSetCookie(nombreCookie, valorCookie, diasExpirar){
        if(nombreCookie=="" || valorCookie=="" || diasExpirar==""){
            alert("Alguno de los campos no es correcto");
        }
        this.modeloAjax.setCookie(nombreCookie, valorCookie, diasExpirar);
    }
}