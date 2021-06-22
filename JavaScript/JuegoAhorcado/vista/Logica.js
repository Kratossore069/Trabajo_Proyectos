"use strict";
window.addEventListener('DOMContentLoaded', () => {

    /**
     * Llamamos al controlador
     */
    const ahorcadoControlador = new JuegoControlador();

    var infoRecibida = null;
    var infoTransformada=null;
    $(document).ready(function () {
        infoRecibida = $.ajax({
            url: '../json/peliculas.json',
            dataType: "json",
            async: false
        }).responseText;
        //infoTransformada=infoRecibida.split(',');
        console.log("DATOS "+infoRecibida[0].Title);
    });

    var palabraAdivinar = [];
    var palabraMostrar = [];
    var historialLetrasUsuario = [];
    var numIntentos = 5;
    var nodoLetra = document.getElementById('letra');
    var nodoBoton = document.getElementById('boton');
    var nodoResultado = document.getElementById('resultado');
    var nodoIntentos = document.getElementById('intentos');
    var nodoHistorial = document.getElementById('historial');

    //======================================================================
    // FUNCIONES
    //======================================================================


    /**
     * Método que prepara el juego para iniciarse
     */
    function prepararJuego() {
        //// 1 Selecciono una palabra aleatoria de listaPalabra
        //// 1.1 Obtengo la posicion aleatoria
        let posAleatoriaListaPalabras = _.random(listaPalabras.length - 1);
        //// 1.2 Obtengo la palabra aleatoria
        let palabraAleatoria = listaPalabras[posAleatoriaListaPalabras];
        //// 1.3 Separo la palabra en letras y lo guardo
        palabraAdivinar = palabraAleatoria.split('');
        //// 2 Preparo el array que va a ver el usuario. Tendrá el mismo número de guiones que letras en palabraAdivinar
        for (let letra of palabraAdivinar) {
            palabraMostrar.push('_');
        }
        //// 3 Dibuja todo lo necesario
        dibujarJuego();
    }

    /**
     * Método que redibuja lo que ve el usuario con los cambios
     */
    function dibujarJuego() {
        // Convertimos un array en un texto, separado por espacios, y lo mostramos en el div resultado
        nodoResultado.textContent = palabraMostrar.join(' ');
        // Mostramos los intentos
        nodoIntentos.textContent = numIntentos;
        // Mostramos el historial de letras
        nodoHistorial.textContent = historialLetrasUsuario.join(' ');
    }

    /**
     * Método que comprueba la letra que ha introducido el usuario
     */
    function comprobarLetraUsuario() {
        //// 1 Sustituye los guiones por la letra acertada
        // Guardo la letra del input que ha escrito el usuario en una variable
        let letraUsuario = nodoLetra.value;
        // Vaciamos el input para que el usuario pueda volver a escribir
        nodoLetra.value = '';
        // Le devolvemos el foco al input para que pueda introducir otra letra
        nodoLetra.focus();
        // Recorremos todas las letras para saber si alguna esta bien
        for (const [posicion, letraAdivinar] of palabraAdivinar.entries()) {
            // Comprobamos si la letra del usuario es igual a la letra a adivinar
            if (letraUsuario == letraAdivinar) {
                // Sustituimos el guion por la letra acertada
                palabraMostrar[posicion] = letraAdivinar;
            }
        }
        //// 2 Comprobamos si se ha equivocado
        // ¿No esta la letra?
        if (!palabraAdivinar.includes(letraUsuario)) {
            // Restamos un intento
            numIntentos -= 1;
            // Guardamos en el historial la letra pulsada por el usuario
            historialLetrasUsuario.push(letraUsuario);
        }
        //// 3 Comprobamos si hay que terminar el juego
        acabarJuego();
        //// 4 Mostramos los cambios
        dibujarJuego();
    }

    /**
     * Método que comprueba si se ha pulsado la tecla Enter
     */
    function comprobarPulsadoEnter(evento) {
        if (evento.code == 'Enter') {
            comprobarLetraUsuario();
        }
    }

    /**
     * Método que verifica si se ha acabado el juego
     */
    function acabarJuego() {
        // Ha ganado: ¿Le queda guiones al jugador?
        if (!palabraMostrar.includes('_')) {
            alert('Has ganado!!!');
            // Refrescamos la página para volver a jugar
            location.reload(true);
        }
        // Ha perdido: ¿Tiene 0 intentos?
        if (numIntentos == 0) {
            alert('Has Perdido!!! Era: ' + palabraAdivinar.join(''));
            // Refrescamos la página para volver a jugar
            location.reload(true);
        }
    }

    //======================================================================
    // EVENTOS
    //======================================================================
    // Al hacer clic en el boton se llama la funcion comprobarLetraUsuario
    nodoBoton.addEventListener('click', comprobarLetraUsuario);
    // Al hacer Enter con el teclado se llama a la funcion comprobarLetraUsuario
    nodoLetra.addEventListener('keyup', comprobarPulsadoEnter);

    //======================================================================
    // INICIO
    //======================================================================
    prepararJuego();

    ahorcadoControlador.llamarSetCookie("usuario", "Víctor", 800);
    ahorcadoControlador.llamarStorage("Víctor");


    /**
     * Botones de jugadores
     */
    var botonprimero = document.getElementById("botonIA").attributes.id.nodeValue;
    var botonsegundo = document.getElementById("botonJugador").attributes.id.nodeValue;
    document.getElementById("botonIA").addEventListener("click", () => {
        alert(botonprimero);
    });
    document.getElementById("botonJugador").addEventListener("click", () => {
        alert(botonsegundo);
    });

});
