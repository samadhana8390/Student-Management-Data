package App;
import java.util.Scanner;

import Dao.StudentDaoImp;
import Model.Student;
import sevices.StudentSevices;
import utility.DButility;

public class app 
{

	public static void main(String[] args)
	{
		StudentSevices s=new StudentSevices();
		StudentDaoImp st=new StudentDaoImp();
		Scanner sc = DButility.getScanner();
		
		int choise=0;
		String ch="Y";
		do
		{
			System.out.println(" Add element               = 1");
			System.out.println(" Dispaly all informestion  = 2");
			System.out.println(" remove element            = 3");
			System.out.println(" serch sp student          = 4");
			
			System.out.println("+++++++++ Enter your choise +++++++++ ");
			choise=sc.nextInt();
			
			
			switch(choise)
			{
				case 1:
					
					Student c=s.getData();
					st.insertStudent(c);
					
					break;
					
				case 2:
					
					 st.display();
					break;
					
					
				case 3:	
					int id=s.getremove();
					st.remove(id);
					
					
						break;
				case 4:
						String name=s.getsarch();
						st.sarch(name);
					
						break;
			}
			
			System.out.println("+++++ do you whant to continuse Y/N +++++++");
		ch=sc.next();
		}
		while(ch!="N");
		
	}
}
