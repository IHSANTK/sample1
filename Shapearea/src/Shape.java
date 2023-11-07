

 abstract class Shape {
	
	abstract void calculatearea();     
	

}

 class Circle extends Shape {
		void calculatearea() {

			int radius=10;
			double area= 3.14*radius*radius;
			 System.out.println("area of circle :"+area);
			 
		}
 
 }
	
class Rectangle   extends Shape  {
	
	
	   void calculatearea() {
		   
		   int length=10;
		   double width=5.5;
		  double area=length*width;
		  System.out.println("area of Rectangle:"+area);
			 
			 
		 }

	}
class Triangle  extends Shape {
	
	
    void calculatearea() {
		 
    	int higth=20;
    	int base=5;
    	int area= base*higth/2;
    	System.out.println("area of Triangle:"+area);
		 
	 }


}
class Main{
	public static void main(String[] args) {
		
		  Circle c=new Circle();
		  c.calculatearea();
		  Rectangle r=new Rectangle();
		  r.calculatearea();
		 Triangle t=new Triangle();
		   t.calculatearea();
	}
}	
	

