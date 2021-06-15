<?php
class Saludo{
    /**
     * Funcion desde el modelo que saluda
     * @param string $nombre nombre que saluda
     * @return el saludo correspondiente
     */
    function saludando(string $nombre):string{
        return "Hola desde el modelo ".$nombre;
    }
}
?>