package br.edu.FormasGeometricasPlanas;

public class Circulo {
	private double raio;
	private double area;
	
	

	public Circulo() {
		raio = 0;
		area = 0;
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

    public double getArea() {
		return area;
	}

	public void calcArea() {
		area = Math.PI * raio * raio;
	}
	
	public void mostrarArea() {
		System.out.println("A área do Círculo é: " + area);
	}
	
	public double mostrarAreaComRetorno () {
		System.out.println(area);
		return area;
	}

		
	}

