package flow;

import java.util.Scanner;

public class ex20 {
	public static void main(String[] args) {

		int num1, num2, resultado = 0;
		String op, continuar;

		while (true) {
			// instanciar o scanner
			Scanner console = new Scanner(System.in);
			// imprime a mensagem para o usu�rio saber quando digitar
			System.out.print("Digite o 1� n�mero: ");
			// recupera a msg do usu�rio
			num1 = console.nextInt();
			
			System.out.print("Digite o 2� n�mero: ");
			// recupera a msg do usu�rio
			num2 = console.nextInt();
			
			System.out.print("Digite a opera��o Add ou Sub ");
			// recupera a msg do usu�rio
			op = console.next();
			
			// pula linha
			System.out.print("\n");

			if (op.equalsIgnoreCase("add")) {
				resultado = num1 + num2;
			} else if (op.equalsIgnoreCase("sub")) {
				resultado = num1 - num2;
			} else {
				System.out.println("Opera��o inv�lida");
			}

			System.out.println("O resultado da opera��o � " + resultado);

			System.out
					.println("Deseja realizar outra opera��o? Digite S para continuar e qualquer tecla para sair");
			continuar = console.next();
			if (!continuar.equalsIgnoreCase("s")) {
				break;
			}
			console.close();
		}
	}
}
