package caber;

public class Lanzamiento {
	private double distancia;
	private double angulo;
	private boolean fallido;

	public boolean isFallido() {
		return fallido;
	}

	public void setFallido(boolean fallido) {
		this.fallido = fallido;
	}

	// constructor parametrizado (aca vienen todos los que se van leyendo linea por
	// linea en la Clase Entrada)
	public Lanzamiento(double distancia, double angulo) {
		if (angulo > 90 || angulo < -90) {
			fallido = true;
			this.distancia = 0;
		} else {
			fallido = false;
			if (this.angulo >= -30 && this.angulo <= 30) {
				this.distancia = distancia;
			} else {
				this.distancia = distancia * 8 / 10;
			}
		}
		this.angulo = angulo;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public void setAngulo(double ang) {
		angulo = ang;
	}

	public double getAngulo() {
		return angulo;
	}
}
