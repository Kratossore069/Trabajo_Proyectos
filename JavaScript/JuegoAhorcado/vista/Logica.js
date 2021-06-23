"use strict";
window.addEventListener('DOMContentLoaded', () => {

    /**
     * Atributos
     */
    const ficheroJSON="../json/peliculas.json";
    var jsonRecibido=null;

    /**
     * Llamamos al controlador
     */
    const ahorcadoControlador = new JuegoControlador();

    /**
     * Funcion que muestra una palabra aleatoria de un JSON externo
     */
    $("#mostrar").click(function () {
        $.ajax({
            url: ficheroJSON,
            method: "GET",
            dataType: "html",
            success: function (respuestaAjax) {
                jsonRecibido=jQuery.parseJSON(respuestaAjax);
                $("#muestreo").text(jsonRecibido[Math.floor((Math.random() * 15) + 0)].Title);
            }
        });
    });

    ahorcadoControlador.llamarSetCookie("usuario", "Víctor", 800);
    ahorcadoControlador.llamarStorage("Víctor");

});