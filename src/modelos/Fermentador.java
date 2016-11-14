package modelos;

public class Fermentador extends Herramienta{
	
	private String material;
	private float capacidadLitros;
	private boolean airlock;
	
	public Fermentador(String nombre, String material, float capacidadLitros, boolean airlock) {
		super(nombre);
		this.material = material;
		this.capacidadLitros = capacidadLitros;
		this.airlock = airlock;
	}
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public float getCapacidadLitros() {
		return capacidadLitros;
	}
	public void setCapacidadLitros(float capacidadLitros) {
		this.capacidadLitros = capacidadLitros;
	}
	public boolean isAirlock() {
		return airlock;
	}
	public void setAirlock(boolean airlock) {
		this.airlock = airlock;
	}
	

}
