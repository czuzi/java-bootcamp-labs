package introexceptiontrycatchtrace;

public class Calculator {
	private void executeOperation(int firstNumber, int secondNumber, String operator) {

		switch (operator) {
			case "+" -> System.out.println(firstNumber + secondNumber);
			case "-" -> System.out.println(firstNumber - secondNumber);
			case "*" -> System.out.println(firstNumber * secondNumber);
			case "/" -> System.out.println(firstNumber / secondNumber);
			default -> System.out.println("invalid operator");
		}
	}
	public void evaluateOperation(int firstNumber, int secondNumber, String operator) {
		try {
			executeOperation(firstNumber, secondNumber, operator);
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
			System.out.println("Invalid operation (divided by zero).");
		}
	}
}
