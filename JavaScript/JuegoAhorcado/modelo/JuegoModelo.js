"use strict";
class JuegoModelo {
    /**
     * Peticion Ajax sobre un Json de peliculas (modelo)
     * @param {string} direccion desde donde se va a pedir la informacion 
     */
    peticionPalabras(direccion) {
        var xhttp = new XMLHttpRequest();
        xhttp.onreadystatechange = function () {
            if (this.readyState == 4 && this.status == 200) {
                document.write(this.responseText);
            }
        };
        xhttp.open("GET", direccion, true);
        xhttp.send();
    }

    /**
     * Funcion que genera un session storage (modelo)
     * @param {string} nombre del jugador en cuestion
     */
    sessionStorage(nombre) {
        //Instancio el objeto Date
        var fechaHora = new Date();
        if (typeof (Storage) !== "undefined") {
            sessionStorage.setItem("jugador", nombre);
            // Creo la variable de tiempo
            var tiempo = "Dia: " + fechaHora.getDay() + " Mes: " + fechaHora.getMonth() + " Año: " +
                fechaHora.getFullYear() + " Horas: " + fechaHora.getHours() +
                " Minutos: " + fechaHora.getMinutes() + " Segundos: " + fechaHora.getSeconds();
            // Lo añado
            sessionStorage.setItem("tiempo", tiempo);
            document.write(sessionStorage.getItem("jugador") + " " + sessionStorage.getItem("tiempo"));
        } else {
            document.write("Su navegador no soporta ");
        }
    }

    /**
     * Metodo que crea una cookie a partir de unos parametros (modelo)
     * @param {string} nombreCookie titulo de la cookie
     * @param {string} valorCookie nombre en el titulo de la cookie
     * @param {number} diasExpirar dias para expirar la cookie
     */
    setCookie(nombreCookie, valorCookie, diasExpirar) {
        var d = new Date();
        d.setTime(d.getTime() + (diasExpirar * 24 * 60 * 60 * 1000));
        var expires = "expires=" + d.toUTCString();
        document.cookie = nombreCookie + "=" + valorCookie + ";" + expires + ";path=/";
    }

}