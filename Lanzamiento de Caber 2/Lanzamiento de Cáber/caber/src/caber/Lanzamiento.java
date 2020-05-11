package caber;

public class Lanzamiento {
	private double distanciaBase;
	private double distancia;
	private double angulo;

	//constructor parametrizado (aca vienen todos los que se van leyendo linea por linea en el main)
	public Lanzamiento(double distancia,double angulo) {
		this.distanciaBase=distancia;
		this.angulo=angulo;
	}
	
	//calcula distancia(Final) por tiro verificando las restricciones aplicadas a la distanciaBase(inicial)
	
	public void calcularDistancia() {
		if(this.angulo > 30 || this.angulo < 30)
			this.distancia = this.distanciaBase;
	}
	
	

	public double getDistancia() {
		return distancia;
	}
	
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
}
