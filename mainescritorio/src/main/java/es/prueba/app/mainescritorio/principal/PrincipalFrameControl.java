package es.prueba.app.mainescritorio.principal;

import java.awt.Dimension;

public class PrincipalFrameControl {

	private PrincipalFrameVista vista = new PrincipalFrameVista();

	public PrincipalFrameControl() {
		this.vista.getBtnVisibilidadBarra().addActionListener(e -> visibilidadBarraLateral());
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
