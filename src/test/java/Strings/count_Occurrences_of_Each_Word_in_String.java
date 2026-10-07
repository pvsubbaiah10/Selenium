package Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class count_Occurrences_of_Each_Word_in_String {

	public static void main(String[] args) {
		String input = "Test Java Automation Java Automation";
		
		Map<String, Integer> map = new LinkedHashMap<>();
		
		       String[] s=input.toLowerCase().split(" ");
		       
		       for(String word:s) {
		    	   
		    	   map.put(word, map.getOrDefault(word, 0)+1);
		       }
		
		      System.out.println(map);
		       
		       for(Map.Entry<String, Integer> mapkv: map.entrySet()) {
		    	   
		    	   if(mapkv.getValue()>1) {
		    		   System.out.println(mapkv.getKey()+" --> "+mapkv.getValue());
		    	   }
		       }
	}

}
