package fundamentos;

public class OperadorTernario {
	public static void main(String[] args) {
		double nota = 7.5;
		//Se a nota for maior que 7, recebe aprovado, senao Recupera��o
		String resultado = nota > 7 ? "Aprovado" : "Recupera��o";
		
		System.out.println(resultado);
	}

}
