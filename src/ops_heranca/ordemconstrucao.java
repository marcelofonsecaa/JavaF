 package ops_heranca;

class X{
	X(){
		System.out.println("Construtor X");
	}
}
class Y extends X{
	Y(){
		System.out.println("Construtor Y");
	}
}
class Z extends Y{
	 Z(){
		System.out.println("Construtor Z");
	}
}

public class ordemconstrucao {
	public static void main(String[] args) {
		Z z = new Z();
		System.out.println (z);
	}
}