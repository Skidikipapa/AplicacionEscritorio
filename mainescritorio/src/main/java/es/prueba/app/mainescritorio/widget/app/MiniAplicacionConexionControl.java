package es.prueba.app.mainescritorio.widget.app;

import es.prueba.app.mainescritorio.widget.Widget;

public class MiniAplicacionConexionControl extends Widget {
	
	
	public MiniAplicacionConexionControl(String nombre, boolean estado) {
		super(nombre, estado);
		this.setVista(new MiniAplicacionConexionVista());
	}
	
	public void setNumeroConexion(String numero) {
		((MiniAplicacionConexionVista) this.getVista()).getLblNumeroUsuarios().setText(numero);
	}
}
