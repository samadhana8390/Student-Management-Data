package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Student;
import utility.DButility;

public class StudentDaoImp implements StudentDao 
{

	public boolean insertStudent(Student student) 
	{
		int i = 0;
		try 
		{
			Connection con = DButility.getConnection();
			
			String sql="insert into student1 values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, student.getId());
			ps.setString(2, student.getName());
			ps.setDouble(3, student.getMarks());

			i = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		if (i > 0)
			return true;
		return false;
	}

	
	public boolean display()
	{
		int j;
		Connection con = DButility.getConnection();
		try 
		{
			String sql2="select * from student1";
			 PreparedStatement p=con.prepareStatement(sql2);
				ResultSet rs=p.executeQuery();
		
				System.out.println("id ++++ name ++++ Marks ");
			while (rs.next()) 
			{

				System.out.print(rs.getInt(1)   + "\t");
				System.out.print(rs.getString(2)   + "\t");
				System.out.println(rs.getInt(3)   + "\t");
			}
			rs.close(); 
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}

		return false;
	}
	
	public void remove(int id) 
	{
		int t=0;
		Connection con = DButility.getConnection();
		String sql2="delete from student1 where id=?";
		try 
		{
			PreparedStatement ps2=con.prepareStatement(sql2);
			ps2.setInt(1, id);
			t = ps2.executeUpdate();
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		if(t >0) {
			System.out.println("Deleted");
		}
	}
	public void sarch(String name) 
	{
		int r=0;
		Connection con = DButility.getConnection();
		String sql3="select * from student1 where  name=?";
		PreparedStatement ps3;
		try
		{
			ps3 = con.prepareStatement(sql3);
			ps3.setString(1,name);
			 r= ps3.executeUpdate();
			 ResultSet rs=ps3.executeQuery();
				
				System.out.println("id ++++ name ++++ Marks ");
			while (rs.next()) 
			{

				System.out.print(rs.getInt(1)   + "\t");
				System.out.print(rs.getString(2)   + "\t");
				System.out.println(rs.getInt(3)   + "\t");
			}
			rs.close(); 

			 
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
