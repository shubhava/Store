package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
	
		
		MethodOverloading check=new MethodOverloading();
		
		
		check.sum();
		check.sum(10);
		check.sum(10,20);

	}
	
	public static void main(int i) {  //Main method can also be overloaded
		
		System.out.println("Main Method can be overloaded");
		
	}
	
	
	//Method Overloading is when the method name is same with different arguements or input parameters within the same class
	// We cannot create method inside a method
	// we cannot create duplicate method with same number of arguments or I/P parameters and same parameter type
	
	 public void sum() {  // zero input param // Here SUM is overloaded Method because we have given same Method name with 1 Param, 2 Param & 3 Param.
		 
		 System.out.println("SUM Method--Zero param");
	 }

	 
	 public void sum(int i) { // 1 I/P parameter
		 
		 System.out.println("SUM Method--1 Input Parameter");
		 System.out.println(i);
		 
		 
	 }
	 
	 public void sum(char i) { // 1 I/P parameter with different Parameter type
		 
		 System.out.println("SUM Method--1 input Parameter with different Parameter type");
	 }
	 
	 public void sum (int i, int j) {
		 
		 System.out.println("SUM Method--2 Input parameter");
		 System.out.println(i+j);
		 
	 }
	 
	 
	 
}
