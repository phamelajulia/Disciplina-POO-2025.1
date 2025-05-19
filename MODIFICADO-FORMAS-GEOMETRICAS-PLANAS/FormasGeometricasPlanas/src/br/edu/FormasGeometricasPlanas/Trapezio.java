package br.edu.FormasGeometricasPlanas;

public class Trapezio {
	private double baseMaior;
	private double baseMenor;
	private double altura;
	private double area;
	
	
	public Trapezio() {
		baseMaior = 0;
		baseMenor = 0;
		altura = 0;
		area = 0;
	}
	
	public double getBaseMaior() {
		return baseMaior;

	}
	public void setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}


	public double getBaseMenor() {
		return baseMenor;
	}


	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}


	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getArea() {
		return area;
	}


	public void calcArea() {
		area = ((baseMaior + baseMenor) * altura)/2;
	}
	
	public void mostrarArea() {
		System.out.println("A área do Trapézio é: " + area);
	}
	
	public double mostrarAreaComRetorno() {
		System.out.println(area);
		return area;
		
	}
	
	

}
