package es.prueba.app.mainescritorio.observer;

import es.prueba.app.mainescritorio.interficies.IObservador;
import es.prueba.app.mainescritorio.rest.ClienteRest;
import es.prueba.app.mainescritorio.widget.app.MiniAplicacionConexionControl;

public class ObservadorConexion implements IObservador{

    private MiniAplicacionConexionControl widget;
    
    public ObservadorConexion(MiniAplicacionConexionControl widget) {
        this.widget = widget;
    }
    
    public void actualiza() {
      ClienteRest rest = ClienteRest.getInstancia();
      this.widget.setNumeroConexion(rest.consultaConexion());
    }   
}
