package flow;

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		// instanciar o scanner
		Scanner console = new Scanner(System.in);
		// imprime a mensagem para o usu�rio saber quando digitar
		System.out.print("Digite um n�mero para descobrir se o mesmo � primo ou n�o: ");
		// recupera a msg do usu�rio
		int numero = console.nextInt();
		// pula linha
		System.out.print("\n");
		
		int cont =0;
		
		for (int i = 1; i <= numero; i++) {
			
			if(numero % i == 0)
			{
				cont++;
			}			
		}
		if(cont == 2)
		{
			System.out.println("O n�mero: " + numero + " � primo");
		}
		else
		{
			System.out.println("O n�mero: " + numero + " n�o � primo");
		}
		console.close();
	}
}
