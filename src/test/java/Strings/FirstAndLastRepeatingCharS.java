package Strings;

public class FirstAndLastRepeatingCharS {

	public static void main(String[] args) {

		String str = "programming";

		// First repeating character

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (str.indexOf(ch) != str.lastIndexOf(ch)) {
				System.out.println("First repeating: " + ch);
				break;
			}
		}

		// Last repeating character

		for (int i = str.length() - 1; i >= 0; i--) {

			char ch = str.charAt(i);

			if (str.indexOf(ch) != str.lastIndexOf(ch)) {
				System.out.println("Last repeating: " + ch);
				break;
			}

		}

	}

}
