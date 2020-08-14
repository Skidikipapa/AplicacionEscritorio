package es.prueba.app.mainescritorio.interficies;

public interface ISujeto {

  public void avisaObservador();
  public void añadirObservador(IObservador observador);
  public void borrarObservador(IObservador observador);

}
