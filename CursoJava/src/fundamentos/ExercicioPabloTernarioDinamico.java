package fundamentos;

import javax.swing.JOptionPane;

public class ExercicioPabloTernarioDinamico {
	public static void main(String[] args) {
		String nota = JOptionPane.showInputDialog("Qual é a Nota ? ");
		String resultado = Double.parseDouble(nota) > 7 ? "Aprovado" : "Reprovado"; 
				
		System.out.println(resultado);
		
		
	}

}
