package array;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		int[] numeros = new int[] { 5, 20, 30, 40, 100, 4, 6 };
		
		// instanciar o scanner
				Scanner console = new Scanner(System.in);
				// imprime a mensagem para o usu�rio saber quando digitar
				System.out.print("Digite um n�mero para localizar no array");
				// recupera a msg do usu�rio
				int numero = console.nextInt();
				console.close();
				// pula linha
				System.out.print("\n");
				
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[1] == numero)
			{
				System.out.println("Index: " + i);
			}
			else
			{
				System.out.println("N�o encontrado: -1");
			}
		}

	}
}
