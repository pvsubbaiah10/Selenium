package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class StringOutput {

	public static void main(String[] args) {

		String str = "aBACbcEDed";

		// using set
		Set<Character> lower = new TreeSet<>();
		Set<Character> upper = new TreeSet<>();

		for (char ch : str.toCharArray()) {

			if (Character.isLowerCase(ch)) {
				lower.add(ch);
			} else {
				upper.add(ch);
			}
		}

		for (char l : lower) {
			System.out.print(l);
		}

		System.out.println();
		for (char u : upper) {
			System.out.print(u);
		}

		System.out.println();
		System.out.println();
		// using stringbuilder

		StringBuilder lowerCase = new StringBuilder();
		StringBuilder upperCase = new StringBuilder();

		for (char ch : str.toCharArray()) {

			if (Character.isLowerCase(ch)) {
				lowerCase.append(ch);
			} else {
				upperCase.append(ch);
			}
		}

		char[] l = lowerCase.toString().toCharArray();
		char[] u = upperCase.toString().toCharArray();

		Arrays.sort(l);
		Arrays.sort(u);

		System.out.println(l);
		System.out.println(u);
	}

}
