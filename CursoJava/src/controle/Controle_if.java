package controle;

public class Controle_if {
	public static void main(String[] args) {
		double nota = 9.5 ; 
		boolean bomComportamento = false ;
		
		if (nota >= 9 && bomComportamento){
			System.out.println("Quadro de honra!");			
		} else {
			System.out.println("Reprovado");
		}
		
	}

}