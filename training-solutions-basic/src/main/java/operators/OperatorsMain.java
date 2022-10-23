package operators;

public class OperatorsMain {

	public static void main(String[] args) {

		Operators operators = new Operators();

		System.out.println(Integer.toBinaryString(9));
		System.out.println(operators.isEven(9));
		System.out.println(operators.isEven(14));
		System.out.println(operators.getResultOfDivision(16, 5));
		System.out.println(operators.getResultOfDivision(1331, 23));
		System.out.println(operators.isNull(null));
		System.out.println(operators.isNull("null"));
		System.out.println(operators.isEmpty(""));
		System.out.println(operators.isEmpty("empty"));
		System.out.println(operators.isEmpty(null));
	}
}
