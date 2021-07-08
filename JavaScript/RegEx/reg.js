var textoPagina = document.getElementById("text").textContent;

/**
 * Funcion RegEx para un texto
 * @param {string} texto texto que se quiere analizar
 * @returns numero de coincidencias de la expresion
 */
function contarPalabras(texto) {
    const regEx = /2014|libra/gi;
    return "Hay "+((texto || '').match(regEx) || []).length+" coincidencias con "+regEx;
}

document.write("<h1>"+contarPalabras(textoPagina)+"</h1>");