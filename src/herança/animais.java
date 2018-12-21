package herança;

public class animais {

	public static void main(String[] args) {
		animal animal = new animal();
		animal.comer();
		animal.dormir();
		
		passaro passaro = new passaro();
		passaro.comer();
		passaro.dormir();
		passaro.voar();
	}
}
