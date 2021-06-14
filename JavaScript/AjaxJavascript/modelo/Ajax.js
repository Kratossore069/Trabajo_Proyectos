class Ajax {
    /**
     * Metodo Ajax que recibe una informacion (modelo)
     */
    llamarArchivo() {
        const xhttp = new XMLHttpRequest();
        xhttp.onload = function () {
            document.getElementById("demo").innerHTML = this.responseText;
        }
        xhttp.open("GET", "https://www.etnassoft.com/api/v1/get/?id=589&callback=?", true);
        xhttp.send();
    }

    /**
     * Metodo que muestra informacion
     * @returns saludo
     */
    saludo(){
        return "Hola desde el modelo";
    }
}