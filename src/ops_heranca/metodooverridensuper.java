package ops_heranca;

class A {
	void exibeMsg()
	{
		System.out.println("A");
	}
}

class B extends A{
	void exibeMsg()
	{
		super.exibeMsg();
		System.out.println("B");
	}
}

public class metodooverridensuper {
	public static void main(String[] args) {
		B b = new B();
		b.exibeMsg();
	}
}
