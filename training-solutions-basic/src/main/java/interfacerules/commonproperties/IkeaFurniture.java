package interfacerules.commonproperties;

public class IkeaFurniture implements Name, Width, Length {

	private String name;
	private double width;
	private double length;

	public IkeaFurniture(String name, double width, double length) {
		this.name = name;
		this.width = width;
		this.length = length;
	}

	@Override
	public double getLength() {
		return length;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getWidth() {
		return width;
	}
}
