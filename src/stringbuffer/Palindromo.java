package stringbuffer;

public class Palindromo {

	public static void main(String[] args) {

		StringBuffer str = new StringBuffer("1001");

		StringBuffer contraria = str.reverse();
		
		if(str.equals(contraria))
		{
			System.out.println(str + " é um palindromo");
		}
		else
		{
			System.out.println(str + "Não é palindromo");
		}
	}

}
