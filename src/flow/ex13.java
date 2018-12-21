package flow;

public class ex13 {

	public static void main(String[] args) {
		
		int cont = 0;

		//definir o número
		for (int numero = 10; numero <=99; numero++) {

			//fazer o cálculo do numero - 1 - numero
			for (int i = 1; i <= numero; i++) {

				
				if (numero % i == 0 &&  i != 1 && i != numero) {
					cont++;
				}
			}
			
			if (cont == 0) {
				System.out.println("O número: " + numero + " é primo");
			}
			cont = 0;
		}
	}
}
