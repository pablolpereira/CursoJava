package fundamentos;

import javax.swing.JOptionPane;
//Covertendo a temperatura Celsius para Fahrenheit
public class ExercicioConceitoBasico_1 {
	public static void main(String[] args) {
		String tempCelsius = JOptionPane.showInputDialog("Qual � a Temperatura em Celsius?");
		Double temFahrenheit = Double.parseDouble(tempCelsius) * 1.8 + 32 ;
		String resultado = temFahrenheit.toString();
		System.out.println(" Temperatura em Fahrenheit: " + resultado);
		
	}

}