package Strings;

import java.util.Stack;

public class RemoveDuplicatesInSTACK {

	public static void main(String[] args) {
		String str = "abbaca"; // ca

		Stack<Character> s = new Stack<>();

		for (char c : str.toCharArray()) {

			if (!s.isEmpty() && s.peek() == c) {
				s.pop();
			} else {
				s.push(c);
			}

		}

		StringBuilder sb = new StringBuilder();

		for (char r : s) {
			sb.append(r);
		}

		System.out.println(sb);

	}

}
