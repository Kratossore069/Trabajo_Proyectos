"use strict";
class Elementos {
    /**
     * Metodo que crea el título de la página
     */
    static creoTitulo() {
        // Creo el div
        var divTitulo = document.createElement('div');
        divTitulo.setAttribute('id', 'cabecera');
        divTitulo.classList.add('cajaTitulo');
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
        divCuerpo.classList.add('cajaCuerpo');
        document.body.appendChild(divCuerpo);

        // Creo el cuerpo
        var cuerpo = document.createElement('h1');
        cuerpo.textContent = "Lorem Ipsum";

        document.getElementById('cuerpo').appendChild(cuerpo);
    }

    /**
     * Metodo que crea el final de la página
     */
    static creoFirma() {
        // Creo el div
        var divFirma = document.createElement('div');
        divFirma.setAttribute('id', 'firma');
        divFirma.classList.add('cajaPie');
        document.body.appendChild(divFirma);

        // Creo la firma
        var firma = document.createElement('h1');
        firma.textContent = "Desarrollado por Kratossore";

        var pie = document.createElement('p');
        pie.textContent = "Copyright 2021";

        document.getElementById('firma').appendChild(firma);
        document.getElementById('firma').appendChild(pie);
    }

    /**
     * Funcion que muestra los Pokémon
     */
    static conApis() {

        var numeroAleatorio = Math.floor(Math.random() * (500 - 1)) + 1;
        const url = "https://pokeapi.co/api/v2/pokemon/";

        fetch(url + numeroAleatorio)
            .then(response => response.json())
            .then(data => {
                console.log(data);
                var nombreHtml = document.getElementById("cabecera");
                nombreHtml.innerHTML = "<h2>Pokémon llamado " + data.name + "</h2>";

                var fotoPokemon = document.getElementById("cuerpo");
                fotoPokemon.innerHTML = "<img src=" + data.sprites.front_default + "></img>";


            }
            )
            .catch(error => document.write("Existe un error => " + error));
    }
}

Elementos.creoTitulo();
Elementos.creoCuerpo();
Elementos.creoFirma();
Elementos.conApis();