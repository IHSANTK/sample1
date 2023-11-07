import java.time.DateTimeException;
import java.util.Scanner;

public class Diaryentry {
 static int date;
 static String entrytext;
 static String mood;
 
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	
	 
	try {
		System.out.println("enter a date");
		date=s.nextInt();
		 
		
         if(date>31) {
        	 
         throw new DateTimeException("");
         
         }else {
        	 System.out.println(date);
        	 mood="happy";
        	 System.out.println(mood);
        	 System.out.println("Enter texts");
                entrytext= s.next();
        	
        	System.out.println(entrytext);
        
        	 
         }
     }
     catch (DateTimeException ex) {
         System.out.println("invalid date");
		
     }catch(Exception e){
    	 System.out.println("no date format");
    	 
    
 
   }
  }
}
