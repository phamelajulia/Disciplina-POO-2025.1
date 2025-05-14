package br.edu.figurasgeometricasplanas;

public class Circulo {
	private double raio;
	private double area;
	
	

	public Circulo() {
		raio = 0;
		area = 0;
	}
	
	

	public void recebeRaio(double raio) {
		this.raio = raio; 
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

