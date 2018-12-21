package flow;

public class ex19 {
	public static void main(String[] args) {
		int qtdNumeros = 1;
		int numero = 0;
		while (qtdNumeros <= 5) {
			if (numero % 2 == 0 && numero % 3 == 0 && numero % 5 == 0) {				
				System.out.println(qtdNumeros + "º número " + numero
						+ " divisivel por 2, 3 e 5");
				qtdNumeros++;
			}
			numero++;
		}
	}
}
