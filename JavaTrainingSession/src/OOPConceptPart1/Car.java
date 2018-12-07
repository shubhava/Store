package OOPConceptPart1;

public class Car extends FunctionsInJava {

	//Class variables
	
	 int Resource;   // Class variables or global variables
	int Manager;    // Copy of These two variables to each object
	double d=10.50;
	char c ;
	static int maza=10;
	
	public static void main(String[] args) {
		
		Car VFIE=new Car(); //// new Car() represents Object & VFIE is referring this object and one object 'VFIE' will be created inside java memory
		Car D2=new Car();
		
	    Car VFIT=new Car();
	    
	    
	    VFIE.Resource=20; // Each object will be given copy of the Variables and will store different values for each object type
	    VFIE.Manager=4;   // VFIE , D2 ,VFIT is the object Reference name not a Object
	    VFIE.d=10.50;
	    VFIE.c='A';
	   
	     
	    
	    D2.Resource=10;
	    D2.Manager=1;
	    
	    VFIT.Resource=6;
	    VFIT.Manager=1;
	   
	    System.out.println("Before Assigning the Reference");
	    
	   System.out.println(VFIE.d);
	    
	  
	   System.out.println("After Shifting the Reference");
	   
	   
	   // Lets change the reference variable .. Shifting of variables
	   VFIE=D2; // VFIE will stop referring to Object 1 and will refer second object
	   D2=VFIT; //D2 will stop referring to Object 2 and will refer Third object
	   VFIT=VFIE; // VFIT will stop referring to  object 3 and will refer object 2 as VFIE is referring to Object 2 in first comment
	   //Also, No one will refer Object after this
	   
	   
	VFIE.Resource=10; // Here VFIE is referring to second Object, so the value of Variable Resource in Second Object will be 10
	D2.Resource=40; 
	VFIT.Resource=20; // Since VFIT is also referring to the same object that VFIE is referring, than VFIT will replace the value given in above line
	                   // by VFIE
	
	   System.out.println(VFIE.Resource); // it will print 20 as both the Reference variable is referring to the same Object and second reference variable replaced it
	   System.out.println(VFIT.Resource);
	   System.out.println(D2.Resource);

	   
	}

	public void checksa() {
		
		System.out.println("Child Class Call");
	}
}
