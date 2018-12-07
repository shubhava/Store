package OOPConceptPart1;

public class Practise extends FunctionsInJava {

// for non Static, we object but for static we can call the functions by class name
	 String name="Test";
	 static String nae="Test";
	
	
	public static void main(String[] args) {
		
		FunctionsInJava.Walk();
		
		Practise Value= new Practise();
		
		System.out.println(Value.name);
		
		
		
		System.out.println(Value.OP('T','S'));
		System.out.println(Value.SpeedLimit());
		
	}

	public void speed() {
		
		System.out.println("Speed Up the Car");
	}
	
	public char SpeedLimit() {
		
		char c='A';
		char b='B';
		
	System.out.println(c);
		
		return b;
		
				
	}
	
	public Object Break() {
		
		int e=1;
		double f=12.30;
		
		char g='C';
		
		 Object d=e+f+g;
		return d;
		
	}
	
	
	
	
	public int  IP() {
		
		char i='A';
		char j='B';
		
		int d=i+j;
		
		return d;
		
		
	}
	
	public int OP(char x, char y) {
		
		int d=x+y;
		
		return d;
		
	}
	
}
