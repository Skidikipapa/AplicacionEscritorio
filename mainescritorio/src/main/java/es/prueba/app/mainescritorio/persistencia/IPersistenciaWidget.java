package es.prueba.app.mainescritorio.persistencia;

import java.util.List;

public interface IPersistenciaWidget {

  public void guardarEstado(String datos);
  public List<String> leerEstados();

}
