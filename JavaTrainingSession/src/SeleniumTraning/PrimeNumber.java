package SeleniumTraning;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	 
		int i;
		int k=0;
		int num;
		boolean b=true;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		num=in.nextInt();
		
		for(i=2;i<num;i++) {
			
			if (num%i==0) 
			{
				
				b=false;
			  break;
			}
		}
			if (b==true) {
				
				System.out.println("The Number is prime");
			}
			
			else {
				System.out.println("Number is not prime");
			}
				
		}
		
	PrimeNumber c= new PrimeNumber() ;
		 

		}
