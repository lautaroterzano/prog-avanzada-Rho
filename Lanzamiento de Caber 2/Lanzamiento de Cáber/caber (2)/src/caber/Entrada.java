package caber;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Entrada {

	public static List<Concursante> leerArchivo(String ruta) throws IOException {
		Scanner lector;
		List<Concursante> listConcursantes = new ArrayList<Concursante>();
		Double dist;
		Double ang;
		try {
			lector = new Scanner(new File(ruta));
			listConcursantes = new ArrayList<Concursante>(lector.nextInt());
			Concursante concursante = new Concursante();
			Lanzamiento lanzamiento;
			int id = 1;
			while (lector.hasNext()) {
				
				for (int i = 0; i < 3 && lector.hasNext(); i++) {
					
					dist = lector.nextDouble();
					ang = lector.nextDouble();
					lanzamiento = new Lanzamiento(dist, ang);
					concursante.getLanzamientos().add(lanzamiento);
				}
				concursante.setId(id);
				listConcursantes.add(concursante);
				
				id++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return listConcursantes;
	}
}
