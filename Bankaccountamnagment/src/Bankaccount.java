
public class Bankaccount {
	private int accountnumber=1012345;
	private int balance;
	private String ownername="Ihsan";
	  int dep1=0;
  String  getter() {
	 
	 return ownername;
	
 }
  public int getter2() {
	  
	  return accountnumber;
  }
   public int setter(int dep) {
	   
	   
	   balance+=dep;
	   return balance;
   }
  public int witdraw(int widraw) {
	   
     balance-=widraw;
     return balance;
	 
	 
 }
 public static void main(String[] args) {
	 
	 
	 Bankaccount b=new Bankaccount();
	String name=b.getter();
	 System.out.println("ACCOUNT HOLDER: "+name);
	int accno=b.getter2();
	System.out.println("ACCOUNT NUMBER :"+accno+"\n");
	
	System.out.println("Deposit : 1000" );
	 int balance1=b.setter(1000);
	 System.out.println("balance is:"+balance1+"\n");
	 
	 System.out.println("Withdraw : 500");
	 int balance2=b.witdraw(500);
	 System.out.println("balance is:"+balance2+"\n");
	 
	 System.out.println("Deposit : 1000 ");
	 int balance3=b.setter(1000);
	 System.out.println("balance is:"+balance3+"\n");
	 
	 System.out.println("Deposit : 2000 ");
	 int balance4=b.setter(2000);
	 System.out.println("balance is:"+balance4+"\n");
}

}
