class Elementos {
    /**
     * Metodo que crea el título de la página
     */
    static creoTitulo() {
        // Creo el div
        var divTitulo = document.createElement('div');
        divTitulo.setAttribute('id', 'cabecera');
        document.body.appendChild(divTitulo);

        // Creo el título
        var titulo = document.createElement('h1');
        titulo.textContent = "Este es el título";
        document.getElementById('cabecera').appendChild(titulo);
    }

    /**
     * Metodo que crea el cuerpo de la página
     */
    static creoCuerpo() {
        // Creo el div
        var divCuerpo = document.createElement('div');
        divCuerpo.setAttribute('id', 'cuerpo');
        document.body.appendChild(divCuerpo);

        // Creo el cuerpo
        var cuerpo = document.createElement('h1');
        cuerpo.textContent = "Este es el cuerpo de la página";
        document.getElementById('cuerpo').appendChild(cuerpo);
    }

    /**
     * Metodo que crea el final de la página
     */
    static creoFirma() {
        // Creo el div
        var divFirma = document.createElement('div');
        divFirma.setAttribute('id', 'firma');
        document.body.appendChild(divFirma);

        // Creo la firma
        var firma = document.createElement('h1');
        firma.textContent = "Este es el pie de pagina";
        document.getElementById('firma').appendChild(firma);
    }
}

Elementos.creoTitulo();
Elementos.creoCuerpo();
Elementos.creoFirma();