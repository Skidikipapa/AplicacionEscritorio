package es.prueba.app.mainescritorio.widget.app;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class MiniAplicacionConexionVista extends JPanel {
	
	private static final long serialVersionUID = 6321255112096326561L;
	
	private JLabel lblNumeroUsuarios;

	public MiniAplicacionConexionVista() {
		setPreferredSize(new Dimension(400, 400));
		setMaximumSize(new Dimension(400, 400));
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		panel.setSize(new Dimension(400, 400));
		add(panel);
		panel.setLayout(null);
		
		JLabel lblUsuariosConectados = new JLabel("Usuarios conectados:");
		lblUsuariosConectados.setBounds(129, 82, 160, 58);
		panel.add(lblUsuariosConectados);
		
		lblNumeroUsuarios = new JLabel("0");
		lblNumeroUsuarios.setFont(new Font("Dialog", Font.BOLD, 24));
		lblNumeroUsuarios.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumeroUsuarios.setBounds(148, 176, 99, 104);
		panel.add(lblNumeroUsuarios);

	}
	public JLabel getLblNumeroUsuarios() {
		return lblNumeroUsuarios;
	}
}
