package OOPConceptPart1;

public class StaticAndNonStatic {

	
	String s="Text";  // non static global variable
	static int q=10;// static global variable
	
	//global variable: the scope of global variable will be available across all the functions with some conditions ( if static call by class name else by object )
	//we can also call static variables and functions with Object but it is not a good approach//
	public static void main(String[] args) { // Refer the excel for diagram example// Static method and variable are not the part of object
		
		sum();  /// static method's can be called directly in same class & needs to be called by class name in different class
		StaticAndNonStatic.sum(); //static method's can be called by Class name
		
		
		
		System.out.println(q); //static variables can be called directly
		
		StaticAndNonStatic obj=new StaticAndNonStatic();
		
		double  i=obj.division();
	 
	    System.out.println(i);
		
	    int q=50;
		System.out.println(q);//we can also call static variables and functions with Object but it is not a good approach// O/P will be 50 as we declared the 
		// value of global variable to 50
		
		System.out.println(give()); //O/P will be 10,40 as the first we printed the value of global variable in method and than initialized the value
		// to 40 and returned the value to k. But the new value of q will remain defined to that method only
		
		System.out.println(q);//O/P will be again 50 as in the main method we have declared the new value of q to 50
		
		System.out.println(obj.q);//O/P will be 10 as we are calling it by obj and obj will call the initial value of global variable out of main function
		
		String s="New Text";
		
		System.out.println(s); // here we are printing local variable
		
		System.out.println(obj.s);// here we are printing static global variable by object and when we use object that means we are calling variable or method
		//that exists out of main function
		
		obj.sum();
		
		}

	public static void sum() {
		
		System.out.println("SUM is Static Method");
		
	}
	
	public double  division() {
		
		double i =4;
		int j=2;
		
		double k=j/i;
		
		return k;
		
		
	}
	
	public static int give() {
		
		System.out.println(q);
		
		int q=40;
		int k=q;
		
		return k;
		
		
	}
	
	
	
	
}
