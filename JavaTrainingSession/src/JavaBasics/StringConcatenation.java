package JavaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		
		int i=10;  
		
		double d=12.30;
				
		/* Execution always goes from left to right
		   '+' is concatenation operator
		 */
		
		
		
				String x ="Hello world";
				
				char c='&' ;
				
		
	System.out.println(x+i+d);
	
	System.out.println(x+(i+d)+c);
	
	System.out.println(i+d+x+i+c);
	
	
	System.out.println("Kese ho");  //---> will print it as it is
	
	System.out.println(i);//----> will print whatever is placed inside
	
	
	System.out.print("The value of a is"+10); // print is just to print on the console
	
	System.out.println("The value of sum is"+(i+d));
	
	
	

	
	
	

	}

}
