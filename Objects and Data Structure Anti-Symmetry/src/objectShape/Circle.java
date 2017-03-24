package objectShape;
// object. Behavior is exposed but data is hidden
public class Circle implements IShape{
	private double r;
	
	public Circle(double r) {
		this.r = r;
	}

	@Override
	public double getArea() {
		return Math.PI * r * r;
	}
	
	
}