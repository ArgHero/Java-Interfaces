package com.generation;

import org.generation.classes.*;
import org.generation.interfaces.FiguraGeometrica;

public class Main {

	public static void main(String[] args) {
		
		Triangulo t1 = new Triangulo("Bermudas", 20, 10, 15);
		Cuadrado c1 = new Cuadrado("Latero", 34.8);
		Rectangulo r1 = new Rectangulo("Cuadra", 12.2, 5.5);
		Rombo ro1 = new Rombo("Rombo", 5, 3, 4);
		Romboide rom1 = new Romboide("Romboide", 10, 3);
		Trapecio tr1 = new Trapecio("Trapecio", 10, 8, 4);

		imprimirCalculos(t1);
		imprimirCalculos(c1);
		imprimirCalculos(r1);
		imprimirCalculos(ro1);
		imprimirCalculos(rom1);
		imprimirCalculos(tr1);
		
	}//main()
	
	public static void imprimirCalculos(FiguraGeometrica t) {
		System.out.println(t);
		System.out.println("+---------------------------+");
		System.out.println("| El área de ["+t.getNombre()+"]");
		System.out.println(String.format("| es %.2fu^2", t.calcularArea()));
		System.out.println("| El perimetro de ["+t.getNombre()+"]");
		System.out.println(String.format("| es %.2fu", t.calcularPerimetro()));
		System.out.println("+---------------------------+");
	}//imprimirCalculos

}
