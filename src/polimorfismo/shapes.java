package polimorfismo;

public class shapes {
	public static void main(String[] args) {
		shape c = new circulo();
		c.desenhar();
		c.apagar();
		shape q = new quadrado();
		q.desenhar();
		q.apagar();
		shape t = new triangulo();
		t.desenhar();
		t.apagar();
	}
}
