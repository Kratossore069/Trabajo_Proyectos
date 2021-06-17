"use strict";
class Logica{
    /**
     * Metodo para crear elementos
     * @param {string} elemento que se quiere crear
     * @param {string} mensaje de dentro del elemento
     * @param {string} mensajeID mensaje que tendrá el ID de nuestro nuevo elemento
     */
    crearElemento(elemento,mensaje,mensajeID){
        var elementoHTML=document.createElement(elemento);
        elementoHTML.innerHTML=mensaje;
        elementoHTML.setAttribute("id", mensajeID);
        document.body.appendChild(elementoHTML);
    }

    /**
     * Metodo que muestra como alerta un objeto cualquiera
     * @param {any} elemento que se quiera mostrar
     */
    mostrarAlerta(elemento){
        alert(elemento);
    }
}

const ahorcadoControlador=new JuegoControlador();
const logicaJuego=new Logica();

var cookies = ahorcadoControlador.llamarSetCookie("usuario","Víctor",800);
var storageWeb = ahorcadoControlador.llamarStorage("Víctor");
//ahorcadoControlador.llamarPeliculas("../json/peliculas.json");

logicaJuego.crearElemento("button","Púlsame","verCookies");
document.getElementById("verCookies").addEventListener("click", logicaJuego.mostrarAlerta(), true);