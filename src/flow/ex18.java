package flow;

import java.util.Scanner;

public class ex18 {
	public static void main(String[] args) {
		// instanciar o scanner
		Scanner console = new Scanner(System.in);
		// imprime a mensagem para o usuário saber quando digitar
		System.out.print("Digite um número: ");
		// recupera a msg do usuário
		String numero = console.nextLine();

		// pula linha
		System.out.print("\n");

		// Número em array de char
		char[] numeroArray = numero.toCharArray();
		//contador iniciado no limite do tamanho do array
		int posNumInvertido = numeroArray.length-1;
		//variável para receber cada caractere
		char num;
		//variável para armazenar o resultado
		String numeroInvertido = "";
		
		//enquanto contador maior igual a 0
		while (posNumInvertido >= 0) {
			
			//num recebe as posições do array, começando da maior para menor
			num = numeroArray[posNumInvertido];
			
			//variável com o valor final recebe cada caractere
			numeroInvertido = numeroInvertido + num;
			
			//decrementa a variável da posição
			posNumInvertido--;
		}
		
		//exibe o resultado		
		
		if(numero.equals(numeroInvertido))
		{
			System.out.println(numeroInvertido + " o número é um palindromo");
		}
		else
		{
			System.out.println(numeroInvertido + " o número não é um palindromo");
		}
		console.close();
	}

}
