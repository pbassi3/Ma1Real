package cs233;

public class RoomDimension {

	
	private double length;
	
	private double width;
	
	public RoomDimension(double length, double width) {
		this.length=length;
		this.width=width;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}
	public double getArea() {
		return length * width;
		}

	@Override
	public String toString() {
		return "The length is: " + length + "; The width is: " + width ;
	}

	
	
}
