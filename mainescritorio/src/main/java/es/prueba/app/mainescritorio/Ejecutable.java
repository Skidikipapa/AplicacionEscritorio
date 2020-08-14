package es.prueba.app.mainescritorio;

import java.awt.EventQueue;

import es.prueba.app.mainescritorio.principal.PrincipalFrameControl;

public class Ejecutable 
{
    public static void main( String[] args )
    {
    	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalFrameControl principal = new PrincipalFrameControl();
					principal.mostrarVista();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }
}
