package es.prueba.app.mainescritorio.widget.app;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class MiniAplicacionConexionVista extends JPanel {
	
	private static final long serialVersionUID = 6321255112096326561L;
	
	private JLabel lblNumeroUsuarios;

	public MiniAplicacionConexionVista() {
		setBorder(new LineBorder(Color.BLACK, 2));
		setPreferredSize(new Dimension(200, 150));
		setMaximumSize(new Dimension(800, 800));
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		panel.setSize(new Dimension(400, 400));
		add(panel);
		panel.setLayout(null);
		
		JLabel lblUsuariosConectados = new JLabel("Usuarios conectados");
		lblUsuariosConectados.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuariosConectados.setBounds(22, 12, 146, 58);
		panel.add(lblUsuariosConectados);
		
		lblNumeroUsuarios = new JLabel("0");
		lblNumeroUsuarios.setFont(new Font("Dialog", Font.BOLD, 22));
		lblNumeroUsuarios.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumeroUsuarios.setBounds(12, 54, 173, 80);
		panel.add(lblNumeroUsuarios);

	}
	public JLabel getLblNumeroUsuarios() {
		return lblNumeroUsuarios;
	}
}
