package modelos;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Maceracion extends Proceso{
	
	private int aguaPorCantDeGranosEnMili;
	private int mililitrosAguaPorKg;
	
	public Maceracion(String nombre, Collection<Ingrediente> ingredientes, List<String> herramientas,
			int tiempoDelProceso, float temperaturaEnCelcius, int mililitrosAguaPorKg) {
		super(nombre, ingredientes, herramientas, tiempoDelProceso, temperaturaEnCelcius);
		this.mililitrosAguaPorKg = mililitrosAguaPorKg;
		aguaPorCantDeGranosEnMili = calcularAguaPorCantDeGranos(ingredientes,mililitrosAguaPorKg);
	}
	
	public int getAguaPorCantDeGranosEnMili() {
		return aguaPorCantDeGranosEnMili;
	}

	public void setAguaPorCantDeGranosEnMili(int aguaPorCantDeGranosEnMili) {
		this.aguaPorCantDeGranosEnMili = aguaPorCantDeGranosEnMili;
	}

	public int getMililitrosAguaPorKg() {
		return mililitrosAguaPorKg;
	}

	public void setMililitrosAguaPorKg(int mililitrosAguaPorKg) {
		this.mililitrosAguaPorKg = mililitrosAguaPorKg;
	}

	private int calcularAguaPorCantDeGranos(Collection<Ingrediente>ingredientes, int mililitrosAguaPorKg){
		int cantTotalDeGramos=0;
		Iterator<Ingrediente> itIng = ingredientes.iterator();
		while(itIng.hasNext()){
			cantTotalDeGramos=+itIng.next().getCantEnGramos();
		}
		return cantTotalDeGramos*mililitrosAguaPorKg;
	}

	@Override
	public boolean termino() {
		return tiempoDelProceso==0;
	}
		


}
