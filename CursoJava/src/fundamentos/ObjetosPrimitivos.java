package fundamentos;

public class ObjetosPrimitivos {
	
	public static void main(String[] args) {
		//Quando coloca o primeiro caracter como maiuscula, ele vira objeto e tem funções quando informado o "."
		//Se o primeiro caracter é minusculo , é somente primitivo
		
		Character c = 'a';
		Boolean bo = true  ;
		
		Byte b = 1 ;
		Short s = 2;
		Integer i = 3 ;
		Long l = 4L;
		
		Float f = 5.1f;
		Double d = 6.1;
		
		System.out.println(bo.toString().length());
		System.out.println("true".length());
		
	}

}
