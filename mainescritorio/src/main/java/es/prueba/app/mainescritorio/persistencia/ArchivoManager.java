package es.prueba.app.mainescritorio.persistencia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import es.prueba.app.mainescritorio.widget.Widget;

public class ArchivoManager {

	private String directorio = ("widgets/");

	private static ArchivoManager archivoManager = new ArchivoManager();

	private ArchivoManager() {
	}

	public static ArchivoManager getInstance() {
		return archivoManager;
	}

	public ArrayList<Widget> leerDatosGuardados() {
    try {
    ArrayList<Widget> widgets = new ArrayList<Widget>();
		File fdirectorio = new File(directorio);
		File[] fwidgets = fdirectorio.listFiles();
		for (File fwidget : fwidgets) {
			try (FileInputStream fileInputStream = new FileInputStream(fwidget);
					ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);) {
				  widgets.add((Widget) objectInputStream.readObject());
          fwidget.delete();
			} 
		}
  
		return widgets;
    } catch (ClassNotFoundException | IOException e) { e.printStackTrace(); return null;}

    
	}

	public void escribirDatos(ArrayList<Widget> applicaciones) {
      applicaciones.forEach(widget -> {
			try (FileOutputStream fileOutputStream = new FileOutputStream(
					directorio + "widget" + applicaciones.indexOf(widget));
					ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);) {
				objectOutputStream.writeObject(widget);
			} catch (IOException e) {}
		});
   }
}
