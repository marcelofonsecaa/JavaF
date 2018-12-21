package stringbuffer;

public class DoubleChar {

	public static void main(String[] args) {
	
	String str1 = new String("Mark");
	String str2 = new String("Kate");
	
	StringBuffer resultado;
	
	str1.charAt(str1.length()-1);
	str2.charAt(0);
	
	if(str1.equalsIgnoreCase(str2))
	{
		resultado = new StringBuffer(str1.substring(0, str1.length()-1));
	}
	
	}
}
