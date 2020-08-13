package es.prueba.app.mainescritorio.dialog;


import javax.swing.JDialog;
import javax.swing.JPanel;

import es.prueba.app.mainescritorio.widget.Widget;

public class WidgetDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	public WidgetDialog() {
		setBounds(100, 100, 450, 300);
	}
	
	public void cargarAplicacion(Widget widget) 
	{
		
	}
}
