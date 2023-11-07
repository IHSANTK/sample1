import java.util.Scanner;

interface Payments {
	 void processPayment(); 
	 
	 void generateReceipt();


}
class Creditcardpament implements Payments{

	
	public void processPayment() {
		
		System.out.println(" Credit payatment processing...");
		
	}

	
	public void generateReceipt() {
		
		System.out.println("Credit Payment done");
	}
	
	
}
class PaypalPayment implements Payments{

	
	public void processPayment() {
		System.out.println("Paypal payment processing...");
		
	}

	
	public void generateReceipt() {
		System.out.println("Paypal Payment Done");
		
		
	}
	
}
class Main{
	

	public static void main(String[] args) {
		
		System.out.println("chooce \n1. creditcardpayment\n2. paypalpayment");
		Scanner s=new Scanner(System.in);
		int chooce=s.nextInt();
		
		 
	if(chooce==1) {
		Creditcardpament c1=new Creditcardpament();
		c1.processPayment();
		c1.generateReceipt();
	}else if(chooce==2) {
	
		PaypalPayment p1=new PaypalPayment();
		p1.processPayment();
		p1.generateReceipt();
		
	}else {
		System.out.println("invalid payment methord ");
	}
	
	}
}
