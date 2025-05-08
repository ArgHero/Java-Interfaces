package org.generation.classes;

import org.generation.interfaces.FiguraGeometrica;

public class Rombo implements FiguraGeometrica {
	
	private String name;
	private double lado;
	private double diagMay;
	private double diagMen;
	
	public Rombo(String name, double lado, double diagMay, double diagMen) {
		super();
		this.name = name;
		this.lado = lado;
		this.diagMay = diagMay;
		this.diagMen = diagMen;
	}// Constructor()
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getDiagMay() {
		return diagMay;
	}

	public void setDiagMay(double diagMay) {
		this.diagMay = diagMay;
	}

	public double getDiagMen() {
		return diagMen;
	}

	public void setDiagMen(double diagMen) {
		this.diagMen = diagMen;
	}

	@Override
	public String getNombre() {
		return this.getName();
	}

	@Override
	public double calcularArea() {
		return this.getDiagMay()*this.getDiagMen()/2;
	}

	@Override
	public double calcularPerimetro() {
		return 4*this.getLado();
	}

	@Override
	public String toString() {
		return "Rombo [name=" + name + ", lado=" + lado + ", diagMay=" + diagMay + ", diagMen=" + diagMen + "]";
	}

}//Class Rombo
