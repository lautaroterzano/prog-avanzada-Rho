package caber;

import java.io.IOException;
import java.util.List;


public class Main {

	public static void main(String[] args) throws IOException {
		
		List<Concursante> concursantes = Entrada.leerArchivo("concursantes.txt");
		Torneo ganadores = Torneo.iniciarTorneo(concursantes);
		Salida.escribirArchivo(ganadores, "ganadores.txt");
	}

}
