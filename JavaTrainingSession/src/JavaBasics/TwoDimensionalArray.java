package JavaBasics;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		Object x [] []= new Object[3][5]; /// Using Object just to put different data types
		
		System.out.println(x.length); // O/P will be 3--> Total no. of rows=3
		
		System.out.println(x[0].length); ///5 will be total no. of columns
		
		System.out.println("*********************");
		
		//1st Row
		x[0][0]="A";
		x[0][1]="1";
		x[0][2]='C';
		x[0][3]="Do not use";
		x[0][4]="12.33";
		
		//2nd Row
		x[1][0]="BC";
		x[1][1]="11";
		x[1][2]='T';
		x[1][3]="Yes use";
		x[1][4]="12.33";
		
		//3rd Row
		x[2][0]="DC";
		x[2][1]="41";
		x[2][2]='Y';
		x[2][3]="use";
		x[2][4]="13.33";
		
		System.out.println(x[2][0]);
		
		System.out.println("***********Loop with Inner Loop**********");
		
		// If we print all the value of 2D Array : use for loop
		
		for ( int row=0;row<x.length;row++)
		{
			for (int col=0;col<x[0].length;col++) /// This loop will executed for all the values of Col and ( row will remain zero ) 
				//will come out of loop conditioning fails and will then check the value in outer loop and will increment the value of row and so  on
				
				
			{
				System.out.println(x[row][col]);
				
			}
				
				
		}

		
	}


}
