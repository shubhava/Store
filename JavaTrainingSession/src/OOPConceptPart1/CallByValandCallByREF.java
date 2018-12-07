package OOPConceptPart1;

import JavaBasics.MixMatch;

public class CallByValandCallByREF {

	int p;
	int q;
	static int xy;
 
	
	public  static void main(String[] args) {
		
		CallByValandCallByREF obj = new CallByValandCallByREF ();
		
		int x=10;
		int y=30;
		
		System.out.println(obj.testsum(x, y));// Here we are giving the copy of x & y to a & b...---> Call by value or pass by value (
		System.out.println(x); // O/P of x remained same which states that initial value remained one
		System.out.println("Call by Value ends here");
		
		System.out.println(xy);
		obj.p=50;
		obj.q=60;
		System.out.println(obj.p);  // We need Object in order to call Non Static Variable in a static function
		System.out.println(obj.q);  // But we can call a static variable in non static function
		
		obj.check();//o/p of global variable will be 50

        System.out.println("Local Decalred Value O/P");
		int q=100;
		int p=200;
		
		System.out.println(p);
		System.out.println(q);
		
		//After Swap
		obj.swap(obj);  // t will be refering to Obj ..Refer to SS in the excel
        System.out.println("After Swap");
        System.out.println(obj.p);
        System.out.println(obj.q);
        System.out.println();
        obj.check();//O/P will be swapper value .i.e. 60
        
        
        CallByValandCallByREF.sne();
        
        sne();
        
        

	}

	
	public int testsum(int a, int b) {
		
		a=50;
		b=70;  // it will not affect anything in x & y
		System.out.println("Call by Value O/P");
		int c=a+b;
		System.out.println(q);
		return c;
		
		
		
	}
	
	//Call by reference // we are passing the value of obj reference
	public void swap(CallByValandCallByREF t) { // making reference variable of class without creating it an object
		
		int temp;
		temp=t.p; // temp=50
		
	    t.p=t.q; // q=60;--> refer to the second diagram in excel
	    t.q=temp; //q=50
	   
	}
	
	public  void check () {
	
		System.out.println(p);// 
		System.out.println(q);  // Global variables can be directly called into any of the class
		xy=10; /// We can access Static Global variable in Non Static Method within same class
		System.out.println(xy);
		
	
	 System.out.println(Car.maza);  //static Variable from other class can be called by class name in different class//
	 
	 Car c=new Car();
	 System.out.println(c.d); // non static variable from other class needs to be called by object
	MixMatch m=new MixMatch(); // here the class is from other package so it will be imported ( you can see at the top of code )
	 Practise p=new Practise();
	 System.out.println(p.name);//calling a non Static variable from another class of same package can be done by creating object of class and then calling the variable
	 System.out.println(Practise.nae);//calling a Static variable from another class of same package can be done using class name
	 System.out.println(MixMatch.tou);//here we are calling a static variable of another class and different package, so we have to make that variable
	 //as public & can call it by Class name only
	 System.out.println(m.to);//here we are calling a static variable of another class and different package, so we have to make that variable
	 //as public & can call it by object name only
		
		
		
	}
	
	public   static void sne() {
		
		System.out.println(xy);

		//System.out.println(p); // We cannot call Non Static Variable in a Static Method ( Other than Main )
		
	}
	
	
	
}
