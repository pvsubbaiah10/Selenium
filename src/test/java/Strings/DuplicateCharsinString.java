package Strings;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateCharsinString {

	public static void main(String[] args) {

		String input = "Programming";

		// using set print only duplicates

		Set<Character> set = new LinkedHashSet<>();
		Set<Character> duplicates = new HashSet<>();

		for (char ch : input.toCharArray()) {
			if (ch == ' ')
				continue;
			if (!set.add(ch)) {
				duplicates.add(ch);
			}

		}

		for (char cc : set) {
			System.out.print(cc + " ");
		}

		System.out.println();
		// System.out.println(set);
		System.out.println(duplicates);

		// without set print only duplicates

		for (int i = 0; i < input.length(); i++) {

			char ch = input.charAt(i);

			if (input.indexOf(ch) != input.lastIndexOf(ch) && input.indexOf(ch) == i) {
				System.out.print(ch+" ");
			}
		}

	}

}
