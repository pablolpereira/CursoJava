package fundamentos;

public class ConversaoNumerica {
     public static void main(String[] args) {
		//Exemplo 1 - Convers�o Explicita onde � obrigado converter e estou ciente
    	 float f = (float) 0.1; //Eu tenho um double 0.1 e estou convertendo para float 
    	 System.out.println(f);
    	 
    	 
    	 //Exemplo2 - Conversao explicita 
    	 int i1 = (int) 7.9;
    	 System.out.println(i1);
    	 
    	 //Exmeplo3 - Convers�o implicita
    	 int i2 = 'a';
    	 System.out.println(i2);
    	 
    	 //Exemplo4 = Convers�o implicita
    	 double d = 1001 ;    
    	 System.out.println(d);	 
       
	}
}