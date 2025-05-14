package br.edu.figurasgeometricasplanas;

public class Trapezio {
	private double baseMaior;
	private double  baseMenor;
	private double   altura;
	private double   area;
	
	public Trapezio() {
	   baseMaior = 0;
	   baseMenor = 0;
	   altura = 0;
	   area = 0;
	}
    public void recebeAltura(double altura) {
	  this.altura = altura;  
    }
    public void baseMenor(double pBaseMenor) {
    	baseMenor = pBaseMenor;
    }
    public void baseMaior(double pBaseMaior) {
    	baseMenor = pBaseMaior;
    }
    public void calcArea() {
    	area = ((baseMaior + baseMenor)* altura)/2;
    }
    public void mostrarArea() {
    	System.out.println("A area do Trapezio é: " + area);
    }
    public double mostraAreaComRetorno() {
    	System.out.println(area);
    	return area;
    }
}
