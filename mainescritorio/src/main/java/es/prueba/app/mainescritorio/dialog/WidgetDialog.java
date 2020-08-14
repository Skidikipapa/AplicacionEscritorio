package es.prueba.app.mainescritorio.dialog;

import java.awt.Rectangle;

import javax.swing.JDialog;

import es.prueba.app.mainescritorio.widget.Widget;

public class WidgetDialog extends JDialog {

	private static final long serialVersionUID = 4144040934668800873L;
	
	public WidgetDialog() {
		setBounds(100, 100, 450, 300);
	}

	public void cargarAplicacion(Widget widget) {
		setTitle(widget.getNombre()); 
		setBounds(new Rectangle(widget.getPosicionX(),widget.getPosicionY(), widget.getAnchura(), widget.getAltura()));
		getContentPane().add(widget.getVista());
	}

  public void hacerAplicacionVisible() {
    this.setVisible(true);
  }
}
