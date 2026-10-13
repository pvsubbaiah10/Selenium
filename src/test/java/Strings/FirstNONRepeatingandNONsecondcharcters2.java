package Strings;

public class FirstNONRepeatingandNONsecondcharcters2 {

	public static void main(String[] args) {
		String s = "Programming";
		int c = 0;

		for (int i = 0; i < s.length(); i++) {
			int count = 0;

			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
				}
			}

			if (count == 1) {
				c++;

				if (c == 2) { // if you want third non repeating use 3
					System.out.println(s.charAt(i));
					return;
				}
			}
		}
	}

}
