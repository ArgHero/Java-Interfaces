package org.generation.classes;

import org.generation.interfaces.FiguraGeometrica;

public class Cuadrado implements FiguraGeometrica {
	
	private String nombre;
	private double lado;
	
	public Cuadrado(String nombre, double lado) {
		super();
		this.nombre = nombre;
		this.lado = lado;
	}
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public double calcularArea() {
		return this.getLado()*this.getLado();
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 4*this.getLado();
	}

	@Override
	public String toString() {
		return "Cuadrado [nombre=" + nombre + ", lado=" + lado + "]";
	}

}//Class Cuadrado
