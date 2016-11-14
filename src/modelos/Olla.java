package modelos;

public class Olla extends Herramienta{
	
	private float capacidadLitros;
	private boolean falsoFondo;// no si va o no
	private String material;
	
	public Olla(String nombre, float capacidadLitros, boolean falsoFondo, String material) {
		super(nombre);
		this.capacidadLitros = capacidadLitros;
		this.falsoFondo = falsoFondo;
		this.material = material;
	}
	
	public float getCapacidadLitros() {
		return capacidadLitros;
	}
	public void setCapacidadLitros(float capacidadLitros) {
		this.capacidadLitros = capacidadLitros;
	}
	public boolean isFalsoFondo() {
		return falsoFondo;
	}
	public void setFalsoFondo(boolean falsoFondo) {
		this.falsoFondo = falsoFondo;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	

}
