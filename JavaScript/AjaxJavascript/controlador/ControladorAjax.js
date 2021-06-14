class ControladorAjax{
    
    constructor(){
        this.modeloAjax=new Ajax();
    }

    /**
     * Funcion que llama a la funcion Ajax de un documento (controlador)
     */
    llamarArchivo(){
        this.modeloAjax.llamarArchivo();
    }

    /**
     * Metodo que saluda (controlador)
     */
    saludo(){
        return this.modeloAjax.saludo();
    }
}