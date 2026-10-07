package Strings;

public class FirstAndLastNonRepeatingChar {

	public static void main(String[] args) {

		String str = "swissx";

		// First non-repeating character

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				System.out.println("First non-repeating: " + ch);
				break;
			}
		}

		// Last non-repeating character

		for (int i = str.length() - 1; i >= 0; i--) {

			char ch = str.charAt(i);

			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				System.out.println("Last non-repeating: " + ch);
				break;
			}

		}

	}

}
