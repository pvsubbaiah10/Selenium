package Strings;

public class FirstRepeatingandsecondcharcters {

	public static void main(String[] args) {
		String str = "programming";

		int c = 0;

		for (int i = 0; i < str.length(); i++) {

			for (int j = i + 1; j < str.length(); j++) {

				if (str.charAt(i) == str.charAt(j)) {
					c++;

					if (c == 1) { // if you want second/third enter c ==2 or 3.
						System.out.println(str.charAt(i));
						return;
					}
					break;
				}

			}

		}

	}

}
