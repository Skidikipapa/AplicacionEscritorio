package es.prueba.app.mainescritorio.rest;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ClienteRest {

  public String urlServidor;

  private static ClienteRest rest = null;

  private ClienteRest() {
    this.urlServidor = "http://localhost:8080/";
  }

  public static ClienteRest getInstancia() {
    if (rest == null)
      rest = new ClienteRest();
    return rest;
  }

  public String consultaConexion() {
    try {
			URL url = new URL(urlServidor);			
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			try(InputStream respuesta = con.getInputStream();) 
			{
				StringBuilder resultado = new StringBuilder();
				int c = 0;
				while ((c = respuesta.read()) != -1) {
					resultado.append((char) c);
				}
				return resultado.toString();
			}
		} catch (IOException e) {
			return "-1";
		}
  }
}
