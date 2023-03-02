package formas;

import interfaces.AreaCalculavel;

public class Trapezio implements AreaCalculavel {
private double b1, b2, altura;
	
	
	public Trapezio(double b1, double b2, double altura) {
		super();
		this.b1 = b1;
		this.b2 = b2;
		this.altura = altura;
	}
	
	@Override
	public double calculaArea() {
		
		return ((b1+b2)*altura)/2;
	}


}
