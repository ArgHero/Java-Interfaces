package org.generation.classes;

import org.generation.interfaces.FiguraGeometrica;

public class Trapecio implements FiguraGeometrica {
	
	String name;
	double bMayor;
	double bMenor;
	double lado;

	public Trapecio(String name, double bMayor, double bMenor, double lado) {
		super();
		this.name = name;
		this.bMayor = bMayor;
		this.bMenor = bMenor;
		this.lado = lado;
	}//Constructor
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getbMayor() {
		return bMayor;
	}

	public void setbMayor(double bMayor) {
		this.bMayor = bMayor;
	}

	public double getbMenor() {
		return bMenor;
	}

	public void setbMenor(double bMenor) {
		this.bMenor = bMenor;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String getNombre() {
		return this.getName();
	}

	@Override
	public double calcularArea() {
		double h = (this.getbMayor()-this.getbMenor())/2;
		h = Math.sqrt(Math.pow(this.getLado(), 2)-Math.pow(h, 2));
		return (h/2)*(this.getbMayor()+this.getbMenor());
	}

	@Override
	public double calcularPerimetro() {
		return this.getbMayor()+this.getbMenor()+2*this.getLado();
	}

	@Override
	public String toString() {
		return "Trapecio [name=" + name + ", bMayor=" + bMayor + ", bMenor=" + bMenor + ", lado=" + lado + "]";
	}

}
