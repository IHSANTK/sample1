class Vehicle {
	
	String vehicletype;
	int rentalrate;
	
	void rent(String vehic, int a) {
		
		vehicletype=vehic;
		rentalrate=a*30;
		
		System.out.println("VEHICLE TYPE"+vehicletype);
		System.out.println("VEHICLERENT"+rentalrate);
		
		
		
	}
}

class Car extends Vehicle{
	
	
}
class Motorcycle extends Vehicle{
	
	
}
class Van extends Vehicle{
	
	
}
class Main{
public static void main(String ar[]) {
	Vehicle c=new Car();
	  c.rent("car",500);
	  Vehicle m=new Motorcycle();
	  m.rent("bike",200);
	  Vehicle v=new Van();
	  v.rent("300",300);
	
}
}
