
public class Student {
	
		
		
		String name;
		int rollnumber;
		int mark;
		Student(String name,int a,int b){
			this.name=name;
			rollnumber=a;
			mark=b;
			
			
		}
		public static void main(String[] args) {
			
			Student s=new Student("ihsan",1,55);
			s.display();
			Student k=new Student("ashfak",2,50);
			k.display();
			
			
		}
		
		void display() {

			System.out.println("NAME:"+name);
			System.out.println("ROLL NUMBER:"+rollnumber);
			if(mark<50) {
				System.out.println("grade : B");
			}else {
				System.out.println("grade  : A");
				
			}
			System.out.println();
			
		}
		
		
		

	}

