package flow;

public class ex13 {

	public static void main(String[] args) {
		
		int cont = 0;

		//definir o n�mero
		for (int numero = 10; numero <=99; numero++) {

			//fazer o c�lculo do numero - 1 - numero
			for (int i = 1; i <= numero; i++) {

				
				if (numero % i == 0 &&  i != 1 && i != numero) {
					cont++;
				}
			}
			
			if (cont == 0) {
				System.out.println("O n�mero: " + numero + " � primo");
			}
			cont = 0;
		}
	}
}
