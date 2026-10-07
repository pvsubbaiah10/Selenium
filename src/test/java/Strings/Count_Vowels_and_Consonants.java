package Strings;

public class Count_Vowels_and_Consonants {

	public static void main(String[] args) {
		String str = "Hello World";

		int v = 0, c = 0;

		str = str.toLowerCase();

		for (char ch : str.toCharArray()) {

			if (ch >= 'a' && ch <= 'z') {

				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					v++;
				} else {
					c++;

				}
			}

		}
		
		System.out.println("Vowels : " + v);
		System.out.println("Consonants : " + c);
	}

}
