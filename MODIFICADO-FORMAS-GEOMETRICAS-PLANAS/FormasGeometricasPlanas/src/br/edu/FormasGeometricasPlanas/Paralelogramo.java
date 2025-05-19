package br.edu.FormasGeometricasPlanas;

public class Paralelogramo {
	private double base;
	private double altura;
	private double area;
	
	
	
	public Paralelogramo() {
		base = 0;
		altura = 0;
		area = 0;
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

	public double getArea() {
		return area;
	}


	public void calcArea() {
		area = (base * altura);
	}
	public void mostrarArea () {
		System.out.println("A área do Paralelogramo é: " + area);
	}
	
	public double mostrarAreaComRetorno () {
		System.out.println(area);
		return area;
	}





}
