package fundamentos;

public class OperadoresUnarios {
	public static void main(String[] args) {
		int num1 = 1 ; 
		int num2 = 2 ; 
		
		//incremento e decremento

		//Decremento é pq o sinais vem depois		
		num1++;
		System.out.println(num1); //Resultado 2
		
		//incremento é pq o sinais vem antes da variavel
		--num1;
		System.out.println(num1); //Resultado volta a ser 1
		
		//Resultado da expressão
		System.out.println(++num1 == num2--); //Resultado é verdadeiro porque estou incrementando antes da soma +1 na variavel num1, e a variavel num2 esta decrementando somente depois da compração
		System.out.println(num1 == num2);
	}

}
