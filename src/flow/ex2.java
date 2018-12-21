package flow;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		 Scanner console = new Scanner(System.in);
		 System.out.println("Digite um número");
		 int x = console.nextInt();
		 	
		
		if(x % 2 == 1)
		{
			System.out.println("O número: " + x + " é impar");
		}
		else
		{
			System.out.println("O número: " + x + " é par");
		}
		console.close();
	}
	
}