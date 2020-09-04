package cs233;

public class RoomCarpet {

	
	private RoomDimension size;
	
	private double CarpetCost;
	
	public RoomCarpet(RoomDimension size, double carpetCost) {
		super();
		this.size = size;
		CarpetCost = carpetCost;
	}
	
	public double getTotalCost() {
		return CarpetCost * size.getArea();
	}
	
	
	@Override
	public String toString() {
		return   size + "; The Carpet Cost is: " + CarpetCost +  "; The total cost is: $" + getTotalCost() ;
	}
}
