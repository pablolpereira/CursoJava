package fundamentos;

public class TiposPrimetivos {
	public static void main(String[] args) {
		//Tipos Primitivo boolenano
		boolean bo1 = false;
		boolean bo2 = true ;
		System.out.printf("%b  %b\n", bo1 , bo2);
		
		//Tipo primitivo caracter
		char c1 = 'a';
		char c2 = '!';
		char c3 = '\u0050';
		System.out.printf("%c %c %c\n", c1 , c2, c3);
		
		
		//Tipos primitivos Inteiros
		byte b = 127; //Valor maximo para cada tipo primitivo já informado 127, ou seja 128 já passa de 1 byte
		short s = 32767;//Valor maximo para tipo primitivo, ou seja, para o short o valor 32767 é o maximo
		int i = 2_147_483_647;
		long l = 9_223_372_036_854_775_807L;
		System.out.printf("%d %d %d %d\n", b,s,i,l); //Imprimi os numero primitivos inteiros
		//imprimindo os numero em numero binario para ver o tamanho do byte
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(s));
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Long.toBinaryString(l));
		
		//Tipos primitivos reais ( Numero fracionado  ponto flutuante)
		float f = 3.1416f; //tem que colocar o f no final para identificar que é floar, senão ele entende que é double e ocorre erro
		double d = 2.45;
		System.out.printf("%f %f\n" , f , d);
		System.out.printf("%.1f %.2f" , f , d); // escolhendo quantas casas decimais
	}

}

