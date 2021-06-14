class ControladorAjax{
    
    constructor(){
        this.modeloAjax=new Ajax();
    }

    /**
     * Funcion que llama a la funcion Ajax de un documento 
     */
    llamarArchivo(){
        this.modeloAjax.llamarArchivo();
    }

    /**
     * Metodo que saluda
     */
    saludo(){
        return this.modeloAjax.saludo();
    }
}