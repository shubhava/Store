package OOPConceptPart1;

public class FunctionsInJava {

	//Main Method--> Starting point of execution
	public static void main(String[] args) {  // Since we never write return statement in side the main method, so we used void
		// Functions and methods are same thing
		// None of the below Methods will be executed as they are out of  main Method.So, in order to Execute we will call them by Shubham in Main Method
		FunctionsInJava Shubham=new FunctionsInJava();
		//After Creating this object,copy of all non static methods will be given to this object
		// Example, FunctionsInJava is my body and my name is obj.Now all the below Methods are different Characteristic of mine.So, in some 
		// case if i want to walk, i will call the method which performs walk
		
	
		//since c will be returned in Talk  MEthod , so this C will be given to Shubham.Talk 
		 int l=Shubham.Talk();
		 
		 System.out.println(l);
		
		Shubham.Walk();
		
		String Se= Shubham.Speak(); //it will go to Speak Method/Function and will execute the code & will return the value to Se
		System.out.println(Se);
		
	

		System.out.println(Shubham.Kick(4, 2));
		
		Car cds=new Car();
		System.out.println("Child Executed");
		cds.checksa();
		
		FunctionsInJava cgss=new Car();
		cgss.Talk();
		
	}
		//Non Static Methods// In order to caLL Non Static Method, we have to use Object
		
		//Return Type=Void which means it does not return anything
		public  static void Walk() {   /// () represents it as a syntax to create a method// Void means does not return any method
			
			System.out.println("Walk Handsome");
		}

		//Return Type is Int
		public int Talk() {
			
			System.out.println("Talk Handsome");  // 1st Type No I/P,No O/P
			
			int a=10;
			int b=20;
			int c=a+b;
			
			return c ;  // If we put void in  Function that means we cannot return a value. So, in order to return we have to remove void from method
			
			// and put the Syntax base on Value we need to return. E.g. here since c is int , so will put int in Function/Method
			
		}
		
		//Return type is String
		public String Speak() {
			
			System.out.println("Speak Method"); // 1st Type No I/P,No O/P
			String S="Selenium";
			return S;  // Since qa method is returning S which is string so will write "String" in function
			
			
		}
		
		// x & y ---> Input parameters/Arguements
		//Return type-->int

		public int Kick( int x, int y) {   // In order to give some input we have to give it between ()
			
			System.out.println("Kick Method");
			int d=x/y;
			return d;
			
			

		
			
		}
	

}
