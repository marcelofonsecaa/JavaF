package classandobjects;

public class pacient {
	
	private String name;
	private Double weight, height;
	
	public pacient(String name, Double weight, Double height) {
		this.name = name;
		this.weight = weight;
		this.height = height;
	}
	public Double calcularIMC()
	{
		Double imc;
		imc = weight / (Math.pow(height, 2));
		return imc;
	}
	public String getName()
	{
		return name;
	}
}
