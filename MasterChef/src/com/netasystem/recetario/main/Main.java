package com.netasystem.recetario.main;

import java.util.ArrayList;
import java.util.List;

import com.netasystem.recetario.contenido.*;



public class Main {

	public static void main(String[] args) {
		
	List <String> ingredientes = new ArrayList<String>();
	ingredientes.add("pollo");
	ingredientes.add("mole");
		
	List <String> ingredientes2 = new ArrayList<String>();
	ingredientes.add("tortilla");
	ingredientes.add("queso");
	
	List <Receta> r = new ArrayList<>();
	
	
	
	Receta rec1 = new Receta("osvaldo","pollo con mole", ingredientes);
	Receta rec2 = new Receta("alan","queso", ingredientes2);
	
	r.add(rec1);
	r.add(rec2);
	
	for (Object o: r) {
		System.out.println(o);
	}
	
	
		
	
				
				
		
		

	}

}
