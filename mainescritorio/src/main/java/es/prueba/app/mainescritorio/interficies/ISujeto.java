package es.prueba.app.mainescritorio.interficies;

import java.io.Serializable;

public interface ISujeto extends Serializable {

  public void avisaObservador();
  public void añadirObservador(IObservador observador);
  public void borrarObservador(IObservador observador);

}
