package es.prueba.app.mainescritorio.widget.app;

import es.prueba.app.mainescritorio.widget.Widget;

public class MiniAplicacionConexionControl extends Widget {
	
	public MiniAplicacionConexionControl(boolean estado, int altura, int anchura, int posicionX, int posicionY) {
		super("MiniAplicacionConexion", estado, altura, anchura, posicionX, posicionY);
		this.setVista(new MiniAplicacionConexionVista());
	}
	
	public MiniAplicacionConexionControl(boolean estado) {
		super("MiniAplicacionConexion", estado);
		this.setVista(new MiniAplicacionConexionVista());
	}
	
	public void setNumeroConexion(String numero) {
		((MiniAplicacionConexionVista) this.getVista()).getLblNumeroUsuarios().setText(numero);
	}
}
