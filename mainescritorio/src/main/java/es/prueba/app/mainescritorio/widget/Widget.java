package es.prueba.app.mainescritorio.widget;

import java.io.Serializable;

import javax.swing.JPanel;

public abstract class Widget implements Serializable{

	private String nombre;
	private boolean estado;
	private JPanel vista;
	
	private int altura = 500;
	private int anchura = 500;
	private int posicionX = 25;
	private int posicionY = 25;
	
	public Widget(String nombre, boolean estado, int altura, int anchura, int posicionX, int posicionY) {
		this.nombre = nombre;
		this.estado = estado;
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.altura = altura;
		this.anchura = anchura;
	}
	
	public Widget(String nombre, int altura, int anchura, int posicionX, int posicionY) {
		this.nombre = nombre;
		this.estado = false;
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.altura = altura;
		this.anchura = anchura;
	}
	
	public Widget(String nombre, boolean estado) {
		this.nombre = nombre;
		this.estado = estado;
	}
	
	public Widget(String nombre) {
		this.nombre = nombre;
		this.estado = false;
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
		return "#" + nombre + "#" + altura + "#" + anchura + "#" + posicionX + "#" + posicionY;
	}
}
