package ops_heranca;

public class point {
	
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = (x > 79? 79 : (x< 0? 0 : x));
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = (y > 24 ? 24 : (y < 0? 0: y));
	}
	public point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public point() {
	}
	
	

}
