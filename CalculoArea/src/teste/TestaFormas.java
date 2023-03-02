package teste;	

import formas.Quadrado;
import formas.Retangulo;
import formas.Trapezio;


public class TestaFormas {

	public static void main(String[] args) {
		
		
		Quadrado quadrado = new Quadrado(6);
		Quadrado quadrado1 = new Quadrado(3.5);

		Trapezio trapezio = new Trapezio(6, 2.5, 9.5);
		
		Retangulo retangulo = new Retangulo(2.5, 3.5);
		Retangulo retangulo1 = new Retangulo(2.5, 6);
		
		System.out.println("Area: "+((quadrado.calculaArea()/2)+(quadrado1.calculaArea()/2)+trapezio.calculaArea()+
				retangulo.calculaArea()+retangulo1.calculaArea()));
		
	}
}
