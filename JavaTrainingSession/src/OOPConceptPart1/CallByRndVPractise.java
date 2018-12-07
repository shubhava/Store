package OOPConceptPart1;

public class CallByRndVPractise {

	int xx=15;
	int yy=25;
	public static void main(String[] args) {
 
   int x=70;
   int y=80;
   
   CallByRndVPractise obj=new CallByRndVPractise();
   
    System.out.println(obj.a(x, y));  // Call by valye 
     Object ob[]= new Object[4];
     
     ob[0]=1;
     ob[1]="a";
     ob[3]=40;
     ob[2]='a';
     
     Object obt[]=new Object[4];
     
     obt[0]=11;
     obt[1]="Changed";
     obt[2]='a';
     obt[3]=40;
   
     ob =obt;  // here the values of ob will be equal to the value of obt
     
     
     for ( int i=0;i<ob.length;i++) {
    	 
    	 System.out.println(ob[i]);  // call by reference 
    }
     
     System.out.println("Before Swapping");
     System.out.println(obj.xx);
     System.out.println(obj.yy);
     obj.ref(obj);
     System.out.println(obj.xx);
     System.out.println(obj.yy);
     
     obj.chk();
     	
		}
		
		public  int a (int b,int c) {	
			 b=50;
			 c=60;
			
			int d=b+c ;
			System.out.println("Call by Value");
			
			return d;
			
		}	
		

		public void ref (CallByRndVPractise re) {
			
			int temp ;
			temp=re.xx ;
			re.xx=re.yy;
            re.yy=temp;
           
            
            System.out.println("Value got swapped");
		}
		
		public  void chk () {
			
			System.out.println(xx);
			System.out.println(yy);
		}
		
		}
