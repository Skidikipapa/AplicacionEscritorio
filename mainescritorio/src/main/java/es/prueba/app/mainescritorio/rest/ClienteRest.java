package es.prueba.app.mainescritorio.rest;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ClienteRest {
  
  private static ClienteRest rest = null;

	private String urlServidor;

	private ClienteRest() {
		this.urlServidor = "http://localhost:8080/";
	}

	public static ClienteRest getInstancia() {
		if (rest == null)
			rest = new ClienteRest();
		return rest;
	}

	public String consultaConexion() {
    String resultado = "";
    int caracter = 0;
		try 
    {
			URL url = new URL(urlServidor);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			try (InputStream respuesta = con.getInputStream();) 
      {
				while ((caracter = respuesta.read()) != -1) 
        {
					resultado += ((char) caracter);
				}
				return resultado;
			}
		} catch (IOException e) {
			return "Error 404";
		}
	}

	public String añadeConexion() {
		return modificaConexion("1");
	}

	public String reduceConexion() {
		return modificaConexion("-1");
	}

	private String modificaConexion(String modificador) {
    String respuesta = "";
    String output;
		try 
    {
			URL url = new URL(urlServidor);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Content-Type", "application/json");
			con.setDoOutput(true);
			try (DataOutputStream wr = new DataOutputStream(con.getOutputStream());) 
      {
				wr.writeBytes(modificador);
				wr.flush();
			}

			if (con.getResponseCode() == HttpURLConnection.HTTP_OK) 
      {
				try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));) 
        {
					while ((output = in.readLine()) != null) {
						respuesta += output;
					}
					return respuesta;
				}
			}
			else return "Error 404";
		} catch (IOException e) {
			return "Error 404";
		}
	}
}
