package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		//Converte numero para string e ve a quantidade de tamanho
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		System.out.println(Integer.toString(num2));
		System.out.println(("  " + num2).length());
		
		
	}

}