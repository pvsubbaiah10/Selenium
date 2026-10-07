package Strings;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		String x = "listen";
		String y = "silent";

		x = x.replace(" ", "").toLowerCase();
		y = y.replaceAll(" ", "").toLowerCase();

		if (x.length() != y.length()) {
			System.out.println("Not Anagram");
			return;
		}

		char[] a = x.toCharArray();
		char[] b = y.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);

		if (Arrays.equals(a, b)) {
			System.err.println("Anagram");
		} else {
			System.err.println("Not Anagram");
		}

	}

}
