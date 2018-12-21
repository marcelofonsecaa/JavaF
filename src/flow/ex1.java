package flow;

public class ex1 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		
		if(num > 0){
			System.out.println("O número: "+ num +" é Positivo");
		}
		else if (num < 0 )
		{
			System.out.println("O número: "+ num +" Negativo");
		}
		else if(num == 0)
		{
			System.out.println("O número: "+ num +" Zero");
		}
	}		
}
