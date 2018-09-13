package fundamentos;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

//Converter a temperatura Fahrenheit para celsius e formatando o valor
public class ExercicioConceitoBasico_2 {
	public static void main(String[] args) {
		String tempFahrenheit = JOptionPane.showInputDialog("Qual é a temperatura em Fahrenheit?");
		Double resultado = (Double.parseDouble(tempFahrenheit) - 32) / 1.8 ;
		String resultadoFormatado =  new DecimalFormat("0.00").format(resultado);
		 
		System.out.println("Temperatura em Celsius: " + resultadoFormatado);
		
	}

}
