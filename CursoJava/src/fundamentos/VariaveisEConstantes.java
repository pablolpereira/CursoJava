package fundamentos;

public class VariaveisEConstantes {
	public static void main(String[] args) {
		double raio = 4.5;
		final double PI = 3.1416;
		double area = PI * raio * raio;
		
		System.out.println("Area � " + area + " m2.");
		
		//Usando o printf o valor f � substituida pela variavel area
		System.out.printf("Area %f � m2. \n" , area);
		
		//o valor 2f arredando o valor decimal
		System.out.printf("Area %.2f � m2. " , area);
	}

}
