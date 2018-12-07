package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
	
		// 1. While Loop
		// dis-advantage of while loop is that it will generate infinite loop if you dont give incremental/decremental part
		
		int i=10; // Initialization
		
		while (i>=0)  // conditional
		{
			System.out.println(i);
			
			i=i-1; // incremental/decremental
		}
		
		System.out.println("*******");
		// 1-10 will be printed
		
		
		//2. For Loop:
		// j++ means j=J+1
		
		// initialization, condition & incremental can be defined in a single line
		
		for(int j=1;j<=10;j++) { // initialization, Conditional part & Incremental & Decremental part
			
			System.out.println(j);
			
		
			
		}
		
		System.out.println("*******");
		
		// print 10-1
		
		for ( int k=10;k>=-10 ;k--) {
			
			System.out.println(k);
		}
		
	}

}
