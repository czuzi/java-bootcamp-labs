package finalmodifier;

public class PiMain {

	public static void main(String[] args) {

		System.out.println(CircleCalculator.PI);

		CircleCalculator circleCalculator = new CircleCalculator();

		System.out.println(circleCalculator.calculateArea(8));
		System.out.println(circleCalculator.calculatePerimeter(40));

		CylinderCalculator cylinderCalculator = new CylinderCalculator();

		System.out.println(cylinderCalculator.calculateVolume(5, 5));
		System.out.println(cylinderCalculator.calculateSurfaceArea(20, 10));

		CylinderCalculatorBasedOnCircle cylinderCalculatorBasedOnCircle = new CylinderCalculatorBasedOnCircle();

		System.out.println(cylinderCalculatorBasedOnCircle.calculateVolume(10, 20));
		System.out.println(cylinderCalculatorBasedOnCircle.calculateSurfaceArea(10, 20));
	}
}
