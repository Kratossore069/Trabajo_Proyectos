<?php
require_once './modelo/Saludo.php';
class SaludoControlador{
    /**
     * Constructor por defecto
     */
    function __construct() {
        $this->modeloSaludo=new Saludo();
    }

    /**
     * Funcion desde el controlador que saluda
     * @param string $nombre nombre que saluda
     * @return el saludo correspondiente
     */
    function saludoNombre(string $nombre):string{
        if($nombre=="" || $nombre==null){
            return "El nombre no puede estar vacío ni ser nulo";
        }
        return $this->modeloSaludo->saludando($nombre);
    }
}
?>