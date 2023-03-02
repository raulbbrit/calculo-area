package formas;

import interfaces.AreaCalculavel;

public class Quadrado implements AreaCalculavel {
	private double lado;

	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}

	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return lado*lado;
	}

}
