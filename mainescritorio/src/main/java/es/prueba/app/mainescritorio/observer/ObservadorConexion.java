package es.prueba.app.mainescritorio.observer;

import javax.swing.JPanel;

import es.prueba.app.mainescritorio.interficies.IObservador;

public class ObservadorConexion implements IObservador{

    private JPanel vista;
    
    public ObservadorConexion(JPanel vista) {
        this.vista = vista;
    }
    
    public void actualiza() {
        /**
         * Llamada a la instancia ClienteRest
         * Comprovamos numero de conexiones
         * Añadimos numero al panel
         */

    }

    
    
}