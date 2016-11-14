package modelos;

public class Ingrediente {

	private String nombre;
	private int cantEnGramos;
	
	public Ingrediente(String nombre, int cantEnGramos) {
		super();
		this.nombre = nombre;
		this.cantEnGramos = cantEnGramos;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantEnGramos() {
		return cantEnGramos;
	}
	public void setCantEnGramos(int cantEnGramos) {
		this.cantEnGramos = cantEnGramos;
	}

	
	
}
