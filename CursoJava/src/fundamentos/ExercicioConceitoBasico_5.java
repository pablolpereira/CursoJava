package fundamentos;

import javax.swing.JOptionPane;

//Calcular a area de um triangulo
public class ExercicioConceitoBasico_5 {
	public static void main(String[] args) {
		String ValorBase = JOptionPane.showInputDialog("Qual � o tamanho da base do Triangulo? em Metros");
		String ValorAltura = JOptionPane.showInputDialog("Qual � o tamanoa da altura do Triangulo? em Metros ");
		Double ResultadoArea = Double.parseDouble(ValorBase)*Double.parseDouble(ValorAltura)/2;
		System.out.println("Area do Triangulo: " + ResultadoArea);
	}
}