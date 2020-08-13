package es.prueba.app.mainescritorio.widget;

import javax.swing.JPanel;

import es.prueba.app.mainescritorio.interficies.ISujeto;

public abstract class Widget {

	private String nombre;
	private boolean estado;
	private ISujeto sujeto;
	private int altura;
	private int anchura;
	private int posicionX;
	private int posicionY;
	private JPanel vista;
	
	public Widget(String nombre, boolean estado, ISujeto sujeto, JPanel vista) {
		this.nombre = nombre;
		this.estado = estado;
		this.sujeto = sujeto;
		this.vista = vista;
	}

	public Widget(String nombre, boolean estado, ISujeto sujeto) {
		this.nombre = nombre;
		this.estado = estado;
		this.sujeto = sujeto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public ISujeto getSujeto() {
		return sujeto;
	}

	public void setSujeto(ISujeto sujeto) {
		this.sujeto = sujeto;
	}
	
	public JPanel getVista() {
		return vista;
	}
	
	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getAnchura() {
		return anchura;
	}

	public void setAnchura(int anchura) {
		this.anchura = anchura;
	}

	public int getPosicionX() {
		return posicionX;
	}

	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}

	public int getPosicionY() {
		return posicionY;
	}

	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}

	public void setVista(JPanel vista) {
		this.vista = vista;
	}

	@Override
	public String toString() {
		return "#" + nombre + "#" + estado + "#" + altura + "#" + anchura + "#" + posicionX + "#" + posicionY;
	}
}
