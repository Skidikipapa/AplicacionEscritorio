package es.prueba.app.mainescritorio.widget.frame;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JInternalFrame;
import javax.swing.event.InternalFrameEvent;

import es.prueba.app.mainescritorio.interficies.IEnVentanaCerrada;
import es.prueba.app.mainescritorio.widget.Widget;

public class WidgetFrame extends JInternalFrame implements ComponentListener{

	private static final long serialVersionUID = 4144040934668800873L;

	private Widget widget;

	public WidgetFrame(IEnVentanaCerrada enVentanaCerrada) {
		setClosable(true);
		setResizable(true);

		this.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
			public void internalFrameClosing(InternalFrameEvent e) {
				enVentanaCerrada.enAplicacionCerrada(widget);
			}
		});
		
		this.addComponentListener(this);
	}

	public void cargarAplicacion(Widget widget) {
		this.widget = widget;
		setTitle(this.widget.getNombre());
    reshape(this.widget.getPosicionX(), this.widget.getPosicionY(), this.widget.getAnchura(), this.widget.getAltura());
		getContentPane().add(this.widget.getVista());
    pack();
	}

	public void hacerAplicacionVisible() {
		this.setVisible(true);
	}

	@Override
	public void componentHidden(ComponentEvent arg0) {}

	@Override
	public void componentMoved(ComponentEvent arg0) {
	  this.widget.setPosicionX(this.getLocation().x);
    this.widget.setPosicionY(this.getLocation().y);
  }

	@Override
	public void componentResized(ComponentEvent arg0) {
    if (this.widget.getVista().getWidth() > 0 && this.widget.getVista().getHeight() > 0) 
    {
      this.widget.setAnchura(this.widget.getVista().getWidth());
      this.widget.setAltura(this.widget.getVista().getHeight());
    }
  }

	@Override
	public void componentShown(ComponentEvent arg0) {}
}
