package SeleniumTraning;

public class SeleniumTraining {

	public static void main(String[] args) {
		
		int i=1;
		
		do {
			
			System.out.println("Value ofi is ="+i);
		i++;
			
		}
			while (i<=10);
		
		System.out.println("Using While Loop");
		
		int j=10;
		while ( j>=1) {
		System.out.println("The value of j is equal to"+j);
		j--;
		}
		
		
		System.out.println("Using for Concept");
		
		for (int k=1;k<=50;k++)
		{
			if (k>30) 
			{	
				break ;
			}
			else if (k%3==1) 
			{
				continue;
			}
			else
			{
				System.out.println(k);
			}
			
			
		//	System.out.println("The value of K is equal to "+k);
		}

	}
	
	
	
	


}
