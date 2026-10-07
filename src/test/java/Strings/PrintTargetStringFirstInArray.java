package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintTargetStringFirstInArray {

	public static void main(String[] args) {
		String[] arr = {"apple","orange","banana"};
		String target = "banana";
		
		
		StringBuilder first =new StringBuilder();
		List<String> list =new ArrayList<>();
		
		
		for(String w:arr) {
			if(w.contains(target)) {
				first.append(w);
			}else {
				list.add(w);
			}
		}
		
		Collections.sort(list);
		
		StringBuilder re=new StringBuilder();
		
		re.append(first);
		
		
		for(String s:list) {
			re.append(" ").append(s);
		}

		System.out.println(re);
		
		// using StringBuilder
		
		/*
		 * String[] arr = {"apple","orange","banana"}; String target = "banana";
		 * 
		 * StringBuilder first = new StringBuilder(); StringBuilder second = new
		 * StringBuilder();
		 * 
		 * Arrays.sort(arr);
		 * 
		 * for(String s : arr){ if(s.equals(target)){ first.append(s).append(" ");
		 * }else{ second.append(s).append(" "); } }
		 * 
		 * System.out.println(first.append(second));
		 */
		
		
	}

}
