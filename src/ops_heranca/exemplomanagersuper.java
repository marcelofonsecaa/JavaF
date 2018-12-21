package ops_heranca;

public class exemplomanagersuper {
	public static void main(String[] args) {
		System.out.println("Main");
		System.out.println("Objeto da classe");
		manager mm = new manager(1001, "Jéssica", "Testes");
		System.out.println("Detalhes do Manager");
		mm.display();
		System.out.println("Fim");
	}

}