package OOPCONCEPTPart2;

public interface USBANK {  // there is no main in interface
	
	int min_bal=100;
	
	public void credit(); // we don't give the method body, we only give prototype method or defination
	
	public void debit();
	
	public void transferMoney();
	
	//Properties of Interface
	//Only method Declaration
	//no method body-only method prototype
	//IN Interface , we can declare the variables , vars are by default static in nature
	//vars value will not be changed
	//no Static Method in Interface
	//we cannot create the object of interface which means Interface is abstract in Nature
	//no main method in interface
	
	

}
