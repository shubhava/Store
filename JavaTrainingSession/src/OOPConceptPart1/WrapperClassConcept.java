package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
	
		// parse is used to convert one data type to another
		//For Example, in Selenium, we have to pass the value but the page is in text calculation and value is coming in the form of string, so 
		//that time we have to use wrapper class
	 
		
		String x="100";
		System.out.println(x+20);

		int i=Integer.parseInt(x);  // here we are converting String into Integer// Data Conversion from String to Integar
		System.out.println(i);
	
	
		//Integar,Double,Character ,Boolean
		
		//String to double conversion
		
		String y="12.22";
		double d=Double.parseDouble(y);
		System.out.println(d+10);
		
		//String to character: We dont have pareing method
		
		//Double to String
		
		double dd=12.30;
		
		String ss=String.valueOf(dd);
		System.out.println(ss+11.70); // O/P will be 12.311.7
		
		
		
		//String to Booleam
		
		String t="True";
		
		boolean b=Boolean.parseBoolean(t);
		System.out.println(b);
		
		
		//int to String
		
		int j=200;
		
		System.out.println(j+20); // O/P will be 220
		String a=String.valueOf(j);
		System.out.println(a+20); // O/p will be concatenation .i.e. 20020
		
		
	  // String u="100A" ; //here 100A is not a pure numberic value
		
		//Integer.parseInt(u); // will get error "Number format Exception" as it is not a pure numeric value
		
		
		// double to string
		
		
		
		
		
		
		
		
		
	}
	
	

}
