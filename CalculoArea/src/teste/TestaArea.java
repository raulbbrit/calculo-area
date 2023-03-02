package teste;


import javax.swing.JOptionPane;

import formas.Quadrado;
import formas.Retangulo;

public class TestaArea {

	public static void main(String[] args) {

		Quadrado quadrado = new Quadrado(5);
		Retangulo retangulo = new Retangulo(12, 5);
		
		JOptionPane.showMessageDialog(null, "Área da figura é: "+ (quadrado.calculaArea()+retangulo.calculaArea()));
		
	}
	
}
