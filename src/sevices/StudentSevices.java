package sevices;
import java.util.Scanner;
import Model.Student;
import utility.DButility;
public class StudentSevices 
{
	Scanner sc = DButility.getScanner();
		public Student getData() 
		{
			
			System.out.println("Enter Id");
			int id = sc.nextInt();
			
			System.out.println("Enter Name ...");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.println("Enter Marsk");
			int marks = sc.nextInt();

			return new Student(id, name,marks);

		}
		public int getremove() 
		{	
			System.out.println("enter the Id");
			int idR=sc.nextInt();
			
			return idR;
		}
		
		public String getsarch()
		{
			System.out.println("enter the name");
			String name=sc.next();
			return name;
			
			
		}
}



