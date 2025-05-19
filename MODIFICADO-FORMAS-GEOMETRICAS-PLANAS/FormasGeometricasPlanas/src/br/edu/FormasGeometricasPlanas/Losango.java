package br.edu.FormasGeometricasPlanas;

public class Losango {
	private double diagMaior;
	private double diagMenor;
	private double area;
	
	
	public Losango() {
		diagMaior = 0;
		diagMenor = 0;
		area = 0;
	}
	
	public double getDiagMaior() {
		return diagMaior;
	}
	public void setDiagMaior(double diagMaior) {
		this.diagMaior = diagMaior;
	}
	public double getDiagMenor() {
		return diagMenor;
	}
	public void setDiagMenor(double diagMenor) {
		this.diagMenor = diagMenor;
	}
	public double getArea() {
		return area;
	}

	public void calcArea() {
		area = (diagMaior * diagMenor)/2;
	}
	
	public void mostrarArea() {
		System.out.println("A área do Losangulo é: " + area);
	}
	
	
	public double mostrarAreaComRetorno () {
		System.out.println(area);
		return area;
	}
}
