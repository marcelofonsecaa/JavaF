package flow;

import java.util.Scanner;

public class ex16 {
	public static void main(String[] args) {
		// instanciar o scanner
		Scanner console = new Scanner(System.in);
		// imprime a mensagem para o usu�rio saber quando digitar
		System.out.print("Digite um n�mero: ");
		// recupera a msg do usu�rio
		int linhas = console.nextInt();

		// pula linha
		System.out.print("\n");

		for (int i = 0; i < linhas; i++) {
			
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		console.close();
	}

}
