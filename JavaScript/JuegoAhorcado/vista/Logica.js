"use strict";
window.addEventListener('DOMContentLoaded', () => {
    class Logica {
        /**
         * Metodo para crear elementos
         * @param {string} elemento elemento que se quiere crear
         * @param {string} mensaje mensaje de dentro del elemento
         * @param {string} mensajeID mensaje que tendrá el ID de nuestro nuevo elemento
         * @param {string} padre padre donde se colocará el elemento
         */
        crearElemento(elemento, mensaje, mensajeID, padre) {
            var elementoHTML = document.createElement(elemento).innerHTML = mensaje;
            elementoHTML.setAttribute("id", mensajeID);
            document.getElementById(padre).appendChild(elementoHTML);
        }
    }

    const ahorcadoControlador = new JuegoControlador();
    const logicaJuego = new Logica();

    ahorcadoControlador.llamarSetCookie("usuario", "Víctor", 800);
    ahorcadoControlador.llamarStorage("Víctor");
    //ahorcadoControlador.llamarPeliculas("../json/peliculas.json");

    var botonprimero=document.getElementById("botonIA").attributes.id.nodeValue;
    var botonsegundo=document.getElementById("botonJugador").attributes.id.nodeValue;
    document.getElementById("botonIA").addEventListener("click",()=>{
        alert(botonprimero);
    });
    document.getElementById("botonJugador").addEventListener("click",()=>{
        alert(botonsegundo);
    });
});
