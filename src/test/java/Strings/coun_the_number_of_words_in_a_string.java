package Strings;

public class coun_the_number_of_words_in_a_string {

	public static void main(String[] args) {
		String input = "Test Java Automation Java Automation";

		String[] s = input.split(" ");

		System.out.println(s.length);
		
		
		// with out split
		int c = 0;
		for (int i = 0; i < input.length(); i++) {
			if ((i == 0 && input.charAt(i) != ' ') || (input.charAt(i) != ' ') && input.charAt(i - 1) == ' ') {
				c++;
			}

		}
		System.out.println(c);
	}

}
