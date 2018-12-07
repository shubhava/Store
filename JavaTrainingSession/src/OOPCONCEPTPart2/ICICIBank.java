package OOPCONCEPTPart2;

public class ICICIBank implements USBANK {

	public static void main(String[] args)
	{
	
	ICICIBank ic=new ICICIBank();
	ic.transferMoney();
	ic.marriageloan();
	
	//dynamic polymorphism-->Run time
	
	USBANK us=new ICICIBank();
	us.credit();

	}

	public void credit()
	{
		System.out.println("ICICI-->Credit");
	}
	
	public void debit()
	{
	System.out.println("ICICI-->Debit");
	}
	
	public void transferMoney()
	{
	System.out.println("ICICI-->Transfer Money");	
	}
	
	public void marriageloan()
	{
	System.out.println("ICICI-->Own");	
	}
	
}
