package fundamentos;

public class OperadoresLogicos {
	public static void main(String[] args) {
		boolean executouTrabalho1 = false;
		boolean executouTrabalho2 = true ;
		
		boolean comprouSorvete = executouTrabalho1 || executouTrabalho2;
		boolean comprouTv50 = executouTrabalho1 && executouTrabalho2;
		boolean comprouTv32 = executouTrabalho1 ^ executouTrabalho2;
		
		System.out.println("Sorvete: " + comprouSorvete );
		System.out.println("TV50: " + comprouTv50 );
		System.out.println("TV32: " + comprouTv32 );
		
		
		//Operador unario intruso - Negativa
		System.out.println("Fome: " + !comprouSorvete);
		
	}

}