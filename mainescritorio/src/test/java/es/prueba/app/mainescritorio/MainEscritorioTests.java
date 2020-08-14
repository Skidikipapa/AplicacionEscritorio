package es.prueba.app.mainescritorio;

import java.util.ArrayList;

import es.prueba.app.mainescritorio.persistencia.ArchivoManager;
import es.prueba.app.mainescritorio.rest.ClienteRest;
import es.prueba.app.mainescritorio.widget.Widget;
import es.prueba.app.mainescritorio.widget.app.MiniAplicacionConexionControl;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MainEscritorioTests extends TestCase {
	public MainEscritorioTests(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(MainEscritorioTests.class);
	}

	public void testApp() {
		ClienteRest rest = ClienteRest.getInstancia();
		assertEquals("0", rest.consultaConexion());
		assertEquals("1", rest.añadeConexion());
		assertEquals("2", rest.añadeConexion());
		assertEquals("1", rest.reduceConexion());
		
		Widget widget = new MiniAplicacionConexionControl();
		Widget widget1 = new MiniAplicacionConexionControl();
		Widget widget2 = new MiniAplicacionConexionControl();
		
		ArrayList<Widget> widgetsGuardados = new ArrayList<Widget>();
		
		widgetsGuardados.add(widget);
		widgetsGuardados.add(widget1);
		widgetsGuardados.add(widget2);
		
		ArchivoManager manager = ArchivoManager.getInstance();
		
		manager.escribirDatos(widgetsGuardados);
		
		ArrayList<Widget> widgetsLeidos = new ArrayList<Widget>();
		
		widgetsLeidos = manager.leerDatosGuardados();
		
		for (int i = 0; i < widgetsGuardados.size(); i++) 
		{
			assertEquals(true, widgetsGuardados.get(i).toString().contentEquals(widgetsLeidos.get(i).toString()));
		}
	}
}
