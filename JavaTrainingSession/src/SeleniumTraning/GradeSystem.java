package SeleniumTraning;

import java.util.Scanner;

public class GradeSystem {

	public static void main(String[] args) {
		
		int marks ;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Marks");
		marks=in.nextInt();
		
			if(marks<40) 
			{	
			System.out.println("Grade is Poor");	
			}
			
			if(marks>=40 & marks<60) {
				System.out.println("Grade is Average");
			}
			
				if(marks>=60 & marks<80) 
				{
				System.out.println("Grade is Good");
				}
				if(marks>=80 & marks<90) 
				{
					System.out.println("Grade is Very Good");
				}
				
				if(marks>=90)
				{
					System.out.println("Grade is Excellent");
				}
						

	}

}
