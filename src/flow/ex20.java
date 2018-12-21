package flow;

import java.util.Scanner;

public class ex20 {
	public static void main(String[] args) {

		int num1, num2, resultado = 0;
		String op, continuar;

		while (true) {
			// instanciar o scanner
			Scanner console = new Scanner(System.in);
			// imprime a mensagem para o usuário saber quando digitar
			System.out.print("Digite o 1º número: ");
			// recupera a msg do usuário
			num1 = console.nextInt();
			
			System.out.print("Digite o 2º número: ");
			// recupera a msg do usuário
			num2 = console.nextInt();
			
			System.out.print("Digite a operação Add ou Sub ");
			// recupera a msg do usuário
			op = console.next();
			
			// pula linha
			System.out.print("\n");

			if (op.equalsIgnoreCase("add")) {
				resultado = num1 + num2;
			} else if (op.equalsIgnoreCase("sub")) {
				resultado = num1 - num2;
			} else {
				System.out.println("Operação inválida");
			}

			System.out.println("O resultado da operação é " + resultado);

			System.out
					.println("Deseja realizar outra operação? Digite S para continuar e qualquer tecla para sair");
			continuar = console.next();
			if (!continuar.equalsIgnoreCase("s")) {
				break;
			}
			console.close();
		}
	}
}
