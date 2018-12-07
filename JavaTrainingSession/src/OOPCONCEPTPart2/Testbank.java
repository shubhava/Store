package OOPCONCEPTPart2;

public class Testbank {

	public static void main(String[] args) {
		
		//USBANK b=new USBANK();--> we cannot create the object of interface
		//static polymorphism-->compile time morphism
		HSBCBank hs=new HSBCBank();
		hs.transferMoney();
		hs.educationloan();
		hs.mutualfund(); //method overrided from Brazil bank
		
	//dynamic polymorphism
	//child class object can be referred by parent interface RV
		
		USBANK us=new HSBCBank();
		us.credit();
		us.debit();
		//us.educationloan();--Cannot be used as they are not overriden methods
		
	System.out.println(USBANK.min_bal);//since Var are by default static in nature so we need to call them by Class/Interface name & we cannot change the value as well	

		BrazilBank bb=new HSBCBank();
		bb.mutualfund();
	
	}

}
