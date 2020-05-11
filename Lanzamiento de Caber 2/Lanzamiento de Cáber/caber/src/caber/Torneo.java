package caber;

import java.awt.List;
import java.util.ArrayList;

public class Torneo {
	//private ArrayList<Concursante> concursantes = new ArrayList<Concursante>();
	private double distTotal  = 0;
	
	
	public void iniciarTorneo(ArrayList<Concursante> concursantes) { //Recibe la lista de concursantes y cada concursante tiene cargados sus lanzamientos
		comenzarLanzamientos(concursantes); //Se van a validar los lanzamientos con cada restriccion 
		determinarGanadores(concursantes); //Se van a determinar las distancias totales y consistencia de cada participante
		
		//despues de realizar estos dos metodos el main ya va a tener la lista de concursantes modificada para ser grabada nuevamente con los ganadores
	}
	
	private void determinarGanadores(ArrayList<Concursante> concursantes) {
		// TODO Auto-generated method stub
		for(Concursante c : concursantes) {
			for(Lanzamiento l : c.getLanzamientos()) {
				c.setDistTotal(c.getDistTotal() + l.getDistancia());
			}
			c.setConsistencia(Consistencia.calcularConsistencia(c.getLanzamientos()));//se le setea la consistencia a cada concursante
		}		
		ganadorDistanciaTotal(concursantes);//se ordena las distancias
		ganadorConsistencia(concursantes);//seordenan las consistencias
	}

	private void ganadorDistanciaTotal(ArrayList<Concursante> concursantes) {
		concursantes.sort();
	}
	
	private void ganadorConsistencia(ArrayList<Concursante> concursantes) {
		concursantes.sort();
	}
	
	private void comenzarLanzamientos(ArrayList<Concursante> concursantes) {
		for(Concursante c : concursantes) {
			c.lanzar();			//se van a modificar los tiros de cada concursante
		}		
	}	
}
