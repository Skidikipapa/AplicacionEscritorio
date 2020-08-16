package es.prueba.app.mainescritorio.principal;

import java.awt.Dimension;
import java.util.ArrayList;

import es.prueba.app.mainescritorio.interficies.IEnVentanaCerrada;
import es.prueba.app.mainescritorio.persistencia.ArchivoManager;
import es.prueba.app.mainescritorio.widget.Widget;
import es.prueba.app.mainescritorio.widget.app.MiniAplicacionConexionControl;
import es.prueba.app.mainescritorio.widget.frame.WidgetFrame;

public class PrincipalFrameControl implements IEnVentanaCerrada {

	private PrincipalFrameVista vista = new PrincipalFrameVista(this);

  private ArrayList<Widget> widgetsActivos = new ArrayList<Widget>();

	public PrincipalFrameControl() {

    cargarWidgets();

		this.vista.getBtnVisibilidadBarra().addActionListener(e -> visibilidadBarraLateral());
		
		this.vista.getBtnMiniAplicacion().addActionListener(e -> activarAplicacion(new MiniAplicacionConexionControl()));
	}

  private void cargarWidgets() {
    ArchivoManager manager = ArchivoManager.getInstance();
    ArrayList<Widget> widgetsGuardados = manager.leerDatosGuardados();
    widgetsGuardados.forEach(widget -> activarAplicacion(widget));
    widgetsGuardados = null; 
  }

	private void activarAplicacion(Widget app) {
		WidgetFrame dialog = new WidgetFrame(this);
    preparaWidget(app);
		dialog.cargarAplicacion(app);
		dialog.hacerAplicacionVisible();
		this.vista.getPaneAplicaciones().add(dialog);
	}

  private void preparaWidget(Widget app) {
    widgetsActivos.add(app);
    app.cargarDimensiones();
    app.cargarLocalizacion();
    app.enAbrirWidget();
  }

  @Override
  public void enAplicacionCerrada(Widget widget) {
    widgetsActivos.remove(widget);
    widget.enCerrarWidget();
    widget = null;
  }

  @Override
  public void enVentanaCerrada() {
    ArchivoManager manager = ArchivoManager.getInstance();
    widgetsActivos.forEach(widget -> widget.enCerrarWidget());
    manager.escribirDatos(widgetsActivos);
  }

	private void visibilidadBarraLateral() {
		if (this.vista.getPaneBarraLateral().getLocation().x > 0) {
			this.vista.getPaneBarraLateral().setLocation(this.vista.getPaneBarraLateral().getLocation().x - 160,
					this.vista.getPaneBarraLateral().getLocation().y);
			this.vista.getPaneAplicaciones().setLocation(this.vista.getPaneAplicaciones().getLocation().x - 160,
					this.vista.getPaneAplicaciones().getLocation().y);
			this.vista.getPaneAplicaciones().setSize(new Dimension(this.vista.getPaneAplicaciones().getWidth() + 160,
					this.vista.getPaneAplicaciones().getHeight()));
		} else {
			this.vista.getPaneBarraLateral().setLocation(this.vista.getPaneBarraLateral().getLocation().x + 160,
					this.vista.getPaneBarraLateral().getLocation().y);
			this.vista.getPaneAplicaciones().setLocation(this.vista.getPaneAplicaciones().getLocation().x + 160,
					this.vista.getPaneAplicaciones().getLocation().y);
			this.vista.getPaneAplicaciones().setSize(new Dimension(this.vista.getPaneAplicaciones().getWidth() - 160,
					this.vista.getPaneAplicaciones().getHeight()));
		}
	}

	public void mostrarVista() {
		this.vista.setVisible(true);
	}
}
