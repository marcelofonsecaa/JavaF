package flow;

import java.util.Scanner;

public class ex7 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Digite a letra: ");
		String letra = console.nextLine();
		System.out.print("\n");
		if(letra.equals(letra.toLowerCase()))
		{
			System.out.println("Letra original: " + letra +"\nLetra Maiúscula: " + letra.toUpperCase());
		}
		else if(letra.equals(letra.toUpperCase()))
		{
			System.out.println("Letra original: " + letra +"\nLetra minúscula: " +letra.toLowerCase());
		}
		console.close();
	}
}
