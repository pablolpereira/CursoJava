package fundamentos;

public class OperadoresUnarios {
	public static void main(String[] args) {
		int num1 = 1 ; 
		int num2 = 2 ; 
		
		//incremento e decremento

		//Decremento � pq o sinais vem depois		
		num1++;
		System.out.println(num1); //Resultado 2
		
		//incremento � pq o sinais vem antes da variavel
		--num1;
		System.out.println(num1); //Resultado volta a ser 1
		
		//Resultado da express�o
		System.out.println(++num1 == num2--); //Resultado � verdadeiro porque estou incrementando antes da soma +1 na variavel num1, e a variavel num2 esta decrementando somente depois da compra��o
		System.out.println(num1 == num2);
	}

}
