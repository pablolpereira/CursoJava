package fundamentos;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;
//Calculando o IMC da pessoa
public class ExecicioConceitoBasico_3 {
	public static void main(String[] args) {
		String peso = JOptionPane.showInputDialog("Qual é o seu peso? ");
		String altura = JOptionPane.showInputDialog("Qual é a sua altura?");
		Double resultadoIMC = Double.parseDouble(peso) / Math.pow(Double.parseDouble(altura),2);
		String resultadoIMCArrendado = new DecimalFormat("0.00").format(resultadoIMC);
		System.out.println("Resultado do Seu IMC: " + resultadoIMCArrendado);
	}
}
