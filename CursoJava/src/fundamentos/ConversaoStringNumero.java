package fundamentos;

import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthSeparatorUI;

public class ConversaoStringNumero {
	
	public static void main(String[] args) {
		String resposta1 = JOptionPane.showInputDialog("Qual � a nota 1?");
		String resposta2 = JOptionPane.showInputDialog("Qual � a nota 2?");
		
		System.out.println("Nota1: " + resposta1+ "\n" +  "Nota2: " + resposta2);
		//Converter string em double
		//Repara que foi usado o Double com D maisculo para usar fun��o do objeto
		double note1 = Double.parseDouble(resposta1);
		double note2 = Double.parseDouble(resposta2);
		double total = note1 + note2 ;
		
		//Imprimir a media
		System.out.println("Media das Notas: " + total / 2);
		
		 
	}

}
