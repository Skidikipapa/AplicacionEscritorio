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

	private static ArchivoManager archivoManager = null;

	private File directorio;

	private ArchivoManager() {
		this.directorio = new File("widgets/");
		if (!directorio.exists()) directorio.mkdir();
	}

	public static ArchivoManager getInstance() {
		if (archivoManager == null)
			archivoManager = new ArchivoManager();
		return archivoManager;
	}

	public ArrayList<Widget> leerDatosGuardados() {
		ArrayList<Widget> widgets = new ArrayList<Widget>();
		File[] fwidgets = this.directorio.listFiles();
		if (fwidgets != null) {
			try {
				for (File fwidget : fwidgets) {
					try (FileInputStream fileInputStream = new FileInputStream(fwidget);
							ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);) {
						widgets.add((Widget) objectInputStream.readObject());
						fwidget.delete();
					}
				}
			} catch (ClassNotFoundException | IOException e) {
				e.printStackTrace();
			}
		}
		return widgets;
	}

	public void escribirDatos(ArrayList<Widget> applicaciones) {
		applicaciones.forEach(widget -> {
			File widgetFile = new File(directorio.getName() + "/widget" + applicaciones.indexOf(widget));
			try (FileOutputStream fileOutputStream = new FileOutputStream(widgetFile);
					ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);) {
				objectOutputStream.writeObject(widget);
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
	}
}
