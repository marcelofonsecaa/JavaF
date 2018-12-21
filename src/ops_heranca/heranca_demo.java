package ops_heranca;

public class heranca_demo {
	public static void main(String[] args) {
		heranca_a s1 = new heranca_a();
		heranca_b s2 = new heranca_b();
		
		s1.m = 10;
		s1.n = 20;
		
		System.out.println("Objeto A");
		s1.display1();
		
		s2.m =7;
		s2.n =8;
		s2.c =9;
		
		System.out.println("Objeto B");
		s2.display1();
		s2.display2();
		
		System.out.println("Soma de m, n e c no objeto B é:");
		s2.sum();
	}
}
