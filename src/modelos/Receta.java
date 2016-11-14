package modelos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Receta {
	
	private String nombre;
	private Collection<Ingrediente>ingredientes;
	private Collection<Proceso>procesos;
	private float IBU;
	private int SRS;
	private int ID;
	private int FD;


	public Receta(String nombre, float iBU, int sRS, int iD, int fD,
			Collection<Ingrediente>ingredientesMacerado,List<String>herramientasMacerado,int tiempoDelProceso,
			int temperaturaEnCelciusMacerado, int mililitrosAguaPorKg,
			
			Collection<Ingrediente>lupulos,List<String>herramientasCoccion,
			int tiempoDelCoccion, float temperaturaEnCelciusCoccion,int volumenMiliInicial, 
			int tiempoAgregacionLupulosAmargos, int tiempoAgregacionLupulosAroma,
			
			Collection<Ingrediente>levaduras,List<String>herramientasDeFermentacion,
			int tiempoDeFermentacionEnDias, float temperaturaEnCelciusFermentacion
			) {
		super();
		this.nombre = nombre;
		ingredientes=  new ArrayList<Ingrediente>();
		this.ingredientes.addAll(ingredientesMacerado);
		this.ingredientes.addAll(lupulos);
		this.ingredientes.addAll(levaduras);
		IBU = iBU;
		SRS = sRS;
		ID = iD;
		FD = fD;
		crearProcesoDeMaceracion(ingredientesMacerado, herramientasMacerado, tiempoDelProceso,
				temperaturaEnCelciusMacerado, mililitrosAguaPorKg);
		
		crearProcesoDeCoccion(lupulos, herramientasCoccion, tiempoDelCoccion,
				temperaturaEnCelciusCoccion, volumenMiliInicial, tiempoAgregacionLupulosAmargos, tiempoAgregacionLupulosAroma);
		
		crearProcesoDeFermentacion(levaduras, herramientasDeFermentacion, tiempoDeFermentacionEnDias, 
				temperaturaEnCelciusFermentacion);
	}
	
	private void crearProcesoDeMaceracion(Collection<Ingrediente>ingredientesMacerado,List<String> herramientasMacerado, 
			int tiempoDelProceso, float temperaturaEnCelcius, int mililitrosAguaPorKg){

		Proceso proceNuevo = new Maceracion("Maceracion", ingredientesMacerado, herramientasMacerado, tiempoDelProceso,
				temperaturaEnCelcius, mililitrosAguaPorKg);
		procesos.add(proceNuevo);
	}
	
	private void crearProcesoDeCoccion(Collection<Ingrediente>lupulos,List<String>herramientasCoccion,
			int tiempoDelCoccion, float temperaturaEnCelcius,int volumenMiliInicial, 
			int tiempoAgregacionLupulosAmargos, int tiempoAgregacionLupulosAroma){
		
		Proceso proceNuevo = new Coccion("Coccion", lupulos, herramientasCoccion, tiempoDelCoccion, temperaturaEnCelcius, 
				volumenMiliInicial, tiempoAgregacionLupulosAmargos, tiempoAgregacionLupulosAroma);
		procesos.add(proceNuevo);
	}
	
	private void crearProcesoDeFermentacion(Collection<Ingrediente>levaduras,List<String>herramientasDeFermentacion,
			int tiempoDeFermentacionEnDias, float temperaturaEnCelcius){
		Proceso proceNuevo = new Fermentacion("Fermentacion", levaduras,herramientasDeFermentacion, tiempoDeFermentacionEnDias, 
				temperaturaEnCelcius);
		procesos.add(proceNuevo);
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


	public Collection<Proceso> getProcesos() {
		return procesos;
	}


	public void setProcesos(Collection<Proceso> procesos) {
		this.procesos = procesos;
	}


	public float getIBU() {
		return IBU;
	}


	public void setIBU(float iBU) {
		IBU = iBU;
	}


	public int getSRS() {
		return SRS;
	}


	public void setSRS(int sRS) {
		SRS = sRS;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public int getFD() {
		return FD;
	}


	public void setFD(int fD) {
		FD = fD;
	}


	public void hacerReceta(){
		/**//////////////////////////////////////////////////////////////////////////////////////////////////////////
	}

	
}
