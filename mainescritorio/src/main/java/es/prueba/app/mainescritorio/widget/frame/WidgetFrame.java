package es.prueba.app.mainescritorio.widget.frame;

import java.awt.Dimension;

import javax.swing.JInternalFrame;
import javax.swing.event.InternalFrameEvent;

import es.prueba.app.mainescritorio.widget.Widget;

public class WidgetFrame extends JInternalFrame {

	private static final long serialVersionUID = 4144040934668800873L;

	private Widget widget;

	public WidgetFrame() {
		setClosable(true);
		setResizable(true);
		
		this.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
		      public void internalFrameClosing(InternalFrameEvent e) {
		    	  widget.enCerrarWidget();
		        widget = null;
		      }
		    });
	}

	public void cargarAplicacion(Widget widget) {
		this.widget = widget;
		setTitle(this.widget.getNombre());
		setSize(new Dimension(this.widget.getAnchura(), this.widget.getAltura()));
		setLocation(this.widget.getPosicionX(), this.widget.getPosicionY());
		getContentPane().add(this.widget.getVista());
		pack();
	}

	public void hacerAplicacionVisible() {
		this.setVisible(true);
	}

	}
