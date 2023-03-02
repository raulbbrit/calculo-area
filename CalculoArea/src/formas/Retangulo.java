package formas;

import interfaces.AreaCalculavel;

public class Retangulo implements AreaCalculavel {

	private double base, altura;

	public Retangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calculaArea() {
		return base*altura;
	}

}
