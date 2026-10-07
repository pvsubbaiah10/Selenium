package Arrays;

public class SumIntegersOnly {

	public static void main(String[] args) {
		String[] arr = { "10", "20", "#", "30", "@", "5" };

		int sum = 0;

		for (String val : arr) {

			try {
				int num = Integer.parseInt(val);

				sum = sum + num;
			} catch (NumberFormatException e) {

			}

		}
		System.out.println(sum);
		
		
		
		
		//  other one
		
		Object[] a = {10, 20, "#", 30, "@", 5};
		
		int s=0;
		
		for(Object val:a) {
			if(val instanceof Integer) {
				s=s+(Integer)val;
			}
		}
		System.out.println(s);
		
		
		
		// other one 
		
		
		 String input = "10@20#30";
		 
		 String [] num =input.split("[^0-9]+");
		 
		 int summ=0;
		 
		 for(String n:num) {
			 if(!n.isEmpty()) {
				 summ=summ+Integer.parseInt(n);
			 }
		 }
		System.out.println(summ);
	}

}
