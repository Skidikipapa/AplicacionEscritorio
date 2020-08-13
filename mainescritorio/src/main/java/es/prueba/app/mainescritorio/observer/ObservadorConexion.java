package es.prueba.app.mainescritorio.observer;

import es.prueba.app.mainescritorio.interficies.IObservador;
import es.prueba.app.mainescritorio.widget.app.MiniAplicacionConexionControl;

public class ObservadorConexion implements IObservador{

    private MiniAplicacionConexionControl widget;
    
    public ObservadorConexion(MiniAplicacionConexionControl widget) {
        this.widget = widget;
    }
    
    public void actualiza() {

        /**
         * Llamada a la instancia ClienteRest
         * Comprovamos numero de conexiones
         * Añadimos numero al panel
         */

      this.widget.setNumeroConexion("");

    }   
}
