package es.prueba.app.mainescritorio.widget;

import java.awt.Dimension;
import java.io.Serializable;

import javax.swing.JPanel;

public abstract class Widget implements Serializable{

	private static final long serialVersionUID = 6602831908441105635L;
	
  protected int altura;
	protected int anchura;
	protected int posicionX;
	protected int posicionY;

	private String nombre;
	private JPanel vista;
	
	public Widget(String nombre, int altura, int anchura, int posicionX, int posicionY) {
		this.nombre = nombre;
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.altura = altura;
		this.anchura = anchura;
	}
	
	public Widget(String nombre) {
		this.nombre = nombre;
	}	
	
	public Widget() {}

  public abstract void enAbrirWidget();
  public abstract void enCerrarWidget();
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

  public void cargarDimensiones() {
    this.getVista().setPreferredSize(new Dimension(this.anchura,this.altura));
  }

  public void cargarLocalizacion() {
    this.getVista().setLocation(this.posicionX, this.posicionY);
  }

	@Override
	public String toString() {
		return "#" + nombre + "#" + altura + "#" + anchura + "#" + posicionX + "#" + posicionY;
	}
}
