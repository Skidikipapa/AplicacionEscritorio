package es.prueba.app.mainescritorio.principal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import es.prueba.app.mainescritorio.interficies.EnVentanaCerrada;

public class PrincipalFrameVista extends JFrame {

	private static final long serialVersionUID = -8871435606857730915L;

	private JPanel panePrincipal;
	private JButton btnVisibilidadBarra;
	private JPanel paneBarraLateral;
	private JPanel paneAplicaciones;
	private JButton btnMiniAplicacion;

	public PrincipalFrameVista(EnVentanaCerrada enVentanaCerrada) {

		setMinimumSize(new Dimension(1000, 600));
		setMaximumSize(new Dimension(1000, 600));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 895, 693);
		panePrincipal = new JPanel();
		panePrincipal.setMinimumSize(new Dimension(1000, 600));
		panePrincipal.setMaximumSize(new Dimension(1000, 600));
		panePrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panePrincipal);
		panePrincipal.setLayout(new BorderLayout(0, 0));

		paneBarraLateral = new JPanel();
		paneBarraLateral.setPreferredSize(new Dimension(200, 800));
		paneBarraLateral.setMinimumSize(new Dimension(200, 800));
		paneBarraLateral.setMaximumSize(new Dimension(200, 800));
		paneBarraLateral.setBackground(Color.LIGHT_GRAY);
		paneBarraLateral.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panePrincipal.add(paneBarraLateral, BorderLayout.WEST);
		paneBarraLateral.setLayout(new BorderLayout(0, 0));

		JPanel panelIconoWidgets = new JPanel();
		panelIconoWidgets.setPreferredSize(new Dimension(160, 800));
		panelIconoWidgets.setMinimumSize(new Dimension(160, 800));
		panelIconoWidgets.setMaximumSize(new Dimension(160, 800));
		paneBarraLateral.add(panelIconoWidgets, BorderLayout.CENTER);
		panelIconoWidgets.setLayout(null);

		btnMiniAplicacion = new JButton("App 1");
		btnMiniAplicacion.setBounds(30, 28, 96, 74);
		panelIconoWidgets.add(btnMiniAplicacion);

		JPanel panelBoton = new JPanel();
		panelBoton.setPreferredSize(new Dimension(40, 800));
		panelBoton.setMinimumSize(new Dimension(40, 800));
		panelBoton.setMaximumSize(new Dimension(40, 800));
		paneBarraLateral.add(panelBoton, BorderLayout.EAST);

		btnVisibilidadBarra = new JButton(">");
		btnVisibilidadBarra.setBorder(null);
		btnVisibilidadBarra.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVisibilidadBarra.setPreferredSize(new Dimension(40, 642));
		btnVisibilidadBarra.setMinimumSize(new Dimension(40, 800));
		btnVisibilidadBarra.setMaximumSize(new Dimension(40, 800));
		btnVisibilidadBarra.setHorizontalTextPosition(SwingConstants.CENTER);
		panelBoton.add(btnVisibilidadBarra);

		paneAplicaciones = new JPanel();
		paneAplicaciones.setBorder(new LineBorder(Color.LIGHT_GRAY));
		paneAplicaciones.setMinimumSize(new Dimension(600, 800));
		paneAplicaciones.setMaximumSize(new Dimension(800, 800));
		panePrincipal.add(paneAplicaciones, BorderLayout.CENTER);
		paneAplicaciones.setLayout(null);
		
		addWindowListener(new WindowListener() {
			@Override
			public void windowClosed(WindowEvent args) {}

			@Override
			public void windowActivated(WindowEvent arg0) {}

			@Override
			public void windowClosing(WindowEvent arg0) {
				enVentanaCerrada.enVentanaCerrada();
			}

			@Override
			public void windowDeactivated(WindowEvent arg0) {}

			@Override
			public void windowDeiconified(WindowEvent arg0) {}

			@Override
			public void windowIconified(WindowEvent arg0) {}

			@Override
			public void windowOpened(WindowEvent arg0) {}
		});
	}

	public JButton getBtnVisibilidadBarra() {
		return btnVisibilidadBarra;
	}

	public JPanel getPaneBarraLateral() {
		return paneBarraLateral;
	}

	public JPanel getPaneAplicaciones() {
		return paneAplicaciones;
	}

	public JButton getBtnMiniAplicacion() {
		return btnMiniAplicacion;
	}
}
