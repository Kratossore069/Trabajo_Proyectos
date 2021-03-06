"use strict";
class JuegoModelo {

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
        } else {
            document.write("Su navegador no soporta sessionStorage");
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