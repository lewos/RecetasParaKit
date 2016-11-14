package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import controlador.Controlador;
import modelos.Herramienta;
import modelos.Ingrediente;
import modelos.Receta;

public class MainRecetas {
	
	private static Controlador controlador;

	public static void main(String[] args) {
		
		/**
		 * PALE ALE

	CANTIDAD GRANO 
	4,3 Kgs. Malta pilsen 
	3,70 Kgs.-Malta Caramelo 
	Levadura Ale Inlgesa III o Levadura Seca Windsor

	PARÁMETROS 
	IBU: 32 
	Densidad inicial: 1053 
	Densidad final: 1013 
	SRM: 16

	MACERACIÓN

	3 lts. de agua por Kg. de grano 
	Temperatura de 65°;C 

	COCCION 
	90 minutos 
	Lúpulo amargor Cascade agregado faltando 45'y 60' de hervor 
	Lúpulo sabor Kent Golding o Cascade agregado faltando 2' de hervor 
	1 cucharadita de Irish Moss faltantando 10' de hervor

	EMBOTELLAR 
	Agregar 6 grs. de azúcar de maíz por litro de cerveza*/	
		
		Collection<Ingrediente>ingredientes = new ArrayList<Ingrediente>();
		
		Collection<Ingrediente>ingredientesMacerado =  new ArrayList<Ingrediente>();
		ingredientesMacerado.add(new Ingrediente("Malta pilsen", 4300));
		ingredientesMacerado.add(new Ingrediente("Malta Caramelo", 3700));
		
		List<String>herramientasMacerado =  new ArrayList<String>();;
		herramientasMacerado.add("Olla");
		
		
		Collection<Ingrediente>lupulos =  new ArrayList<Ingrediente>();
		lupulos.add(new Ingrediente("Lúpulo amargor Cascade", 3));// no dicen los gramos
		lupulos.add(new Ingrediente("Lúpulo sabor Kent Golding", 3));
		
		List<String>herramientasCoccion =  new ArrayList<String>();;
		herramientasCoccion.add("Olla");
		herramientasCoccion.add("Densimetro");
		
		Collection<Ingrediente> levaduras =  new ArrayList<Ingrediente>();
		levaduras.add(new Ingrediente("Levadura Ale Inlgesa III", 3));// no dicen los gramos
		
		List<String>herramientasDeFermentacion =  new ArrayList<String>();
		herramientasDeFermentacion.add("Fermentador");
		
		
		ingredientes.addAll(ingredientesMacerado);
		ingredientes.addAll(lupulos);
		ingredientes.addAll(levaduras);
		
		
		
		
		Collection<Receta> recetas=  new ArrayList<Receta>();;
		Receta recetaNueva = new Receta("PALE ALE", 32, 16, 1053, 1013,
				ingredientesMacerado, herramientasMacerado,60, 65, 3000, 
				
				lupulos, herramientasCoccion, 65, 66, 20000,
				45,60,
				
				
				levaduras, herramientasDeFermentacion,15, 59);
		recetas.add(recetaNueva);
		
		controlador= new Controlador(recetas);
		
		controlador.crearHerramientasDelKit();
		
		
		Receta  r = controlador.buscarReceta("PALE ALE");
		System.out.println(r.getNombre()+"\n"+
		r.getIBU()+"\n"+r.getSRS()+"\n"+r.getID()+"\n"+r.getFD()+"\n"		
				);


	}

}
