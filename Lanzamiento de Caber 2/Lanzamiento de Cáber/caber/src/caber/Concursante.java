package caber;

import java.util.ArrayList;

public class Concursante {
	private ArrayList<Lanzamiento> lanzamientos = new ArrayList<Lanzamiento>();
	private double distTotal;
	private int id;
	private boolean fallido;
	private double consistencia;
	
	public void lanzar() {
		for(Lanzamiento l : this.lanzamientos) //se itera la lista de lanzamientos para modificar de acuerdo a las restricciones
			l.calcularDistancia();	
	}
	
	public double getConsistencia() {
		return consistencia;
	}

	public void setConsistencia(double consistencia) {
		this.consistencia = consistencia;
	}


	public ArrayList<Lanzamiento> getLanzamientos() {
		return lanzamientos;
	}

	public void setLanzamientos(ArrayList<Lanzamiento> lanzamientos) {
		this.lanzamientos = lanzamientos;
	}

	public double getDistTotal() {
		return distTotal;
	}
	
	public void setDistTotal(double distTotal) {
		this.distTotal = distTotal;
	}
}
