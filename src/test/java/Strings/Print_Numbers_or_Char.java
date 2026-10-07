package Strings;

public class Print_Numbers_or_Char {

	public static void main(String[] args) {

		String s = "ABC@123#ED$([.";

		// PRINT ONLY NUMBERS

		for (char ch : s.toCharArray()) {
			if (Character.isDigit(ch)) {
				System.out.print(ch);
			}
		}

		// String numbers = s.replaceAll("[^0-9]", "");
		System.out.println();

		// PRINT special chars
		String special = s.replaceAll("[a-zA-Z0-9]", "");
		// System.out.println(special);

		for (char c : s.toCharArray()) {
			if (!Character.isLetterOrDigit(c)) {
				System.out.print(c);
			}
		}
		System.out.println();
		
		// print chars

		String chars = s.replaceAll("[^a-zA-Z]", "");
		// System.out.println(chars);

		for (char c : s.toCharArray()) {
			if (Character.isLetter(c)) {
				System.out.print(c);
			}
		}

		// separateAlphaAndNumeric
		
		System.out.println();

		System.out.println("---------  separateAlphaAndNumeric  --------");

		String str = "Subbu123raj";

		StringBuilder alphaPart = new StringBuilder();
		StringBuilder numericPart = new StringBuilder();

		for (char c : str.toCharArray()) {
			if (Character.isLetter(c)) {
				alphaPart.append(c);

			} else if (Character.isDigit(c)) {
				numericPart.append(c);
			}
		}
		
		System.out.println(alphaPart);
		System.out.println(numericPart);

	}

}
