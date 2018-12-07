package JavaBasics;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {
	
		//++--> Increment
		//-----> Decrement
		
		
		int i=1;
		
		int j=i++;   // post increment--> Gives the value to J first and than increments it
		
		System.out.println(i);
		System.out.println(j);
		
		
		System.out.println("****");
		
		int a=1;
		int b=++a;   // pre-increment ---->  increase the value of a by one and give it to b
		
		System.out.println(a);
		System.out.println(b) ;
		
		
		System.out.println("****");
		
		
		
		int c=3;
		int d=c--; // post increment--> Gives the value to J first and than decrement it
		
		System.out.println(c);
		System.out.println(d);
		
		
		System.out.println("****");
		
		
		int e=3;
		int f=--e; // pre increment--> Decrement the value of a by one and give it to b
		
		System.out.println(e);
		System.out.println(f);
		

	}

}
