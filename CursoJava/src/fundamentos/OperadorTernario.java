package fundamentos;

public class OperadorTernario {
	public static void main(String[] args) {
		double nota = 7.5;
		//Se a nota for maior que 7, recebe aprovado, senao Recuperação
		String resultado = nota > 7 ? "Aprovado" : "Recuperação";
		
		System.out.println(resultado);
	}

}
