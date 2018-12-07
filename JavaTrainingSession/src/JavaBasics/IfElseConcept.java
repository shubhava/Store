package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {

		int a=30;
		int b=20;
		
		if(b>a) {
			
			System.out.println("b is greater than a");

		}

		else {
			System.out.println("a is greater than b");
		
		}
		
		//comparison operators
		// <> <= >= ==--> is comparison operator !=
		
		int c=40 ;
		
		int d=50;
		
		if ( c==d) {
			System.out.println("c & d are equal");
		}
		
		else {
			System.out.println("c& d are not equal");
		}
		
		
		//write a logic to find out the highest number 
		
		int a1=400;
		int a2=600;
		int a3=900;
		
		//nested if else
		
		if ( a1>a2 & a1>a3)  // false & true=false
		
		{
			System.out.println("a1 is greatest");
		}
		
		else if ( a2>a3) {
			System.out.println("a2 is greatest");
		}
		
		else {
			
			System.out.println("a3 is greatest");
		}
		
	}

}
