package controlador;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import modelos.Densimetro;
import modelos.Fermentador;
import modelos.Herramienta;
import modelos.Ingrediente;
import modelos.Olla;
import modelos.Receta;
import modelos.Termometro;

public class Controlador {
	
	private Collection<Receta> recetas ;
	private Collection<Herramienta> herramientas ;
	private Collection<Ingrediente> ingredientes ;
	
	public Controlador(Collection<Receta> recetas) {
		super();
		this.recetas = recetas;
		this.herramientas = null;
		this.ingredientes = null;	
	}
	
	public Collection<Receta> getRecetas() {
		return recetas;
	}
	public void setRecetas(Collection<Receta> recetas) {
		this.recetas = recetas;
	}
	public Collection<Herramienta> getHerramientas() {
		return herramientas;
	}
	public void setHerramientas(Collection<Herramienta> herramientas) {
		this.herramientas = herramientas;
	}
	public Collection<Ingrediente> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(Collection<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	/*CRU recetas

	hacerCervezaDeReceta
	clonarReceta;

	*/
		
	public void crearReceta(String nombre, float iBU, int sRS, int iD, int fD,
			
			
			Collection<Ingrediente>ingredientesMacerado,List<String>herramientasMacerado,int tiempoDelProceso,
			int temperaturaEnCelciusMacerado, int aguaPorKg, int mililitrosAguaPorKg,
			
			Collection<Ingrediente>lupulos,List<String>herramientasCoccion,
			int tiempoDelCoccion, float temperaturaEnCelciusCoccion,int volumenMiliInicial, 
			int tiempoAgregacionLupulosAmargos, int tiempoAgregacionLupulosAroma,
			
			Collection<Ingrediente>levaduras,List<String>herramientasDeFermentacion,
			int tiempoDeFermentacionEnDias, float temperaturaEnCelciusFermentacion){
		
		
		

		Receta nuevaReceta = new Receta(nombre, iBU, sRS, iD, fD, ingredientesMacerado, herramientasMacerado, 
				tiempoDelProceso, temperaturaEnCelciusMacerado, mililitrosAguaPorKg, 
								
				lupulos, herramientasCoccion, tiempoDelCoccion, temperaturaEnCelciusCoccion, volumenMiliInicial, 
				tiempoAgregacionLupulosAmargos, tiempoAgregacionLupulosAroma,
								
				levaduras, herramientasDeFermentacion,
				tiempoDeFermentacionEnDias, temperaturaEnCelciusFermentacion);
				
		
	recetas.add(nuevaReceta);
	
	}
	
	/*map  para cargar ingredientes en vez de pasar una collecion al crear Receta
	public Collection<Ingrediente> cargarIngredientesMaceradoReceta(String nombreReceta,
		 Map<String,Integer>mapa){
		
		Collection<Ingrediente> ingredientesMacerado = null;
		Set<String> keySet =mapa.keySet();
		Ingrediente ingAux = null;
		Iterator<String> itKeySet = keySet.iterator();
			while(itKeySet.hasNext()){
				String aux = itKeySet.next();
				ingAux = new Ingrediente(aux, mapa.get(aux));
				ingredientesMacerado.add(ingAux);
			}
		return ingredientesMacerado;
	}
	*/
	public Receta buscarReceta(String nombre){
		Iterator<Receta> itRece = recetas.iterator();
		Receta rec = null;
		while(itRece.hasNext()){
			rec= itRece.next();
			if(rec.getNombre().equals(nombre)){
				return rec;
			}
		}
		return rec;
	}
	/*
	public void mostarReceta(String nombre){
		Receta rec= buscarReceta(nombre);
		
	}
	
	*/
	
	
	/*CRUD Olla*/
	private void crearOlla(float capacidadLitros,boolean falsoFondo, String material){
		Herramienta herramientaNueva = new Olla("Olla",capacidadLitros,falsoFondo,material);
		herramientas.add(herramientaNueva);
		//herramientas.add(new Olla("Olla",capacidadLitros,falsoFondo,material));
	}
	public void modificarOlla(String nombre,float capacidadLitros){
		/******************************************************************************************************
		 * falta sacarle el cast*/
		Olla herramientaQueBusco = (Olla) buscarHerramienta(nombre);
		herramientaQueBusco.setCapacidadLitros(capacidadLitros);
	}
	public void eliminarOlla(String nombre){
		herramientas.remove(buscarHerramienta(nombre));
	}
	/*cargarOlla*/
	
	
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
	
	private void crearDensimetro(){
		Densimetro den = new Densimetro("Densimetro");
		herramientas.add(den);
	}
	/*tomarMedicion*/
	
	private void crearTermometro(){
		Termometro ter = new Termometro("Termometro");
		herramientas.add(ter);
	}
	
	/*tomarMedicion*/
	/*CRUD fermentador*/
	private void crearFermentador(String nombre, String material,float capacidadLitros,boolean airlock){
		Fermentador fermentador = new Fermentador(nombre, material, capacidadLitros, airlock);
		herramientas.add(fermentador);
	}
	public void modificarFermentador(String nombre,float capacidadLitros){
		Fermentador fermentador = (Fermentador)buscarHerramienta(nombre);
		fermentador.setCapacidadLitros(capacidadLitros);
	}
	public void eliminarFermentador(String nombre){
		Fermentador fermentador = (Fermentador)buscarHerramienta(nombre);
		herramientas.remove(fermentador);
	}

	/*CRUD ingrediente*/
	public void crearIngrediente(String nombre,int cantEnGramos){
		Ingrediente ingNuevo = new Ingrediente(nombre, cantEnGramos);
		ingredientes.add(ingNuevo);
	}
	public void modificarIngrediente(String nombre, int cantEnGramos){
		Ingrediente ingB = buscarIngrediente(nombre);
		ingB.setCantEnGramos(cantEnGramos);
	}
	private Ingrediente buscarIngrediente(String nombre){
		Ingrediente aux=null;
		Iterator<Ingrediente> itIngr = ingredientes.iterator();
		while(itIngr.hasNext()){
			aux= itIngr.next();
			if(aux.getNombre().equals(nombre))
				return aux;
		}
		return aux;
	}
	public void eliminarIngrediente(String nombre){
		Ingrediente ingB = buscarIngrediente(nombre);
		ingredientes.remove(ingB);
	}
	
	public void crearHerramientasDelKit(){
		crearDensimetro();
		crearTermometro();
		crearFermentador("Fermentador", "plastico", 20, true);
		crearOlla(25, true, "aluminio");
		
	}
	
	
	
	
	
	
	
	
}
