package flow;

public class ex12 {

	public static void main(String[] args) {

		int numero = 13;
		int cont =0;
		
		for (int i = 1; i <= numero; i++) {
			
			if(numero % i == 0)
			{
				cont++;
			}			
		}
		if(cont == 2)
		{
			System.out.println("O número: " + numero + " é primo");
		}
		else
		{
			System.out.println("O número: " + numero + " não é primo");
		}
	}
}
