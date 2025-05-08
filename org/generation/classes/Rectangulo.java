package org.generation.classes;

import org.generation.interfaces.FiguraGeometrica;

public class Rectangulo implements FiguraGeometrica {
	private String name;
	private double base;
	private double altura;
	
	public Rectangulo(String name, double base, double altura) {
		super();
		this.name = name;
		this.base = base;
		this.altura = altura;
	}//Constructor

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}



	@Override
	public String getNombre() {
		
		return this.getName();
	}

	@Override
	public double calcularArea() {
		return this.getBase()*this.getAltura();
	}

	@Override
	public double calcularPerimetro() {
		return 2*this.getBase()+2*this.getAltura();
	}

	@Override
	public String toString() {
		return "Rectangulo [name=" + name + ", base=" + base + ", altura=" + altura + "]";
	}
	

}
