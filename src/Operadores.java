
public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Concatenação
		String nomeCompleto = "Linguagem " + "Java";
		System.out.println(nomeCompleto);
		
		String concatenacao = "?";
		System.out.println(concatenacao);
		
		concatenacao = 1+1+1+"1";
		System.out.println(concatenacao);
		
		concatenacao = 1+"1"+1+1;
		System.out.println(concatenacao);
		
		concatenacao = "1"+1+1;
		System.out.println(concatenacao);
		
		concatenacao = "1"+(1+1);
		System.out.println(concatenacao);
		
		//Operadores Unários
		int numero = 5;
		System.out.println(numero);
		
		numero = - numero;
		System.out.println(numero);
		
		numero = numero * -1;
		System.out.println(numero);
		
		numero++;
		System.out.println(numero);
		
		System.out.println(++numero);
		
		boolean variavel = true;
		System.out.println(!variavel);

	}

}
