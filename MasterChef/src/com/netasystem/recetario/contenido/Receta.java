package com.netasystem.recetario.contenido;

import java.util.List;

public class Receta {

	public Receta(String nombrechef, String nombrereceta, List listamateriales) {
		super();
		this.nombrechef = nombrechef;
		this.nombrereceta = nombrereceta;
		this.listamateriales = listamateriales;
	}
	private String nombrechef;
	private String nombrereceta;
	private List<String> listamateriales;
	
	public void mostrar () {
		
		for (String l : listamateriales) {
			System.out.println(l);
		}
	}
	
	
	
	public String getNombrechef() {
		return nombrechef;
	}
	public void setNombrechef(String nombrechef) {
		this.nombrechef = nombrechef;
	}
	public String getNombrereceta() {
		return nombrereceta;
	}
	public void setNombrereceta(String nombrereceta) {
		this.nombrereceta = nombrereceta;
	}
	public List getListamateriales() {
		return listamateriales;
	}
	public void setListamateriales(List listamateriales) {
		this.listamateriales = listamateriales;
	}
	@Override
	public String toString() {
		return "Receta [nombrechef=" + nombrechef + ", nombrereceta=" + nombrereceta + ", listamateriales="
				+ listamateriales + "]";
	}
	
	
	
}
