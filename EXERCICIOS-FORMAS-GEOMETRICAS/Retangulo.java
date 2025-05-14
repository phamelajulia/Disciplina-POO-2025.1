package br.edu.figurasgeometricasplanas;

public class Retangulo {
	private double base;
	private double area;
	private double altura;
	
	public Retangulo() {
		base = 0;
		
		area = 0;
	}
public void recebeAltura(double altura) {
	this.altura = altura;
}
public void recebeBase(double base) {
	this.base = base;
}
public void calcArea() {
	area = base * altura;
}
public void mostraArea() {
	System.out.println("A area do Retangulo é: " + area);
}
public double mostrarAreaComRetorno() {
	System.out.println(area);
	return area;
}
}
