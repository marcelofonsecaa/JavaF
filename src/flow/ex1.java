package flow;

public class ex1 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		
		if(num > 0){
			System.out.println("O n�mero: "+ num +" � Positivo");
		}
		else if (num < 0 )
		{
			System.out.println("O n�mero: "+ num +" Negativo");
		}
		else if(num == 0)
		{
			System.out.println("O n�mero: "+ num +" Zero");
		}
	}		
}
