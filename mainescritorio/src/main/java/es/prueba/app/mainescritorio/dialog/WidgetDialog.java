package es.prueba.app.mainescritorio.dialog;

import java.awt.Rectangle;

import javax.swing.JDialog;
import javax.swing.JPanel;

import es.prueba.app.mainescritorio.widget.Widget;

public class WidgetDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();

	public WidgetDialog() {
		setBounds(100, 100, 450, 300);
	}

	public void cargarAplicacion(Widget widget) {
		setTitle(widget.getNombre()); 
		setBounds(new Rectangle(widget.getPosicionX(),widget.getPosicionY(), widget.getAnchura(), widget.getAltura()));
		getContentPane().add(widget.getVista());
	}
}
