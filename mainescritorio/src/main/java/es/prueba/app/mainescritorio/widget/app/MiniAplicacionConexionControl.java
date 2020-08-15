package es.prueba.app.mainescritorio.widget.app;

import es.prueba.app.mainescritorio.interficies.ISujeto;
import es.prueba.app.mainescritorio.observer.ObservadorConexion;
import es.prueba.app.mainescritorio.observer.SujetoConexion;
import es.prueba.app.mainescritorio.rest.ClienteRest;
import es.prueba.app.mainescritorio.widget.Widget;

public class MiniAplicacionConexionControl extends Widget {
	
	private static final long serialVersionUID = 5797869543967807158L;

  private ISujeto sujeto;

	public MiniAplicacionConexionControl() {
		super("MiniAplicacionConexion");
		this.setVista(new MiniAplicacionConexionVista());
		this.altura = (int) this.getVista().getPreferredSize().getHeight();
		this.anchura = (int) this.getVista().getPreferredSize().getWidth();
    this.posicionX = (int) (Math.random() * 500) + 0;
		this.posicionY = (int) (Math.random() * 500) + 0;
    inicializaConexiones();
	}
	
	public MiniAplicacionConexionControl(int altura, int anchura, int posicionX, int posicionY) {
		super("MiniAplicacionConexion", altura, anchura, posicionX, posicionY);
		this.setVista(new MiniAplicacionConexionVista());
		this.getVista().setSize(anchura, altura);
		this.getVista().setLocation(posicionX, posicionY);
    inicializaConexiones();
	}
	
	public void setNumeroConexion(String numero) {
		((MiniAplicacionConexionVista) this.getVista()).getLblNumeroUsuarios().setText(numero);
	}

  private void inicializaConexiones() {
    ClienteRest rest = ClienteRest.getInstancia();
    setNumeroConexion(rest.añadeConexion());
    this.sujeto = new SujetoConexion();
    this.sujeto.añadirObservador(new ObservadorConexion(this));
    Thread tSujeto = new Thread((SujetoConexion)this.sujeto);
    tSujeto.start();
  }

  public void enCerrarWidget() {
    ClienteRest rest = ClienteRest.getInstancia();
    rest.reduceConexion();
  }  
}
