package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OcuurrenceOfVowelCount {

	public static void main(String[] args) {

		String str = "automation testing";

		int a = 0, e = 0, i = 0, o = 0, u = 0;

		for (char ch : str.toCharArray()) {

			if (ch == 'a') {
				a++;
			} else if (ch == 'e') {
				e++;
			} else if (ch == 'i') {
				i++;
			} else if (ch == 'o') {
				o++;
			} else if (ch == 'u') {
				u++;
			}
		}

		System.out.println("a = " + a);
		System.out.println("e = " + e);
		System.out.println("i = " + i);
		System.out.println("o = " + o);
		System.out.println("u = " + u);

		
		
		System.out.println("------------");
		
		 // another one
		
		String str1 = "Automation Testing";
		
		
		str1=str1.toLowerCase();
		
		String vowels ="aeiou";
		
		Map<Character, Integer> map = new HashMap<>();
		
		
		for (char ch : str1.toCharArray()) {
			
			
			if(vowels.indexOf(ch)!=-1) {
				
				map.put(ch, map.getOrDefault(ch, 0)+1);
				
			}
		
		}
		//System.out.println(map);
		
		
		for(Map.Entry<Character, Integer> m:map.entrySet()){
			System.out.println(m.getKey()+"----"+m.getValue());
		}
		
	}

}
