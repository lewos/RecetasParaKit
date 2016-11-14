package modelos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class Proceso {
	
	protected String nombre;
	protected Collection<Ingrediente>ingredientes;
	protected Collection<Herramienta>herramientas;
	protected int tiempoDelProceso;
	protected float temperaturaEnCelcius;
	
	
	public Proceso(String nombre, Collection<Ingrediente> ingredientes,List<String>herramientasDelProceso,
			int tiempoDelProceso, float temperaturaEnCelcius) {
		super();
		this.nombre = nombre;
		this.ingredientes = ingredientes;
		this.herramientas = cargarHerramientasDelProceso(herramientasDelProceso);
		this.tiempoDelProceso = tiempoDelProceso;
		this.temperaturaEnCelcius = temperaturaEnCelcius;
	}
	
	private Collection<Herramienta> cargarHerramientasDelProceso(List<String>herramientasDelProceso){
		Collection<Herramienta>herramientasPro =  new ArrayList<Herramienta>();;
		int i =0;
		while(!herramientasDelProceso.isEmpty()){
			Herramienta aux = buscarHerramienta(herramientasDelProceso.get(i));
			if(aux!=null){
				herramientasPro.add(aux);
			}
			i++;
		}
		return herramientasPro;
	}
	
	private Herramienta buscarHerramienta(String nombre){
		Herramienta herramienta= null;
		Iterator<Herramienta> it = herramientas.iterator();
		while(it.hasNext()){
			 herramienta = it.next();
			if(herramienta.getNombre().equals(nombre)){
				return herramienta;
			}
		}
		return herramienta;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Collection<Ingrediente> getIngredientes() {
		return ingredientes;
	}


	public void setIngredientes(Collection<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}


	public Collection<Herramienta> getHerramientas() {
		return herramientas;
	}


	public void setHerramientas(Collection<Herramienta> herramientas) {
		this.herramientas = herramientas;
	}


	public int getTiempoDelProceso() {
		return tiempoDelProceso;
	}


	public void setTiempoDelProceso(int tiempoDelProceso) {
		this.tiempoDelProceso = tiempoDelProceso;
	}


	public float getTemperaturaEnCelcius() {
		return temperaturaEnCelcius;
	}


	public void setTemperaturaEnCelcius(float temperaturaEnCelcius) {
		this.temperaturaEnCelcius = temperaturaEnCelcius;
	}


	public abstract boolean termino();

}
