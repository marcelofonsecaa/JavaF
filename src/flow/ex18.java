package flow;

import java.util.Scanner;

public class ex18 {
	public static void main(String[] args) {
		// instanciar o scanner
		Scanner console = new Scanner(System.in);
		// imprime a mensagem para o usu�rio saber quando digitar
		System.out.print("Digite um n�mero: ");
		// recupera a msg do usu�rio
		String numero = console.nextLine();

		// pula linha
		System.out.print("\n");

		// N�mero em array de char
		char[] numeroArray = numero.toCharArray();
		//contador iniciado no limite do tamanho do array
		int posNumInvertido = numeroArray.length-1;
		//vari�vel para receber cada caractere
		char num;
		//vari�vel para armazenar o resultado
		String numeroInvertido = "";
		
		//enquanto contador maior igual a 0
		while (posNumInvertido >= 0) {
			
			//num recebe as posi��es do array, come�ando da maior para menor
			num = numeroArray[posNumInvertido];
			
			//vari�vel com o valor final recebe cada caractere
			numeroInvertido = numeroInvertido + num;
			
			//decrementa a vari�vel da posi��o
			posNumInvertido--;
		}
		
		//exibe o resultado		
		
		if(numero.equals(numeroInvertido))
		{
			System.out.println(numeroInvertido + " o n�mero � um palindromo");
		}
		else
		{
			System.out.println(numeroInvertido + " o n�mero n�o � um palindromo");
		}
		console.close();
	}

}
