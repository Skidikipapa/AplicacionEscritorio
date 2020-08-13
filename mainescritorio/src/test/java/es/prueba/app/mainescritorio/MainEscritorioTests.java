package es.prueba.app.mainescritorio;

import es.prueba.app.mainescritorio.rest.ClienteRest;
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
	}
}
