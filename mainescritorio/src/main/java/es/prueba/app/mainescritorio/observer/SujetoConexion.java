package es.prueba.app.mainescritorio.observer;

import java.util.ArrayList;
import java.util.List;

import es.prueba.app.mainescritorio.interficies.IObservador;
import es.prueba.app.mainescritorio.interficies.ISujeto;

public class SujetoConexion implements ISujeto, Runnable {

	 private List<IObservador> observadores;
	
	public SujetoConexion() 
	{
		this.observadores = new ArrayList<IObservador>();
	}
	
	public void añadirObservador(IObservador observador) 
	{
		this.observadores.add(observador);
	}
	
	public void borrarObserver(IObservador observador) 
	{
		this.observadores.remove(observador);
	}

	public void avisaObservador() {
		for (IObservador observador : observadores) observador.actualiza();
	}
	
	public void run() {
		while(true) 
		{			
	     try {
	      Thread.sleep(50000);
		  	avisaObservador();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
}
