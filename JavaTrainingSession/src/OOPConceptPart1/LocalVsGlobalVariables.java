package OOPConceptPart1;

public class LocalVsGlobalVariables { 
	
	//Global Variables or class variable & its has global variable
	 String  name="Test";  // Its a Non Static Variable so we have to call them by Object//
	static int age=25;
	
	static String  ucb ;
	
	static int  bcu=0;
	
	
	

	public static void main(String[] args) {
	
		int i=10; // Local variable for Main method can be called directly
		int j=20;
		
		int age=30;
		
	
		LocalVsGlobalVariables check=new LocalVsGlobalVariables();
		LocalVsGlobalVariables retest=new LocalVsGlobalVariables(); //created another object
		 
		
		System.out.println(check.age);
		System.out.println(check.name);  // Calling a Non Static Global variable by object
		
		
		System.out.println(check.name()); // here name () is representing non Static Method/Function
		
		
		LocalVsGlobalVariables.yo();  // Static method being called by Class name
		
		int k=10;
		
		//LocalVsGlobalVariables.bcu //calling static variable by class name
		System.out.println(LocalVsGlobalVariables.bcu);
		
	}

	public int name() {
		
		int i=10;  // Local Variable for SUM Method
		int j=20;
		int age=i+j;
		bcu=bcu+j;
		System.out.println("Print BCU");
		System.out.println(bcu);
		
		return age;  // scope of this age is only local and under this Function
		
		
		
	}
	
	public static void yo() {
		
		System.out.println("Yo Yo Honey Singh");
		
		
	}
	
}
