package es.prueba.app.mainescritorio.principal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import javax.swing.border.EtchedBorder;

public class PrincipalFrameVista extends JFrame {

	private JPanel panePrincipal;
	private JButton btnVisibilidadBarra;
	private JPanel paneBarraLateral;
	private JPanel paneAplicaciones;

	public PrincipalFrameVista() {
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
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(30, 28, 96, 74);
		panelIconoWidgets.add(btnNewButton);
		
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
}
