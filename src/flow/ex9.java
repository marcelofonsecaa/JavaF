package flow;

import java.util.Scanner;

public class ex9 {
	public static void main(String [] args)
	{
		//instanciar o scanner
		Scanner console = new Scanner(System.in);
		//imprime a mensagem para o usu�rio saber quando digitar
		System.out.print("Digite o m�s em n�meros: ");
		//recupera a msg do usu�rio
		String numero = console.nextLine();
		//pula linha
		System.out.print("\n");
		
		switch (numero) {
		case "01":
			System.out.print("Janeiro");			
			break;
		case "02":
			System.out.print("Fevereiro");
			break;
		case "03":
			System.out.print("Mar�o");
			break;
		case "04":
			System.out.print("Abril");
			break;
		case "05":
			System.out.print("Maio");
			break;
		case "06":
			System.out.print("Junho");
			break;
		case "07":
			System.out.print("Julho");
			break;
		case "08":
			System.out.print("Agosto");
			break;
		case "09":
			System.out.print("Setembro");
			break;
		case "10":
			System.out.print("Outubro");
			break;
		case "11":
			System.out.print("Novembro");
			break;
		case "12":
			System.out.print("Dezembro");
			break;
			default:
			System.out.print("Por favor digite o m�s em n�meros");
			break;
		}
		console.close();
	}
}
