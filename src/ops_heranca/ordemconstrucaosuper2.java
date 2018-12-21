package ops_heranca;

class A1{
	A1()
	{
		System.out.println("Sem argumentos A1");
	}
	A1(int a)
	{
		System.out.println("Argumentos A1: " + a);
	}
}
class A2 extends A1{
	A2()
	{
		System.out.println("Sem argumentos A2");
	}
	A2(String x)
	{
		this();
		System.out.println("argumentos A2 " + x);
	}
	A2(int a)
	{
		this("x");
		System.out.println("Argumentos A2: " + a);
	}
}
class A3 extends A2{
	A3()
	{
		System.out.println("Sem argumentos A3");
	}
	A3(int a)
	{
		super(100);
		System.out.println("Argumentos A3: " + a);
	}
}
public class ordemconstrucaosuper2 {
	public static void main(String[] args) {
		A3 a = new A3(1000);
	}

}
