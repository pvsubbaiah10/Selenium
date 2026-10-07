package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class UniqueElements {

	public static void main(String[] args) {
		 int[] arr = {1,1,2,2,3,4,5,5,6,6};
		 
		 Map<Integer, Integer>  map =new HashMap<>();

		  for(int n:arr) {
			  map.put(n, map.getOrDefault(n, 0)+1);
		  }
	        List<Integer> result = new ArrayList<>();
	        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
	            if (entry.getValue() == 1) {
	                result.add(entry.getKey());
	            }
	        }

	        System.out.println(result);
	        
	        
	        // another method 
	        List<Integer> res = new ArrayList<>();
	        
	        
	        for(int i=0;i<arr.length;i++) {
	        	
	        	int c=0;
	        	
	        	for(int j=0;j<arr.length;j++) {
	        		
	        		if(arr[i]==arr[j]) {
	        			c++;
	        		}
	        	}
	        	
	        	if(c==1) {
	        		res.add(arr[i]);
	        	}
	        }
	        System.out.println(res);
	        
	}

}
