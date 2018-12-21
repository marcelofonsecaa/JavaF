package flow;

import java.util.Scanner;

public class ex8 {
	public static void main(String [] args)
	{
		//instanciar o scanner
		Scanner console = new Scanner(System.in);
		//imprime a mensagem para o usuário saber quando digitar
		System.out.print("Digite a inicial da cor: ");
		//recupera a msg do usuário
		String letra = console.nextLine();
		//pula linha
		System.out.print("\n");
		
		letra= letra.toUpperCase();
		
		switch (letra) {
		case "R":
			System.out.print(letra + "->Red");			
			break;
		case "B":
			System.out.print(letra + "->Blue");
			break;
		case "G":
			System.out.print(letra + "->Green");
			break;
		case "O":
			System.out.print(letra + "->Orange");
			break;
		case "Y":
			System.out.print(letra + "->Yellow");
			break;
		case "W":
			System.out.print(letra + "->White");
			break;
		default:
			System.out.print("Código inválido");
			break;
		}
		console.close();
	}
}
