package flow;

import java.util.Scanner;

public class ex6 {
	final static String interesse_feminino_jovem = "Interesse = 8,2%";
	final static String interesse_feminino_idosa = "Interesse = 7,6%";
	final static String interesse_masculino_jovem = "Interesse = 9,2%";
	final static String interesse_masculino_idoso = "Interesse = 8,3%";

	public static void main(String[] args) {
		System.out
				.println("Programa para indicar interesse a partir do gênero e idade\n");
		Scanner console = new Scanner(System.in);

		System.out.print("Digite f para femino ou m para masculino: ");
		String genero = console.nextLine();

		System.out.print("Digite a sua idade de 1 a 120: ");
		int idade = console.nextInt();

		if (genero.equals("f")) {
			if (idade >= 1 && idade <= 58) {
				System.out.println(interesse_feminino_jovem);
			} else if (idade >= 59 && idade <= 120) {
				System.out.println(interesse_feminino_idosa);
			} else {
				System.out.println("Idade fora do tamanho da validação");
			}

		} else if (genero.equals("m")) {
			if (idade >= 1 && idade <= 60) {
				System.out.println(interesse_masculino_jovem);
			} else if (idade >= 61 && idade <= 120) {
				System.out.println(interesse_masculino_idoso);
			} else {
				System.out.println("Idade fora do tamanho padrão");
			}
		} else {
			System.out.println("Gênero inválido");
		}
		console.close();
	}
}
