package modelos;

import java.util.Collection;
import java.util.List;

public class Coccion extends Proceso{
	
	private int volumenMiliInicial;
	private int tiempoAgregacionLupulosAmargos;
	private int tiempoAgregacionLupulosAroma;

	public Coccion(String nombre, Collection<Ingrediente> lupulos, List<String> herramientas,
			int tiempoDelCoccion, float temperaturaEnCelcius,int volumenMiliInicial,int tiempoAgregacionLupulosAmargos,int tiempoAgregacionLupulosAroma) {
		super(nombre, lupulos, herramientas, tiempoDelCoccion, temperaturaEnCelcius);
		this.volumenMiliInicial=volumenMiliInicial;
		this.tiempoAgregacionLupulosAmargos= tiempoAgregacionLupulosAmargos;
		this.tiempoAgregacionLupulosAroma= tiempoAgregacionLupulosAroma;
	}

	public int getVolumenMiliInicial() {
		return volumenMiliInicial;
	}

	public void setVolumenMiliInicial(int volumenMiliInicial) {
		this.volumenMiliInicial = volumenMiliInicial;
	}

	public int getTiempoAgregacionLupulosAmargos() {
		return tiempoAgregacionLupulosAmargos;
	}

	public void setTiempoAgregacionLupulosAmargos(int tiempoAgregacionLupulosAmargos) {
		this.tiempoAgregacionLupulosAmargos = tiempoAgregacionLupulosAmargos;
	}

	public int getTiempoAgregacionLupulosAroma() {
		return tiempoAgregacionLupulosAroma;
	}

	public void setTiempoAgregacionLupulosAroma(int tiempoAgregacionLupulosAroma) {
		this.tiempoAgregacionLupulosAroma = tiempoAgregacionLupulosAroma;
	}

	@Override
	public boolean termino() {
		return tiempoDelProceso==0;
	}

	

}
