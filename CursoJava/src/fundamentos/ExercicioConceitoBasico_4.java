package fundamentos;

import javax.swing.JOptionPane;
//Caluclar o Quadrado de um valor e ao Cubo de um valor

public class ExercicioConceitoBasico_4 {
	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog("Insira um Número: ");
		//Resultado ao Quadrado
		Double resultado1 = Math.pow(Double.parseDouble(valor),2);
		//Resultado ao Cubo
		Double resultado2 = Math.pow(Double.parseDouble(valor),3);
        
		System.out.println("Valor ao Quadrado é: " + resultado1);
		System.out.println("Valor ao Cubo é: " + resultado2);
	}

}
