package day02;

import java.util.ArrayDeque;
import java.util.Deque;

public class Braces {

	public boolean validateBraces(String input) {

		Deque<Character> values = new ArrayDeque<>();
		for (Character c : input.toCharArray()) {
			if (c == '(' || c == '[' || c == '{') {
				values.push(c);
			} else if (!values.isEmpty()) {
				if (c == ')' && values.pop() != '(') {
					return false;
				} else if (c == '}' && values.pop() != '{') {
					return false;
				} else if (c == ']' && values.pop() != '[') {
					return false;
				}
			}
			else {
				return false;
			}
		}
		return values.isEmpty();
	}

	public static void main(String[] args) {

		Braces braces = new Braces();
		System.out.println(braces.validateBraces("(({[]}))"));
		System.out.println(braces.validateBraces("(({[]})){(([]){})}"));
		System.out.println(braces.validateBraces("(({{]][("));
	}
}
