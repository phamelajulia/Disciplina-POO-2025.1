package br.edu.principal;


import br.edu.figurasgeometricasplanas.*;


public class Principal {

	public static void main(String[] args) {
		Triangulo fg1 = new Triangulo();
		fg1.recebeBase(10);
		fg1.recebeAltura(6);
		fg1.calcArea();
		fg1.mostrarArea();
		double recebaArea = fg1.mostrarAreaComRetorno();
		System.out.println("");
		

		Trapezio fg2 = new Trapezio();
		fg2.baseMaior(9.6);
		fg2.baseMenor(5);
		fg2.recebeAltura(8);
		fg2.calcArea();
		fg2.mostrarArea();
		recebaArea = fg2.mostraAreaComRetorno();
		System.out.println("");
		
		Retangulo fg3 = new Retangulo();
		fg3.recebeBase(4);
		fg3.recebeAltura(9);
		fg3.calcArea();
		fg3.mostraArea();
		recebaArea = fg3.mostrarAreaComRetorno();
		System.out.println("");
		
		Quadrado  fg4 = new Quadrado();
		fg4.recebaLado(8);
		fg4.calcArea();
		fg4.mostrarArea();
		recebaArea = fg4.mostrarAreaComRetorno();
		System.out.println("");
		
		Pentagono fg5 = new Pentagono();
		fg5.recebaLado(5);
		fg5.calcApotema();
		fg5.calcArea();
		fg5.mostrarArea();
		recebaArea = fg5.mostrarAreaComRetorno();
		System.out.println("");
		
		Paralelogramo fg6 = new Paralelogramo();
		fg6.recebaBase(12);
		fg6.recebaAltura(9);
		fg6.calcArea();
		fg6.mostrarArea();
		recebaArea = fg6.mostrarAreaComRetorno();
		System.out.println("");
		

		Losango fg7 = new Losango();
		fg7.recebaBaseMaior(7);
		fg7.recebaBaseMenor(9);
		fg7.calcArea();
		fg7.mostrarArea();
		recebaArea = fg7.mostrarAreaComRetorno();
		System.out.println("");
		
		Hexagono  fg8 = new Hexagono();
		fg8.recebaLado(4);
		fg8.calcArea();
		fg8.mostrarArea();
		recebaArea = fg8.mostrarAreaComRetorno();
		System.out.println("");
		
		
		Circulo  fg9 = new Circulo();
		fg9.recebeRaio(9);
		fg9.calcArea();
		fg9.mostrarArea();
		recebaArea = fg9.mostrarAreaComRetorno();
		System.out.println("");
		
	}
}
		
		
		