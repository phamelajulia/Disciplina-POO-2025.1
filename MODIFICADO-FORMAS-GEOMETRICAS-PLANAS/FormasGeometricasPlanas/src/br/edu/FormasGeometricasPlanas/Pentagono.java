package br.edu.FormasGeometricasPlanas;

public class Pentagono {
	private double lado;
	private double apotema;
	private double area;
	
	
	

	public Pentagono() {
		lado = 0;
		area = 0;
	}
		
		

	
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}


	public double getArea() {
		return area;
	}


	public void calcApotema() {
		apotema = lado / (2 * Math.tan(Math.PI / 5));
	}
	
	public void calcArea() {
		area = (5 * lado * apotema) / 2;
	}
	
	public void mostrarArea() {
		System.out.println("A área do Pentágono é: " + area);
	}
	
	public double mostrarAreaComRetorno () {
		System.out.println(area);
		return area;
	}

}
