package com.Student.info;
	
	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.Statement;
	
	public class StudentDao {
	
		public static boolean insertStudent(Student stud) {
			boolean f = false;
			try {
					// connection create
					Connection con = CP.createConnection();
					String q = "insert into student(sname,sphone,scity) values (?,?,?)";
					
					PreparedStatement ps = con.prepareStatement(q);
					ps.setString(1,stud.getStudentName());
					ps.setString(3,stud.getStudentNumber());
					ps.setString(2,stud.getStudentCity());
				
					ps.executeUpdate();
					f = true;
					
					
			}catch(Exception e) {
	
			}
			return f;
		}
	
		public static boolean deleteStudent(int rem) {

		    boolean f = false;

		    try {

		        Connection con = CP.createConnection();

		        // First find the student
		        String q2 = "SELECT * FROM student WHERE sid = ?";

		        PreparedStatement ps1 = con.prepareStatement(q2);
		        ps1.setInt(1, rem);

		        ResultSet rs = ps1.executeQuery();

		        if (rs.next()) {

		            int id1 = rs.getInt("sid");
		            String name1 = rs.getString("sname");
		            String phone1 = rs.getString("sphone");
		            String city1 = rs.getString("scity");

		            // Display student before deleting
		            System.out.println("Student to be deleted:");
		            System.out.println("ID    : " + id1);
		            System.out.println("Name  : " + name1);
		            System.out.println("Phone : " + phone1);
		            System.out.println("City  : " + city1);

		            // Delete student
		            String q = "DELETE FROM student WHERE sid = ?";

		            PreparedStatement ps2 = con.prepareStatement(q);
		            ps2.setInt(1, rem);

		            int rows = ps2.executeUpdate();

		            if (rows > 0) {
		                System.out.println("Student deleted successfully.");
		                f = true;
		            }

		        } else {

		            System.out.println("Student with ID " + rem + " not found.");

		        }

		    } catch (Exception e) {
		        e.printStackTrace();
		    }

		    return f;
		}
	
		public static void displayAll() {
			try {
			Connection con = CP.createConnection();
			String q = "select * from student;";
			Statement result = con.createStatement();
			ResultSet set = result.executeQuery(q);
			while(set.next()) {
				int id = set.getInt(1);
				String name= set.getString(2);
				String phone = set.getString(3);
				String city = set.getString(4);
				
				System.out.println("Id : "+id);
				System.out.println("Name : "+name);
				System.out.println("Phone : "+ phone);
				System.out.println("city  :  "+city);
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			}
			
			
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

		public static boolean UpdateRecord(Student stud) {
			boolean state = false;
			
			try
			{

				Connection con = CP.createConnection();
				String q = "UPDATE student SET sname=?, sphone=?, scity=? WHERE sid=?";
				PreparedStatement ps = con.prepareStatement(q);
				ps.setString(1 ,stud.getStudentName());
				ps.setString(2 ,stud.getStudentNumber());
				ps.setString(3 ,stud.getStudentCity());
				ps.setInt(4 ,stud.getStudentId());
				ps.executeUpdate();
				state = true;
			}catch(Exception r) {
				r.printStackTrace();
			}
		
		
		return state;
		}
		
	
	}
