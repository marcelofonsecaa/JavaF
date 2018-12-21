package classandobjects;

public class pacients {
	public static void main(String[] args) {

		String nomePaciente = new String();
		Double imcPaciente = 0.0;
		
		pacient pacient = new pacient("Jéssica", 60.0, 1.65);
		nomePaciente = pacient.getName();
		imcPaciente = pacient.calcularIMC();		
		
		System.out.println("Paciente: " + nomePaciente + "\nIMC: " + imcPaciente);
	}
}
