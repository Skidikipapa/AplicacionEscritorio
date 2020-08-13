package es.prueba.app.mainescritorio.widget;

import javax.swing.JDialog;

import es.prueba.app.mainescritorio.interficies.ISujeto;

public abstract class Widget {

	private String nombre;
	private boolean estado;
	private ISujeto sujeto;

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

	@Override
	public String toString() {
		return "Widget [nombre=" + nombre + ", estado=" + estado + ", sujeto=" + sujeto + "]";
	}
}
