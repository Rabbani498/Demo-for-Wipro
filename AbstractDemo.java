import java.util.Scanner;

abstract class SemSubjects{
	public void commonSubjects() {
		System.out.println("First year subjects are :Mechanical,Drawing");
	}
	public abstract void displaySubjects();
}

class Electronics extends SemSubjects{
	public void displaySubjects() {
		System.out.println("Subjects are: Network Theory, Degital Electronics, Control Systems");
	}
}

class Computers extends SemSubjects{
	public void displaySubjects() {
		System.out.println("Subjects are: Java, Compiler Design, System Programming...");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Which stream subjects you want to see (ES/CS)");
		String strStream=sc.next();
		
		SemSubjects semObj=null;
		
		if(strStream.equalsIgnoreCase("EC"))
			semObj=new Electronics();
		else if(strStream.equalsIgnoreCase("CS"))
			semObj=new Computers();
		
		semObj.commonSubjects();
		semObj.displaySubjects();

	}

}
