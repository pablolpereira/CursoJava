package fundamentos;

public class OperadoresAritimeticos {
	public static void main(String[] args) {
		int num1 = 3 ; 
		int num2 = 4 ;
		int num3 = 5 ; 
		
		//Opera��es : + - * / %
		
		int soma = num1 + num2 + num3 + 6 ;
		System.out.println(soma);
		System.out.println(num1 - num2 - num3);
		
		//Cuidado com a precedencia, quando usa a soma com multiplica��o ou divis�o
		System.out.println(num1 + num3 * num2 / 2);
		System.out.println((num1 + num3) * num2 / 2);
		
		//Resto da divis�o
		System.out.println(10 % 3); //Resultado 1 
		System.out.println(10 % 2); //Resultado 0
		
	}

}
