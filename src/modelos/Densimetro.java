package modelos;

public class Densimetro extends Herramienta{
	private float medicionDE;

	public Densimetro(String nombre) {
		super(nombre);
		this.medicionDE = 0;
	}

	public float getMedicionDE() {
		return medicionDE;
	}

	public void setMedicionDE(float medicionDE) {
		this.medicionDE = medicionDE;
	}

}
