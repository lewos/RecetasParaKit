package modelos;

public class Termometro extends Herramienta{
	
	private float temperatura;

	public Termometro(String nombre) {
		super(nombre);
		this.temperatura = 0;
	}

	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}
	

}
