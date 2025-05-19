package br.edu.FormasGeometricasPlanas;

public class Triangulo {
	    private  double base;
	    private  double altura;
	    private  double area;
	    
	    public Triangulo( ) {
	    	base = 0 ;
	    	altura = 0 ;
	    	area = 0 ;
	  
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
		    	area = (base * altura)/2;
		    }
		public double mostrarArea() {
		System.out.println("A area do Triangulo é: " + area);
		return area;
		    }



		

}
