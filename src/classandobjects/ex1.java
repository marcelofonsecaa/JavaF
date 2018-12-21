package classandobjects;

class Box{
	Double width, height, depth;
	Box(Double width, Double height, Double depth)
	{
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	Double calculaVolume()
	{
		Double volume = width * height * depth;
		return volume;
	}
}

public class ex1 {
	public static void main(String[] args) {
		Box box = new Box(5.0,15.0,20.0);
		System.out.println(box.calculaVolume());
	}
}
