package flow;

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		// instanciar o scanner
		Scanner console = new Scanner(System.in);
		// imprime a mensagem para o usuário saber quando digitar
		System.out.print("Digite um número para descobrir se o mesmo é primo ou não: ");
		// recupera a msg do usuário
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
			System.out.println("O número: " + numero + " é primo");
		}
		else
		{
			System.out.println("O número: " + numero + " não é primo");
		}
		console.close();
	}
}
