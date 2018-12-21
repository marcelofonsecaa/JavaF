package array;

public class ex12 {
	public static void main(String[] args) {
		int [] numeros = new int[]{5,20,30,40,100,4,6};
		int soma =0, media =0,  minimo =0, maximo =0;
		
		
		minimo = numeros[0];
		
		for (int i : numeros) {
			soma +=i;
			if(i < minimo)
			{
				minimo = i;
			}
			else if(i > maximo)
			{
				maximo = i;
			}
		}
		
		media = soma/numeros.length;
		
		System.out.println("A soma do array é " + soma);
		System.out.println("A média do array é " + media);
		System.out.println("O menor valor do array é " + minimo);
		System.out.println("O maior valor do array é " + maximo);
	}
}
