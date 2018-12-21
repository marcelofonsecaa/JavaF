package flow;

import java.util.Scanner;

public class ex15 {
	public static void main(String[] argumento) {
		// instanciar o scanner
		Scanner console = new Scanner(System.in);
		// imprime a mensagem para o usuário saber quando digitar
		System.out
				.print("Digite um número: ");
		// recupera a msg do usuário
		String numero = new String(console.nextLine());
		
		// pula linha
		System.out.print("\n");
		
		int soma = 0;

		for (char num : numero.toCharArray()) {
			soma += Integer.parseInt(String.valueOf(num));			
		}
		
		System.out.println("O resultado é: "+ soma);
		console.close();
		
		/*
		 * int [] args = new int [] {1,2,3,4}; int soma=0;
		 * 
		 * for (int i = 0; i < args.length; i++) { soma += args[i]; }
		 * System.out.println("O resultado é: "+ soma);
		 */
	}
}
