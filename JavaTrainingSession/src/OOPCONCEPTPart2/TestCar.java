package OOPCONCEPTPart2;

public class TestCar {

	public static void main(String[] args) {
		
		//Static Polymerism or Compile Time Polymorphism( because JAVA will decide at the time of Compiling that which Function they need to call)
		//Polymorphism means one to many method..means function with same name exists multiple time
		BMW b;
		b=new BMW();
		b.start();  // whenever a method is common in Child & Parent, Child's method will be given first priority//So the O/P will be BMW-Start
		//So Compiler will say that you already have your own Start Method so why you are trying to access the same method from Parent. 
		//So, dont Inherit this method from parent. So, this method is called Method is called Method Overriding
		
		b.stop();//Since its a child class, so it can access parent class Method's.
		b.theftSafety();//Calling its own method
		b.engine();//BMW is trying to Inherit Engine Method from Grand Parent Class
		
		System.out.println("Car Clas Execution");
		
		Car c=new Car();
		c.start();//Start method from parent class will be called
		c.stop();//Object is executing the method from its own class
		//c.theftsafety();--> Parent Class Object cannot access Child Class method
		
		//--> one object will be created of
		//BMW referred by Parent class Reference Variable and is called Dynamic polymorphism-->Run Time PolyMorphism
		//Top Casting-->Making BMW Class object referred by parent class RV
		Car c1=new BMW();
		c1.start();//Again Overriden Method will be called .i.e.  BMW Start Method
		c1.stop();//Parent class Method will be executed
		//c1.theftsafety();--> Although object is of Child Class but the variable type is of Parent Class
		//So only Overriden methods ( Common Methods ) & Parent Class Method will be called using Dynamic Polymorphism.
		//So we can only access child class Method using Static Polymorphism.
		
		
		//DownCasting
		//BMW b1=new Car(); -->Parent class will not fit into child class reference variable because Parent class does not have all the properties of child class
		//So, we have alternate way mentioned below
		//BMW b1=(BMW) new Car();//after executing, it will give an error at run time .i.e. "ClassCastException"
	
		System.out.println("Practise Work");
		System.out.println("/n");
		
		
		b.start();
		b.automatic();
		b.theftSafety();
		
		Automobile a=new Automobile();
		a.start();
		a.automatic();
		
		Automobile an=new BMW();
		an.automatic();
		an.start();
		b.automatic();//Refer to the diagram in excel, object will call the function of that parent class which will come first from down to up hierarchy
		a.start();
		an.automatic();
		
		Automobile ac=new Car();
		ac.start();
		ac.automatic();
		
		
	}
	
	
	

}
