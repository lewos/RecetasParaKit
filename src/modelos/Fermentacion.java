package modelos;

import java.util.Collection;
import java.util.List;

public class Fermentacion extends Proceso{

	public Fermentacion(String nombre, Collection<Ingrediente> levaduras, List<String> herramientas,
			int tiempoDeFermentacionEnDias, float temperaturaEnCelcius) {
		super(nombre, levaduras, herramientas, tiempoDeFermentacionEnDias, temperaturaEnCelcius);
		
	}

	@Override
	public boolean termino() {
		return tiempoDelProceso==0;
	}
	
}
