public class MathToolkit {
	
	
    public static void main(String[] args) {
    	
    	MathToolkit m=new MathToolkit();
    	m.mathoparate(5.5,3);
    	
    	m.mathoparate(15,20);
    	
    	m.mathoparate(50,30);
    	
    	m.mathoparate(100,10);
	}
    void mathoparate(float a,int b,int c){
		
		
		 System.out.print(a+b);
		 System.out.print("Maximum number"+Math.max(a,b));
		 System.out.println("Minimum number"+Math.min(a,b));
	}
   void mathoparate(float a,float b) {
		
	   System.out.print(a*b);
	   System.out.print("Maximum number"+Math.max(a,b));
	   System.out.println("Minimum number"+Math.min(a,b));
	}
   void mathoparate(int a,int b){
	
	  
	   System.out.print(a-b);
	   System.out.print("Maximum number"+Math.max(a,b));
	   System.out.println("Minimum number"+Math.min(a,b));
   }
 
   void mathoparate(double a,double b){
		
	   
	   System.out.print(a/b);
	   System.out.print("Maximum number"+Math.max(a,b));
	   System.out.println("Minimum number"+Math.min(a,b));
 }
}
