package OOPCONCEPTPart2;

public class HSBCBank implements USBANK,BrazilBank {// US bank & Brazil Bank is an Interface and HSBC bank is a class
	
	//Error will come as HSBC bank has to adapt all the methods of USBANK..In Short it should follow the rules of US bank
	// if a class is implementing USBank Interface, then its mandatory to define/override all the methods of interface
	//So we are achieving multiple inheritence
	//Also Called Is a Relation
	public void credit()
	{ // the method remains same although does not bother about the logic inside the Method..inshort customer should get credit service
	System.out.println("hsbc---credit");	
	}
	
	public void transferMoney() 
	{	
	System.out.println("HSBC--Debit");
	}

	public void debit()
	{ //if we deleter any of the function it will give error so we need to cover all the method available in US bank	
	System.out.println("hsbc---debit");
	}
	
	public void educationloan()
	{
	System.out.println("Education loan");
	}
	
	public void carloan()
	{
	System.out.println("Car Loan");
	}
	
	
	public void mutualfund() {
		
		System.out.println("HSBC--Brazil Mutual Fund");
	}
	
}

