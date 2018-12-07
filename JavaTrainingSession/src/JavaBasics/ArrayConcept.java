package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		// array: to store similar data type values in a array variable
		// Lower bound/index=0
		//upper bound/index=n-1 ( n is size of array ) \
		// All these are one dimensional Array
		//Disadvantages of 1D Array :
		//1. Size if fixed --> We cannot value more than Size of Array--> To Overcome this problem we use Collections --> Array List,Hash table (Dynamic Array)
		//2.Stores only similar Data Type . For example if we want to store Double Data Type within the Integer Array we cannot. To 
		// Overcome this problem, we use object Array.
		
		int i[] = new int[4];
		
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;

		System.out.println(i[2]);  // 10 will be printed
		
		//System.out.println(i[4]); // will get error "Array Index Out of Bound Exception as the Index does not exist
		
		
		System.out.println(i.length);  // will give length of array
		
		
		// Now if you want to print all the values of Error : Use for Loop
		
		System.out.println("****************");
		
		 for ( int j=0;j<i.length;j++) {
			 System.out.println(i[j]);
		 }
		
		 
		 // Double Array
	
		 System.out.println("****************");
		 
		 double d[]= new double[5]; // Getting the Array values in decrementing form_Done by me :) 
				 
				 d [0]=10.33;
		 d[1]=20.44;
		 d[2]=50.55;
		 d[3]=60.66;
		 d[4]=70.77;
		 
		 for(int k=d.length-1;k>=0;k--)
		 {
			 System.out.println(d[k]);
			 
		 }
			 
		
		 // Char Array ;
		 
		 System.out.println("Character Arra");
		 
		 char c[] = new char[4];
		 
		 c[0]='a';
		 c[1]='b';
		 c[2]='c';
		 c[3]='S';
		 
		 
		
		 
		 System.out.println("****************");
		 
		 for(int s=0;s<c.length;s++)
		 {
			 
			 System.out.println(c[s]);
			 
			 
		 }
			 
	
		 // Boolean Array
		 
		 System.out.println("Boolean Array");
		 
		 boolean T []= new boolean [2];
		 
		 T[0]=true;
		 T[1]=false;
		 
		 for (int u=0;u<T.length;u++)
		 {
			 System.out.println(T[u]); 
			 
		 }
		 
		 
		 /// 5. String Array :
		 
		 String s[]= new String[4];
		 
		 s[0]="Aaram se aana";
		 s[1]="Bhaiya AAp";
		 s[2]="Theek Hain";
		 
		 System.out.println(s[1]);
		 
		 System.out.println("Object Array");
		 
		 System.out.println("              ");
		 
		 /// 6. Object ( Its a Super Class of all the classes & Can be defined as Array)--- It is used to store different Data Types
		 
		 Object z[] = new Object[6];
		 
		 z[0]="tom";
		 z[1]=25;
		 z[2]=12.33;
		 z[3]='M';
		 z[4]="LONDON";
		 z[5]="1/1/1990";
		 
		 for (int x=0;x<z.length;x++) {
		 
		 System.out.println(z[x]);
		 
		 }
		 
		 System.out.println(z.length);
		 
			 
			 	 
		 
	}

}
