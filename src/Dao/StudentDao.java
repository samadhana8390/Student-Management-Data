package Dao;

import Model.Student;

public interface StudentDao 
{
	public boolean insertStudent(Student student);	
	public boolean display();
	public void remove(int i);
	public void sarch(String name);
}

