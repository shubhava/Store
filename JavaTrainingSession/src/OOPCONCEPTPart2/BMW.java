package OOPCONCEPTPart2;

public class BMW extends Car { //BMW now became the child class of BMW
	//When same method is present in parent class & child class with same name and same number of arguements, it is called Method overidding
	public void start() {//Overridden Method
		System.out.println("BMW--Start");
	}
	
	public void theftSafety() {
		System.out.println("BMW--TheftSafety");
	}

}
